package net.clementlevallois.umigon.model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//import Utils.Pair;
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
public class Document {

    private String text;
    private String language;
    private List<String> hashtags;
    private List<String> mentions;
    private Set<String> allTerms;
    private Set<String> allEmojis;
    private Queue<String> listCategories;
    private Queue<String> listPositive;
    private Queue<String> listNegative;
    private String trainingSetCat;
    private String sentiment;
    private String naturalness;
    private Queue<CategoryAndIndex> mapCategoriesToIndex;
    private boolean isNegative;
    private Integer finalNote;
    private boolean isPositive;
    private int id;

    public Document() {
        listCategories = new ConcurrentLinkedQueue();
        listPositive = new ConcurrentLinkedQueue();
        listNegative = new ConcurrentLinkedQueue();
        mapCategoriesToIndex = new ConcurrentLinkedQueue();
        trainingSetCat = "";
        allTerms = new HashSet();
        allEmojis = new HashSet();
        hashtags = new ArrayList();
        sentiment = "";
    }

    public Document(String text) {
        this.text = text;
        hashtags = new ArrayList();
        mentions = new ArrayList();
        listCategories = new ConcurrentLinkedQueue();
        mapCategoriesToIndex = new ConcurrentLinkedQueue();
        listPositive = new ConcurrentLinkedQueue();
        listNegative = new ConcurrentLinkedQueue();
        allTerms = new HashSet();
        allEmojis = new HashSet();
        hashtags = new ArrayList();
        sentiment = "";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text.intern();
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

    public Queue<String> getListCategories() {
        if (listCategories == null) {
            listCategories = new ConcurrentLinkedQueue();
        }

        return listCategories;
    }

    public void setListCategories(Queue<String> listCategories) {
        this.listCategories = listCategories;
    }

    public String getTrainingSetCat() {
        return trainingSetCat;
    }

    public void setTrainingSetCat(String trainingSetCat) {
        this.trainingSetCat = trainingSetCat;
    }

    public void addToListCategories(String category, Integer indexTermOrig) {
        if (category == null) {
            return;
        }
        if (listCategories == null) {
            listCategories = new ConcurrentLinkedQueue();
        }

        this.listCategories.add(category);
        this.mapCategoriesToIndex.add(new CategoryAndIndex(category, indexTermOrig));
    }

    public void deleteFromListCategories(String category) {
        if (listCategories == null) {
            listCategories = new ConcurrentLinkedQueue();
        }
        Iterator<String> catIt = listCategories.iterator();
        while (catIt.hasNext()) {
            String string = catIt.next();
            if (string.equals(category)) {
                catIt.remove();
            }
        }
    }

    public String getSentiment() {
        return this.sentiment;
    }

    public boolean isIsPositive() {
        return sentiment.equals("positive");
    }

    public boolean isPromoted() {
        return listCategories.contains("061") || listCategories.contains("0611");
    }

    public void setIsPositive(boolean isPositive) {
        this.isPositive = isPositive;
    }

    public boolean isIsNegative() {
        return sentiment.equals("negative");
    }

    public void setIsNegative(boolean isNegative) {
        this.isNegative = isNegative;
    }

    public Integer getFinalNote() {
        return finalNote;
    }

    public void setFinalNote(int finalNote) {
        this.finalNote = finalNote;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    public Queue<CategoryAndIndex> getMapCategoriesToIndex() {
        return mapCategoriesToIndex;
    }

    public Set<Integer> getAllIndexesForCategory(String cat) {
        Set<Integer> setIndexes = new HashSet();
        for (CategoryAndIndex catAndIndex : mapCategoriesToIndex) {
            String category = (String) catAndIndex.getCategory();
            if (category.equals(cat)) {
                setIndexes.add((Integer) catAndIndex.getIndex());
            }
        }
        return setIndexes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getListCategoriesToString() {
        if (listCategories == null) {
            listCategories = new ConcurrentLinkedQueue();
        }
        if (listCategories.isEmpty()) {
            return "NO CATEGORY";
        }
        Iterator<String> setCategoriesIterator = listCategories.iterator();
        StringBuilder sb = new StringBuilder();
        String cat;
        Categories categories = new Categories();
        categories.populate();
        while (setCategoriesIterator.hasNext()) {
            cat = setCategoriesIterator.next();
            sb.append(categories.get(cat));
            sb.append("[");
            sb.append(cat);
            sb.append("]");
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
        if (listCategories.contains("061") || listCategories.contains("0611")) {
            return "promoted";
        } else {
            return "organic";
        }
    }

    public void setNaturalness(String naturalness) {
        this.naturalness = naturalness;
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

    public Set<String> getAllTerms() {
        return allTerms;
    }

    public void setAllTerms(Set<String> allTerms) {
        this.allTerms = allTerms;
    }

    public Set<String> getAllEmojis() {
        return allEmojis;
    }

    public void setAllEmojis(Set<String> allEmojis) {
        this.allEmojis = allEmojis;
    }

}
