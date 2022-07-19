package net.clementlevallois.umigon.model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//import Utils.Pair;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.clementlevallois.umigon.model.Category.CategoryEnum;

/**
 *
 * @author C. Levallois
 */
public class Document implements Serializable {

    private String text;
    private String textStripped;
    private String language;
    private List<TextFragment> allTextFragments = new ArrayList();
    private List<NGram> ngrams = new ArrayList();
    private List<ResultOneHeuristics> resultsHeuristics = new ArrayList();
    private List<Decision> sentimentDecisions = new ArrayList();
    private String id;
    private boolean flaggedAsFalseLabel;
    private String explanationSentiment;
    private CategoryEnum categorizationResult;

    public Document() {
    }

    public Document(String text) {
        this.text = text;
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

    public List<TextFragment> getAllTextFragments() {
        return allTextFragments;
    }

    public void setAllTextFragments(List<TextFragment> allTextFragments) {
        this.allTextFragments = allTextFragments;
    }

    public List<NGram> getNgrams() {
        return ngrams;
    }

    public void setNgrams(List<NGram> ngrams) {
        this.ngrams = ngrams;
    }

    public List<ResultOneHeuristics> getResultsOfHeuristics() {
        return resultsHeuristics;
    }

    public Set<ResultOneHeuristics> getAllHeuristicsResultsForOneCategory(CategoryEnum catEnum) {
        Set<ResultOneHeuristics> resultsOneHeuristics = new HashSet();
        for (ResultOneHeuristics resultOneHeuristics : resultsHeuristics) {
            CategoryEnum categoryEnum = resultOneHeuristics.getCategoryEnum();
            if (categoryEnum.equals(catEnum)) {
                resultsOneHeuristics.add(resultOneHeuristics);
            }
        }
        return resultsOneHeuristics;
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

    public CategoryEnum getCategorizationResult() {
        for (ResultOneHeuristics resultOneHeuristics : resultsHeuristics) {
            CategoryEnum categoryEnum = resultOneHeuristics.getCategoryEnum();
            // we return the categoryEnum of the first heuristics
            // as it should be the same for all heuristics
            // (after the decisions have been made).
            return categoryEnum;
        }
        
        // return the "neutral" category if no heuristics has been found
        return CategoryEnum._10;
    }

    public void setCategorizationResult(CategoryEnum categorizationResult) {
        this.categorizationResult = categorizationResult;
    }

}
