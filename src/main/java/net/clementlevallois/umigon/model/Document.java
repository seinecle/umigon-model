package net.clementlevallois.umigon.model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//import Utils.Pair;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.clementlevallois.umigon.model.Category.CategoryEnum;

/**
 *
 * @author C. Levallois
 */
public class Document implements Serializable {

    private String text;
    private String textStripped;
    private String language;
    private List<String> hashtags;
    private Queue<ResultOneHeuristics> resultsHeuristics;
    private List<Decision> sentimentDecisions = new ArrayList();
    private boolean isNegative;
    private boolean isPositive;
    private String sentiment;
    private String naturalness;
    private String id;
    private boolean flaggedAsFalseLabel;
    private String explanationSentiment;

    public Document() {
        resultsHeuristics = new ConcurrentLinkedQueue();
        hashtags = new ArrayList();
    }

    public Document(String text) {
        this.text = text;
        hashtags = new ArrayList();
        resultsHeuristics = new ConcurrentLinkedQueue();
        hashtags = new ArrayList();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextStripped() {
        return textStripped;
    }

    public void setTextStripped(String textStripped) {
        this.textStripped = textStripped;
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

    public Queue<ResultOneHeuristics> getResultsOfHeuristics() {
        return resultsHeuristics;
    }

    public Map<Integer, ResultOneHeuristics> getAllHeuristicsResultsForOneCategory(CategoryEnum catEnum) {
        Map<Integer, ResultOneHeuristics> mapIndices = new HashMap();
        for (ResultOneHeuristics resultOneHeuristics : resultsHeuristics) {
            if (!resultOneHeuristics.getTokenInvestigatedGetsMatched()) {
                continue;
            }
            CategoryEnum categoryEnum = resultOneHeuristics.getCategoryEnum();
            if (categoryEnum.equals(catEnum)) {
                mapIndices.put(resultOneHeuristics.getIndexTokenInvestigated(), resultOneHeuristics);
            }
        }
        return mapIndices;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public List<Decision> getSentimentDecisions() {
        return sentimentDecisions;
    }

    public void setSentimentDecisions(List<Decision> sentimentDecisions) {
        this.sentimentDecisions = sentimentDecisions;
    }

}
