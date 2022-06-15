/*
 * author: Clément Levallois
 */
package net.clementlevallois.umigon.model;

import net.clementlevallois.umigon.model.heuristics.ConditionalExpression;

/**
 *
 * @author LEVALLOIS
 */
public class ResultOneHeuristics {

    private ConditionalExpression conditionalExpression;
    private String keywordMatched;
    private Boolean matched;
    private Category category;
    private Integer indexTermMatched;
    private String termMatched;
    private TypeOfToken.TypeOfTokenEnum typeOfTokenEnum;

    /**
     *
     * @param category
     * @param indexTermMatched
     * @param termMatched
     */
    public ResultOneHeuristics(Category category, Integer indexTermMatched, String termMatched) {
        this.category = category;
        this.indexTermMatched = indexTermMatched;
        this.termMatched = termMatched;
    }

    public ConditionalExpression getConditionalExpression() {
        return conditionalExpression;
    }

    public void setConditionalExpression(ConditionalExpression conditionalExpression) {
        this.conditionalExpression = conditionalExpression;
    }

    public String getKeywordMatched() {
        return keywordMatched;
    }

    public void setKeywordMatched(String keywordMatched) {
        this.keywordMatched = keywordMatched;
    }

    public Boolean getMatched() {
        return matched;
    }

    public void setMatched(Boolean matched) {
        this.matched = matched;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getIndexTermMatched() {
        return indexTermMatched;
    }

    public void setIndexTermMatched(int indexTermMatched) {
        this.indexTermMatched = indexTermMatched;
    }

    public String getTermMatched() {
        return termMatched;
    }

    public void setTermMatched(String termMatched) {
        this.termMatched = termMatched;
    }

    public TypeOfToken.TypeOfTokenEnum getTypeOfToken() {
        return typeOfTokenEnum;
    }

    public void setTypeOfToken(TypeOfToken.TypeOfTokenEnum typeOfTokenEnum) {
        this.typeOfTokenEnum = typeOfTokenEnum;
    }

}
