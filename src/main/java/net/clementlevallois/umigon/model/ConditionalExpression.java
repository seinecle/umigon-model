/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.clementlevallois.umigon.model;

import java.util.Set;

/**
 *
 * @author LEVALLOIS
 */
public class ConditionalExpression {

    ConditionEnum conditionEnum;

    public static enum ConditionEnum {
        none,
        isImmediatelyPrecededByANegation,
        isImmediatelyFollowedByTimeIndication,
        isImmediatelyFollowedByANegation,
        isImmediatelyPrecededBySpecificTerm,
        isImmediatelyFollowedBySpecificTerm,
        isImmediatelyFollowedByAnOpinion,
        isPrecededBySubjectiveTerm,
        isFirstTermOfText,
        isFollowedByAPositiveOpinion,
        isImmediatelyPrecededByPositive,
        isImmediatelyFollowedByAPositiveOpinion,
        isImmediatelyFollowedByANegativeOpinion,
        isPrecededByOpinion,
        isPrecededByPositive,
        isPrecededBySpecificTerm,
        isFollowedBySpecificTerm,
        isInATextWithOneOfTheseSpecificTerms,
        isHashtagStart,
        isInHashtag,
        isHashtag,
        isQuestionMarkAtEndOfText,
        isAllCaps,
        isPrecededByStrongWord,
        isFirstLetterCapitalized,
        isNegationInCaps
    }

    Set<String> keywords;
    Boolean flipped;

    public ConditionEnum getConditionEnum() {
        return conditionEnum;
    }

    public ConditionalExpression() {
    }

    public ConditionalExpression(String conditionName) {
        if (conditionName.isBlank()) {
            this.conditionEnum = ConditionEnum.none;
            return;
        }
        setConditionName(conditionName);
    }

    public ConditionalExpression(ConditionalExpression.ConditionEnum conditionEnum) {
        this.conditionEnum = conditionEnum;
    }

    public void setCondition(String conditionName, Boolean flipped) {
        this.flipped = flipped;
        if (conditionName.isBlank()) {
            this.conditionEnum = ConditionEnum.none;
            return;
        }

        setConditionName(conditionName);
    }

    public void setConditionName(String conditionName) {
        boolean isValidConditionName = false;
        for (ConditionalExpression.ConditionEnum c : ConditionalExpression.ConditionEnum.values()) {
            if (c.name().equals(conditionName.trim())) {
                isValidConditionName = true;
                this.conditionEnum = c;
            }
        }
        if (!isValidConditionName) {
            System.out.println("error in class ConditionalExpression");
            System.out.println("type of condition name \"" + conditionName + "\" is not a valid condition name");
        }

    }

    public Set<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(Set<String> keywords) {
        this.keywords = keywords;
    }

    public Boolean getFlipped() {
        return flipped;
    }

    public void setFlipped(Boolean flipped) {
        this.flipped = flipped;
    }

}
