/*
 * author: Clement Levallois
 */
package net.clementlevallois.umigon.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.clementlevallois.umigon.model.Category.CategoryEnum;

/**
 *
 * @author LEVALLOIS
 */
public class ResultOneHeuristics implements Serializable{

    private List<BooleanCondition> booleanConditions = new ArrayList();
    private CategoryEnum categoryEnum;
    private TextFragment textFragmentInvestigated;

    /**
     *
     * @param categoryEnum
     * @param textFragmentInvestigated
     */
    public ResultOneHeuristics(Category.CategoryEnum categoryEnum, TextFragment textFragmentInvestigated) {
        this.categoryEnum = categoryEnum;
        this.textFragmentInvestigated = textFragmentInvestigated;
    }


    public ResultOneHeuristics(TextFragment textFragmentInvestigated) {
        this.textFragmentInvestigated = textFragmentInvestigated;
    }

    public CategoryEnum getCategoryEnum() {
        return categoryEnum;
    }

    public void setCategoryEnum(CategoryEnum categoryEnum) {
        this.categoryEnum = categoryEnum;
    }

    public TextFragment getTextFragmentInvestigated() {
        return textFragmentInvestigated;
    }

    public void setTextFragmentInvestigated(TextFragment textFragmentInvestigated) {
        this.textFragmentInvestigated = textFragmentInvestigated;
    }

    public List<BooleanCondition> getBooleanConditions() {
        return booleanConditions;
    }

    public void setBooleanConditions(List<BooleanCondition> booleanConditions) {
        this.booleanConditions = booleanConditions;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.categoryEnum);
        hash = 97 * hash + Objects.hashCode(this.textFragmentInvestigated);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ResultOneHeuristics other = (ResultOneHeuristics) obj;
        if (this.categoryEnum != other.categoryEnum) {
            return false;
        }
        return Objects.equals(this.textFragmentInvestigated, other.textFragmentInvestigated);
    }
    
    
    
}
