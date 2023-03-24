/*
 * author: Cleent Levallois
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

    private List<ResultOneHeuristics> listOfHeuristicsImpacted = new ArrayList();
    private ResultOneHeuristics otherHeuristicsInvolvedInDecision;
    private TextFragment textFragmentInvolvedInDecision;

    private DecisionType decisionType;
    private DecisionMotive decisionMotive;

    public static enum DecisionType implements Serializable {
        REMOVE, ADD
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
        ANTI_PHRASE,
        WINNER_TAKES_ALL,
        FINAL_ADJUDICATION_NEGATIVE_SENTIMENT_PREVAILS,
        EXCLAMATION_MARKS_ENDING_SHORT_NEUTRAL_SENTENCES,
        QUESTION_MARK_FOLLOWED_BY_EXCLAMATION_MARKS
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

    public List<ResultOneHeuristics> getListOfHeuristicsImpacted() {
        return listOfHeuristicsImpacted;
    }

    public void setListOfHeuristicsImpacted(List<ResultOneHeuristics> listOfHeuristicsImpacted) {
        this.listOfHeuristicsImpacted = listOfHeuristicsImpacted;
    }

}
