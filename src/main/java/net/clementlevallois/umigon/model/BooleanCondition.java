/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.clementlevallois.umigon.model;

/**
 *
 * @author LEVALLOIS
 */
public class BooleanCondition {

    BooleanConditionEnum booleanConditionEnum;
    private String keywordMatched;
    private Integer keywordMatchedIndex;
    private Boolean tokenInvestigatedGetsMatched = Boolean.FALSE;
//    Set<String> keywords;
    Boolean flipped;

    public static enum BooleanConditionEnum {
        none,
        isImmediatelyPrecededByANegation,
        isImmediatelyFollowedByTimeIndication,
        isImmediatelyFollowedByANegation,
        isImmediatelyPrecededBySpecificTerm,
        isImmediatelyFollowedBySpecificTerm,
        isImmediatelyFollowedByAnOpinion,
        isPrecededBySubjectiveTerm,
        isFollowedByVerbPastTense,
        isFirstTermOfText,
        isFollowedByAPositiveOpinion,
        isImmediatelyPrecededByPositive,
        isImmediatelyPrecededByNegative,
        isImmediatelyFollowedByAPositiveOpinion,
        isImmediatelyFollowedByANegativeOpinion,
        isPrecededByOpinion,
        isPrecededByPositive,
        isPrecededBySpecificTerm,
        isFollowedBySpecificTerm,
        isInATextWithOneOfTheseSpecificTerms,
        isHashtagStart,
        isInHashtag,
        isHashtagPositiveSentiment,
        isHashtagNegativeSentiment,
        isQuestionMarkAtEndOfText,
        isAllCaps,
        isPrecededByStrongWord,
        isFirstLetterCapitalized,
        isNegationInCaps
    }


    public BooleanConditionEnum getBooleanConditionEnum() {
        return booleanConditionEnum;
    }

    public BooleanCondition() {
    }

    public BooleanCondition(String conditionName) {
        if (conditionName.isBlank()) {
            this.booleanConditionEnum = BooleanConditionEnum.none;
            return;
        }
        setConditionName(conditionName);
    }

    public BooleanCondition(BooleanCondition.BooleanConditionEnum booleanConditionEnum) {
        this.booleanConditionEnum = booleanConditionEnum;
    }

    public void setCondition(String conditionName, Boolean flipped) {
        this.flipped = flipped;
        if (conditionName.isBlank()) {
            this.booleanConditionEnum = BooleanConditionEnum.none;
            return;
        }

        setConditionName(conditionName);
    }

    public void setConditionName(String conditionName) {
        boolean isValidConditionName = false;
        for (BooleanCondition.BooleanConditionEnum c : BooleanCondition.BooleanConditionEnum.values()) {
            if (c.name().equals(conditionName.trim())) {
                isValidConditionName = true;
                this.booleanConditionEnum = c;
            }
        }
        if (!isValidConditionName) {
            System.out.println("error in class ConditionalExpression");
            System.out.println("type of condition name \"" + conditionName + "\" is not a valid condition name");
        }

    }

//    public Set<String> getKeywords() {
//        return keywords;
//    }
//
//    public void setKeywords(Set<String> keywords) {
//        this.keywords = keywords;
//    }
//
    public Boolean getFlipped() {
        return flipped;
    }

    public void setFlipped(Boolean flipped) {
        this.flipped = flipped;
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

    public Integer getKeywordMatchedIndex() {
        return keywordMatchedIndex;
    }

    public void setKeywordMatchedIndex(Integer keywordMatchedIndex) {
        this.keywordMatchedIndex = keywordMatchedIndex;
    }
    
    

}
