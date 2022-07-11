/*
 * author: Clément Levallois
 */
package net.clementlevallois.umigon.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LEVALLOIS
 */
public class Decision implements Serializable {

    private ResultOneHeuristics heuristicsImpacted;
    private List<ResultOneHeuristics> listOfHeuristicsImpacted = new ArrayList();
    private ResultOneHeuristics secondHeuristicsImpacted;
    private ResultOneHeuristics otherHeuristicsInvolvedInDecision;
    private TextFragment textFragmentInvolvedInDecision;

    private DecisionType decisionType;
    private DecisionMotive decisionMotive;

    public static enum DecisionType implements Serializable {
        REMOVE
    }

    public static enum DecisionMotive implements Serializable {
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

    public TextFragment getTextFragmentInvolvedInDecision() {
        return textFragmentInvolvedInDecision;
    }

    public void setTextFragmentInvolvedInDecision(TextFragment textFragmentInvolvedInDecision) {
        this.textFragmentInvolvedInDecision = textFragmentInvolvedInDecision;
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
        if (heuristicsImpacted != null) {
            listOfHeuristicsImpacted.add(heuristicsImpacted);
        }
        if (secondHeuristicsImpacted != null) {
            listOfHeuristicsImpacted.add(secondHeuristicsImpacted);
        }
        return listOfHeuristicsImpacted;
    }

    public void setListOfHeuristicsImpacted(List<ResultOneHeuristics> listOfHeuristicsImpacted) {
        this.listOfHeuristicsImpacted = listOfHeuristicsImpacted;
    }

}
