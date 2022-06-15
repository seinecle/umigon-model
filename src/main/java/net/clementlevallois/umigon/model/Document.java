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
    private Queue<Category> listCategories;
    private Queue<String> listPositive;
    private Queue<String> listNegative;
    private Category sentiment;
    private String naturalness;
    private Queue<ResultOneHeuristics> resultsHeuristics;
    private boolean isNegative;
    private Category finalNote;
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

    public Queue<Category> getListCategories() {
        if (listCategories == null) {
            listCategories = new ConcurrentLinkedQueue();
        }

        return listCategories;
    }

    public void setListCategories(Queue<Category> listCategories) {
        this.listCategories = listCategories;
    }

    public void addToListCategories(ResultOneHeuristics resultOneHeuristics) {
        if (resultOneHeuristics.getCategory() == null) {
            return;
        }
        if (listCategories == null) {
            listCategories = new ConcurrentLinkedQueue();
        }

        listCategories.add(resultOneHeuristics.getCategory());
        resultsHeuristics.add(resultOneHeuristics);
    }

    public void addToListCategories(Category cat, int indexMatchedTerm, String matchedTerm) {
        ResultOneHeuristics resultOneHeuristics = new ResultOneHeuristics(cat, indexMatchedTerm, matchedTerm);
        if (resultOneHeuristics.getCategory() == null) {
            return;
        }
        if (listCategories == null) {
            listCategories = new ConcurrentLinkedQueue();
        }

        listCategories.add(resultOneHeuristics.getCategory());
        resultsHeuristics.add(resultOneHeuristics);
    }

    public void addSeveralCategories(List<ResultOneHeuristics> resultsHeuristics) {
        if (resultsHeuristics == null) {
            return;
        }
        if (listCategories == null) {
            listCategories = new ConcurrentLinkedQueue();
        }

        for (ResultOneHeuristics cat : resultsHeuristics) {
            this.listCategories.add(cat.getCategory());
        }
        this.resultsHeuristics.addAll(resultsHeuristics);
    }

    public void deleteFromListCategories(Category category) {
        if (listCategories == null) {
            listCategories = new ConcurrentLinkedQueue();
        }
        Iterator<Category> catIt = listCategories.iterator();
        while (catIt.hasNext()) {
            Category existingCategory = catIt.next();
            if (existingCategory.equals(category)) {
                catIt.remove();
            }
        }
    }

    public Category getSentiment() {
        if (listCategories.contains(new Category("12"))) {
            return new Category("12");
        }
        if (listCategories.contains(new Category("11")) || listCategories.contains(new Category("111"))) {
            return new Category("11");
        }
        return new Category("10");
    }

    public boolean isIsPositive() {
        return (listCategories.contains(new Category("11")) || listCategories.contains(new Category("111")));
    }

    public boolean isPromoted() {
        return listCategories.contains(new Category("61")) || listCategories.contains(new Category("611"));
    }

    public void setIsPositive(boolean isPositive) {
        this.isPositive = isPositive;
    }

    public boolean isIsNegative() {
        return listCategories.contains(new Category("12"));
    }

    public void setIsNegative(boolean isNegative) {
        this.isNegative = isNegative;
    }

    public Category getFinalNote() {
        return finalNote;
    }

    public void setFinalNote(List<ResultOneHeuristics> resultsHeuristics) {
        if (resultsHeuristics == null || resultsHeuristics.isEmpty()) {
            return;
        }
        Category category = new Category("10"); // neutral
        int index = -1;
        for (ResultOneHeuristics resultOneHeuristics : resultsHeuristics) {
            int currIndex = resultOneHeuristics.getIndexTermMatched();
            if (currIndex > index) {
                index = currIndex;
                category = resultOneHeuristics.getCategory();
            }
        }

        if (category.equals(new Category("12"))) {
            this.finalNote = category;
        } else if (category.equals(new Category("11"))) {
            this.finalNote = new Category("11");
        }
    }

    public void setSentiment(Category sentiment) {
        this.sentiment = sentiment;
        listCategories.add(sentiment);
    }

    public Queue<ResultOneHeuristics> getCategoriesToIndexWithTerms() {
        return resultsHeuristics;
    }

    public Set<Integer> getAllIndexesForCategory(Category cat) {
        Set<Integer> setIndexes = new HashSet();
        for (ResultOneHeuristics resultOneHeuristics : resultsHeuristics) {
            Category category = resultOneHeuristics.getCategory();
            if (category.equals(cat)) {
                setIndexes.add(resultOneHeuristics.getIndexTermMatched());
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
        Iterator<Category> setCategoriesIterator = listCategories.iterator();
        StringBuilder sb = new StringBuilder();
        Category cat;
        Categories categories = new Categories();
        categories.populate();
        while (setCategoriesIterator.hasNext()) {
            cat = setCategoriesIterator.next();
            sb.append(cat);
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
        if (listCategories.contains(new Category("61")) || listCategories.contains(new Category("611"))) {
            return new Category("61").getDescription();
        } else {
            return "organic";
        }
    }

    public void setNaturalness(String naturalness) {
        this.naturalness = naturalness;
        if (naturalness.equals(new Category("61").getDescription())) {
            listCategories.add(new Category("61"));
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
