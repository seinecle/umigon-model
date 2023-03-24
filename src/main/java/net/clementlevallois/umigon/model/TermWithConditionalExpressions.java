package net.clementlevallois.umigon.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author C. Levallois
 */
public class TermWithConditionalExpressions implements Serializable {

    private String term;
    private List<BooleanCondition> booleanConditions;
    private String rule;
    private boolean hashtagRelevant;

    public TermWithConditionalExpressions() {
        hashtagRelevant = true;
        booleanConditions = new ArrayList();
    }

    public void generateNewHeuristic(String term, String rule) {
        this.term = term;
        this.rule = rule;
    }

    public String getTerm() {
        return term;
    }

    public void addFeature(BooleanCondition booleanCondition) {
        booleanConditions.add(booleanCondition);
    }

    public List<BooleanCondition> getMapFeatures() {
        return booleanConditions;
    }

    public String getRule() {
        return rule;
    }

    @Override
    public String toString() {
        return "Heuristic{" + "term=" + term + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.term != null ? this.term.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TermWithConditionalExpressions other = (TermWithConditionalExpressions) obj;
        return !((this.term == null) ? (other.term != null) : !this.term.equals(other.term));
    }

    public boolean isHashtagRelevant() {
        return hashtagRelevant;
    }

    public void setHashtagRelevant(boolean hashtagRelevant) {
        this.hashtagRelevant = hashtagRelevant;
    }

}
