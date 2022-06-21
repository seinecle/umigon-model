/*
 * author: Clément Levallois
 */
package net.clementlevallois.umigon.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.clementlevallois.umigon.model.Category.CategoryEnum;
import net.clementlevallois.umigon.model.TypeOfToken.TypeOfTokenEnum;

/**
 *
 * @author LEVALLOIS
 */
public class ResultOneHeuristics {

    private List<BooleanCondition> booleanConditions = new ArrayList();
    private CategoryEnum categoryEnum;
    private Integer indexTokenInvestigated;
    private String tokenInvestigated;
    private TypeOfToken.TypeOfTokenEnum typeOfTokenEnum;

    /**
     *
     * @param categoryEnum
     * @param indexTokenInvestigated
     * @param tokenInvestigated
     * @param typeOfTokenEnum
     */
    public ResultOneHeuristics(Category.CategoryEnum categoryEnum, Integer indexTokenInvestigated, String tokenInvestigated, TypeOfToken.TypeOfTokenEnum typeOfTokenEnum) {
        this.categoryEnum = categoryEnum;
        this.indexTokenInvestigated = indexTokenInvestigated;
        this.tokenInvestigated = tokenInvestigated;
        this.typeOfTokenEnum = typeOfTokenEnum;
    }

    /**
     *
     * @param categoryEnum
     * @param typeOfTokenEnum
     */
    public ResultOneHeuristics(CategoryEnum categoryEnum, TypeOfTokenEnum typeOfTokenEnum) {
        this.categoryEnum = categoryEnum;
        this.typeOfTokenEnum = typeOfTokenEnum;
    }

    public ResultOneHeuristics(String tokenInvestigated, int indexTokenInvestigated, TypeOfTokenEnum typeOfTokenEnum) {
        this.typeOfTokenEnum = typeOfTokenEnum;
        this.tokenInvestigated = tokenInvestigated;
        this.indexTokenInvestigated = indexTokenInvestigated;
    }

    public ResultOneHeuristics(String tokenInvestigated, int indexTokenInvestigated, TypeOfTokenEnum typeOfTokenEnum, CategoryEnum categoryEnum) {
        this.typeOfTokenEnum = typeOfTokenEnum;
        this.tokenInvestigated = tokenInvestigated;
        this.indexTokenInvestigated = indexTokenInvestigated;
        this.categoryEnum = categoryEnum;
    }


    public CategoryEnum getCategoryEnum() {
        return categoryEnum;
    }

    public void setCategoryEnum(CategoryEnum categoryEnum) {
        this.categoryEnum = categoryEnum;
    }

    public Integer getIndexTokenInvestigated() {
        return indexTokenInvestigated;
    }

    public void setIndexTermMatched(int indexTermMatched) {
        this.indexTokenInvestigated = indexTermMatched;
    }

    public String getTokenInvestigated() {
        return tokenInvestigated;
    }

    public void setTokenInvestigated(String tokenInvestigated) {
        this.tokenInvestigated = tokenInvestigated;
    }

    public TypeOfTokenEnum getTypeOfToken() {
        return typeOfTokenEnum;
    }

    public void setTypeOfToken(TypeOfTokenEnum typeOfTokenEnum) {
        this.typeOfTokenEnum = typeOfTokenEnum;
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
        hash = 89 * hash + Objects.hashCode(this.indexTokenInvestigated);
        hash = 89 * hash + Objects.hashCode(this.tokenInvestigated);
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
        if (!Objects.equals(this.tokenInvestigated, other.tokenInvestigated)) {
            return false;
        }
        return Objects.equals(this.indexTokenInvestigated, other.indexTokenInvestigated);
    }
    
    

}
