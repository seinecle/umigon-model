package net.clementlevallois.umigon.model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//import Utils.Pair;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.clementlevallois.umigon.model.Category.CategoryEnum;

/**
 *
 * @author C. Levallois
 */
public class Document implements Serializable {

    private String text;
    private String language;
    private List<String> hashtags;
    private List<String> mentions;
    private Set<String> allEmojis;
    private Queue<CategoryEnum> listCategories;
    private Queue<String> listPositive;
    private Queue<String> listNegative;
    private CategoryEnum sentiment;
    private String naturalness;
    private Queue<ResultOneHeuristics> resultsHeuristics;
    private boolean isNegative;
    private CategoryEnum finalNote;
    private boolean isPositive;
    private String id;
    private boolean flaggedAsFalseLabel;
    private String explanationSentiment;

    public Document() {
        listCategories = new ConcurrentLinkedQueue();
        listPositive = new ConcurrentLinkedQueue();
        listNegative = new ConcurrentLinkedQueue();
        resultsHeuristics = new ConcurrentLinkedQueue();
        allEmojis = new HashSet();
        hashtags = new ArrayList();
    }

    public Document(String text) {
        this.text = text;
        hashtags = new ArrayList();
        mentions = new ArrayList();
        listCategories = new ConcurrentLinkedQueue();
        resultsHeuristics = new ConcurrentLinkedQueue();
        listPositive = new ConcurrentLinkedQueue();
        listNegative = new ConcurrentLinkedQueue();
        allEmojis = new HashSet();
        hashtags = new ArrayList();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<String> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<String> hashtags) {
        this.hashtags = hashtags;
    }

    public List<String> getMentions() {
        return mentions;
    }

    public void setMentions(List<String> mentions) {
        this.mentions = mentions;
    }

    public Queue<CategoryEnum> getListCategories() {
        if (listCategories == null) {
            listCategories = new ConcurrentLinkedQueue();
        }

        return listCategories;
    }

    public void setListCategories(Queue<CategoryEnum> listCategories) {
        this.listCategories = listCategories;
    }

    public void addToListCategories(ResultOneHeuristics resultOneHeuristics) {
        if (resultOneHeuristics.getCategoryEnum() == null) {
            return;
        }
        if (listCategories == null) {
            listCategories = new ConcurrentLinkedQueue();
        }

        listCategories.add(resultOneHeuristics.getCategoryEnum());
        resultsHeuristics.add(resultOneHeuristics);
    }

    public void addToListCategories(CategoryEnum cat, int indexMatchedTerm, String matchedTerm, TypeOfToken.TypeOfTokenEnum typeOfToken) {
        ResultOneHeuristics resultOneHeuristics = new ResultOneHeuristics(cat, indexMatchedTerm, matchedTerm, typeOfToken);
        if (resultOneHeuristics.getCategoryEnum() == null) {
            return;
        }
        if (listCategories == null) {
            listCategories = new ConcurrentLinkedQueue();
        }

        listCategories.add(resultOneHeuristics.getCategoryEnum());
        resultsHeuristics.add(resultOneHeuristics);
    }

    public void addSeveralCategories(List<ResultOneHeuristics> resultsHeuristics) {
        if (resultsHeuristics == null) {
            return;
        }
        if (listCategories == null) {
            listCategories = new ConcurrentLinkedQueue();
        }

        for (ResultOneHeuristics resultOneHeuristics : resultsHeuristics) {
            this.listCategories.add(resultOneHeuristics.getCategoryEnum());
        }
        this.resultsHeuristics.addAll(resultsHeuristics);
    }

    public void deleteFromListCategories(CategoryEnum categoryEnum) {
        if (listCategories == null) {
            listCategories = new ConcurrentLinkedQueue();
        }
        Iterator<CategoryEnum> catIt = listCategories.iterator();
        while (catIt.hasNext()) {
            CategoryEnum existingCategory = catIt.next();
            if (existingCategory.equals(categoryEnum)) {
                catIt.remove();
            }
        }
    }

    public CategoryEnum getSentiment() {
        if (listCategories.contains(CategoryEnum._12)) {
            return CategoryEnum._12;
        }
        if (listCategories.contains(CategoryEnum._11) || listCategories.contains(CategoryEnum._111)) {
            return CategoryEnum._11;
        }
        return CategoryEnum._10;
    }

    public boolean isIsPositive() {
        return (listCategories.contains(CategoryEnum._11) || listCategories.contains(CategoryEnum._111));
    }

    public boolean isPromoted() {
        return listCategories.contains(CategoryEnum._61) || listCategories.contains(CategoryEnum._611);
    }

    public void setIsPositive(boolean isPositive) {
        this.isPositive = isPositive;
    }

    public boolean isIsNegative() {
        return listCategories.contains(CategoryEnum._12);
    }

