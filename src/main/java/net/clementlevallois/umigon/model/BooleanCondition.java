/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.clementlevallois.umigon.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author LEVALLOIS
 */
public class BooleanCondition implements Serializable {

    private BooleanConditionEnum booleanConditionEnum;
    private TextFragment textFragmentMatched;
    private Boolean tokenInvestigatedGetsMatched = Boolean.FALSE;
    private Set<String> associatedKeywords = new HashSet();
    private Set<String> associatedKeywordsStripped = new HashSet();
    private Set<NGram> associatedKeywordMatchedAsNGrams = new HashSet();
    private Boolean flipped = Boolean.FALSE;

    public static enum BooleanConditionEnum implements Serializable {
        none,
        isLastNGramOfSegment,
        isInSegmentEndingWithExclamation,
        isImmediatelyPrecededByANegation,
        isImmediatelyFollowedByTimeIndication,
        isImmediatelyFollowedByANegation,
        isImmediatelyPrecededBySpecificTerm,
        isImmediatelyFollowedBySpecificTerm,
        isImmediatelyFollowedByPositivePriorAssociation,
        isImmediatelyFollowedByNegativePriorAssociation,
        isImmediatelyPrecededByPositivePriorAssociation,
        isImmediatelyPrecededByNegativePriorAssociation,
        isImmediatelyFollowedByAnOpinion,
        isPrecededBySubjectiveTerm,
        isFollowedByVerbPastTense,
        isFirstTermOfText,
        isFollowedByAPositiveOpinion,
        isFollowedByANegativeOpinion,
        isImmediatelyPrecededByPositive,
        isImmediatelyPrecededByNegative,
        isImmediatelyFollowedByAPositiveOpinion,
        isImmediatelyFollowedByANegativeOpinion,
        isPrecededByOpinion,
        isPrecededByPositive,
        isPrecededBySpecificTerm,
        isFollowedBySpecificTerm,
        isInASentenceLikeFragmentWithOneOfTheseSpecificTerms,
        isHashtagStart,
        isHashtag,
        isInHashtag,
        isHashtagPositiveSentiment,
        isHashtagNegativeSentiment,
        isHashtagOrganic,
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
        if (conditionName == null || conditionName.isBlank()) {
            this.booleanConditionEnum = BooleanConditionEnum.none;
        } else {
            setConditionName(conditionName);
        }
    }

    public BooleanCondition(BooleanCondition.BooleanConditionEnum booleanConditionEnum) {
        if (booleanConditionEnum == null) {
            this.booleanConditionEnum = BooleanConditionEnum.none;
        } else {
            this.booleanConditionEnum = booleanConditionEnum;
        }
    }

    public void setCondition(String conditionName, Boolean flipped) {
        this.flipped = flipped;
        if (conditionName == null || conditionName.isBlank()) {
            this.booleanConditionEnum = BooleanConditionEnum.none;
        } else {
            setConditionName(conditionName);
        }
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
            this.booleanConditionEnum = BooleanCondition.BooleanConditionEnum.none;
        }
    }

    public Boolean getFlipped() {
        return flipped;
    }

    public void setFlipped(Boolean flipped) {
        this.flipped = flipped;
    }

    public Set<String> setAssociatedKeywords() {
        return associatedKeywords;
    }

    public Set<String> getAssociatedKeywords(boolean stripped) {
        if (!stripped) {
            return associatedKeywords;
        } else {
            return associatedKeywordsStripped;
        }
    }

    public void setAssociatedKeywords(Set<String> associatedKeywords) {
        this.associatedKeywords = associatedKeywords;
    }

    public void setAssociatedKeywordsStripped(Set<String> associatedKeywordsStripped) {
        this.associatedKeywordsStripped = associatedKeywordsStripped;
    }

    public TextFragment getTextFragmentMatched() {
        return textFragmentMatched;
    }

    public void setTextFragmentMatched(TextFragment textFragmentMatched) {
        this.textFragmentMatched = textFragmentMatched;
    }

    public Boolean getTokenInvestigatedGetsMatched() {
        return tokenInvestigatedGetsMatched;
    }

    public void setTokenInvestigatedGetsMatched(Boolean tokenInvestigatedGetsMatched) {
        this.tokenInvestigatedGetsMatched = tokenInvestigatedGetsMatched;
    }

    public Set<NGram> getAssociatedKeywordMatchedAsNGrams() {
        return associatedKeywordMatchedAsNGrams;
    }

    public void setAssociatedKeywordMatchedAsTextFragment(Collection<NGram> associatedKeywordMatchedAsNGrams) {
        this.associatedKeywordMatchedAsNGrams.addAll(associatedKeywordMatchedAsNGrams);
    }

}
