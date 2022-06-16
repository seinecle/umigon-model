/*
 * author: Clément Levallois
 */
package net.clementlevallois.umigon.model;

import net.clementlevallois.umigon.model.Category.CategoryEnum;
import net.clementlevallois.umigon.model.TypeOfToken.TypeOfTokenEnum;
import net.clementlevallois.umigon.model.heuristics.ConditionalExpression.ConditionEnum;

/**
 *
 * @author LEVALLOIS
 */
public class ResultOneHeuristics {

    private ConditionEnum conditionEnum;
    private String keywordMatched;
    private Boolean tokenInvestigatedGetsMatched;
    private CategoryEnum categoryEnum;
    private Integer indexTokenInvestigated;
    private String tokenInvestigated;
    private TypeOfToken.TypeOfTokenEnum typeOfTokenEnum;

    /**
     *
     * @param categoryEnum
     * @param indexTermMatched
     * @param termMatched
     * @param typeOfTokenEnum
     */
    public ResultOneHeuristics(Category.CategoryEnum categoryEnum, Integer indexTermMatched, String termMatched, TypeOfToken.TypeOfTokenEnum typeOfTokenEnum) {
        this.categoryEnum = categoryEnum;
        this.indexTokenInvestigated = indexTermMatched;
        this.tokenInvestigated = termMatched;
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

    public ResultOneHeuristics(ConditionEnum conditionalExpressionEnum, String tokenInvestigated, int indexTokenInvestigated, TypeOfTokenEnum typeOfTokenEnum) {
        this.conditionEnum = conditionalExpressionEnum;
        this.typeOfTokenEnum = typeOfTokenEnum;
        this.tokenInvestigated = tokenInvestigated;
        this.indexTokenInvestigated = indexTokenInvestigated;
    }

    public ConditionEnum getConditionEnum() {
        return conditionEnum;
    }

    public void setConditionEnum(ConditionEnum conditionalExpressionEnum) {
        this.conditionEnum = conditionalExpressionEnum;
    }

    public String getKeywordMatched() {
        return keywordMatched;
    }

    public void setKeywordMatched(String keywordMatched) {
        this.keywordMatched = keywordMatched;
    }

    public Boolean getTokenInvestigatedGetsMatched() {
        return tokenInvestigatedGetsMatched;
    }

    public void setTokenInvestigatedGetsMatched(Boolean tokenInvestigatedGetsMatched) {
        this.tokenInvestigatedGetsMatched = tokenInvestigatedGetsMatched;
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

}
