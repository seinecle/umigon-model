/*
 * author: Clément Levallois
 */
package net.clementlevallois.umigon.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LEVALLOIS
 */
public class Decision {
    
    private ResultOneHeuristics heuristicsImpacted;
    private List<ResultOneHeuristics> listOfHeuristicsImpacted = new ArrayList();
    private ResultOneHeuristics secondHeuristicsImpacted;
    private ResultOneHeuristics otherHeuristicsInvolvedInDecision;
    private String termInvolvedInDecision;
    private int indexOfTermInvolvedInDecision;
    
   private DecisionType decisionType;
   private DecisionMotive decisionMotive;
    
    
    public static enum DecisionType{
        REMOVE
    }
    
    public static enum DecisionMotive{
        POSITIVE_TERM_THEN_NEGATION_THEN_NEGATIVE_TERM,
        NEGATIVE_TERM_THEN_NEGATION_THEN_POSITIVE_TERM,
        NEGATION_THEN_NEGATIVE_TERM_THEN_POSITIVE_TERM,
        NEGATION_THEN_POSITIVE_TERM_THEN_NEGATIVE_TERM,
        MODERATOR_THEN_NEGATIVE_TERM_THEN_POSITIVE_TERM,
        NEGATIVE_TERM_THEN_MODERATOR,
        POSITIVE_TERM_THEN_MODERATOR,
        TWO_POSITIVE_TERMS_THEN_MODERATOR,
        TWO_NEGATIVE_TERMS_THEN_MODERATOR,
        TRACE_OF_IRONY,
        WINNER_TAKES_ALL,
        FINAL_ADJUDICATION_NEGATIVE_SENTIMENT_PREVAILS,
    }

    public ResultOneHeuristics getHeuristicsImpacted() {
        return heuristicsImpacted;
    }

    public void setHeuristicsImpacted(ResultOneHeuristics heuristicsImpacted) {
        this.heuristicsImpacted = heuristicsImpacted;
    }

    public ResultOneHeuristics getOtherHeuristicsInvolvedInDecision() {
        return otherHeuristicsInvolvedInDecision;
    }

    public void setOtherHeuristicsInvolvedInDecision(ResultOneHeuristics otherHeuristicsInvolvedInDecision) {
        this.otherHeuristicsInvolvedInDecision = otherHeuristicsInvolvedInDecision;
    }

    public String getTermInvolvedInDecision() {
        return termInvolvedInDecision;
    }

    public void setTermInvolvedInDecision(String termInvolvedInDecision) {
        this.termInvolvedInDecision = termInvolvedInDecision;
    }

    public int getIndexOfTermInvolvedInDecision() {
        return indexOfTermInvolvedInDecision;
    }

    public void setIndexOfTermInvolvedInDecision(int indexOfTermInvolvedInDecision) {
        this.indexOfTermInvolvedInDecision = indexOfTermInvolvedInDecision;
    }

    public DecisionType getDecisionType() {
        return decisionType;
    }

    public void setDecisionType(DecisionType decisionType) {
        this.decisionType = decisionType;
    }

    public DecisionMotive getDecisionMotive() {
        return decisionMotive;
    }

    public void setDecisionMotive(DecisionMotive decisionMotive) {
        this.decisionMotive = decisionMotive;
    }

    public ResultOneHeuristics getSecondHeuristicsImpacted() {
        return secondHeuristicsImpacted;
    }

    public void setSecondHeuristicsImpacted(ResultOneHeuristics secondHeuristicsImpacted) {
        this.secondHeuristicsImpacted = secondHeuristicsImpacted;
    }

    public List<ResultOneHeuristics> getListOfHeuristicsImpacted() {
        return listOfHeuristicsImpacted;
    }

    public void setListOfHeuristicsImpacted(List<ResultOneHeuristics> listOfHeuristicsImpacted) {
        this.listOfHeuristicsImpacted = listOfHeuristicsImpacted;
    }
    
    
    
    
    
    
}