    public void setIsNegative(boolean isNegative) {
        this.isNegative = isNegative;
    }

    public CategoryEnum getFinalNote() {
        return finalNote;
    }

    public void setFinalNote(List<ResultOneHeuristics> resultsHeuristics) {
        if (resultsHeuristics == null || resultsHeuristics.isEmpty()) {
            return;
        }
        CategoryEnum categoryEnum = CategoryEnum._10; // neutral
        int index = -1;
        for (ResultOneHeuristics resultOneHeuristics : resultsHeuristics) {
            int currIndex = resultOneHeuristics.getIndexTokenInvestigated();
            if (currIndex > index) {
                index = currIndex;
                categoryEnum = resultOneHeuristics.getCategoryEnum();
            }
        }

        if (categoryEnum.equals(CategoryEnum._12)) {
            this.finalNote = categoryEnum;
        } else if (categoryEnum.equals(CategoryEnum._11)) {
            this.finalNote = CategoryEnum._11;
        }
    }

    public void setSentiment(CategoryEnum sentiment) {
        this.sentiment = sentiment;
        listCategories.add(sentiment);
    }

    public Queue<ResultOneHeuristics> getCategoriesToIndexWithTerms() {
        return resultsHeuristics;
    }

    public Set<Integer> getAllIndexesForCategory(CategoryEnum catEnum) {
        Set<Integer> setIndexes = new HashSet();
        for (ResultOneHeuristics resultOneHeuristics : resultsHeuristics) {
            CategoryEnum categoryEnum = resultOneHeuristics.getCategoryEnum();
            if (categoryEnum.equals(catEnum)) {
                setIndexes.add(resultOneHeuristics.getIndexTokenInvestigated());
            }
        }
        return setIndexes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getListCategoriesToString() {
        if (listCategories == null) {
            listCategories = new ConcurrentLinkedQueue();
        }
        if (listCategories.isEmpty()) {
            return "NO CATEGORY";
        }
        Iterator<CategoryEnum> setCategoriesIterator = listCategories.iterator();
        StringBuilder sb = new StringBuilder();
        CategoryEnum catEnum;
        while (setCategoriesIterator.hasNext()) {
            catEnum = setCategoriesIterator.next();
            sb.append(catEnum);
            sb.append(" -- ");
        }

        return sb.toString();
    }

    public String getTermsWithSentimentToString() {
        Iterator<String> positiveTerms = listPositive.iterator();
        Iterator<String> negativeTerms = listNegative.iterator();
        StringBuilder sb = new StringBuilder();
        String term;
        sb.append("positive terms: ");
        while (positiveTerms.hasNext()) {
            term = positiveTerms.next();
            sb.append("[");
            sb.append(term);
            sb.append("]");
            sb.append(", ");
        }
        sb.append(System.lineSeparator());
        sb.append("negative terms: ");
        while (negativeTerms.hasNext()) {
            term = negativeTerms.next();
            sb.append("[");
            sb.append(term);
            sb.append("]");
            sb.append(", ");
        }
        return sb.toString();
    }

    public void addTermToPositive(String term) {
        listPositive.add(term);
    }

    public void addTermToNegative(String term) {
        listNegative.add(term);
    }

    public String getNaturalness() {
        if (listCategories.contains(CategoryEnum._61) || listCategories.contains(CategoryEnum._611)) {
            return CategoryEnum._61.toString();
        } else {
            return "organic";
        }
    }

    public void setNaturalness(String naturalness) {
        this.naturalness = naturalness;
        if (naturalness.equals(CategoryEnum._61.toString())) {
            listCategories.add(CategoryEnum._61);
        }
    }

    @Override
    public String toString() {
        return "Document{" + "text=" + text + ", setCategories=" + getListCategoriesToString() + '}';
    }

    public Queue<String> getListPositive() {
        return listPositive;
    }

    public void setListPositive(Queue<String> listPositive) {
        this.listPositive = listPositive;
    }

    public Queue<String> getListNegative() {
        return listNegative;
    }

    public void setListNegative(Queue<String> listNegative) {
        this.listNegative = listNegative;
    }

    public Set<String> getAllEmojis() {
        return allEmojis;
    }

    public void setAllEmojis(Set<String> allEmojis) {
        this.allEmojis = allEmojis;
    }

    public boolean isFlaggedAsFalseLabel() {
        return flaggedAsFalseLabel;
    }

    public void setFlaggedAsFalseLabel(boolean flaggedAsFalseLabel) {
        this.flaggedAsFalseLabel = flaggedAsFalseLabel;
    }

    public String getExplanationSentiment() {
        return explanationSentiment;
    }

    public void setExplanationSentiment(String explanationSentiment) {
        this.explanationSentiment = explanationSentiment;
    }
}
