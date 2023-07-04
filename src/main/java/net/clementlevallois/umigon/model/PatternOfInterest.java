/*
 * author: Clement Levallois
 */
package net.clementlevallois.umigon.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import net.clementlevallois.umigon.model.TypeOfTextFragment.TypeOfTextFragmentEnum;

/**
 *
 * @author LEVALLOIS
 */
public class PatternOfInterest implements Serializable {

    private String description;
    private String regex;
    private boolean shouldApplyToLowerCaseText;
    private List<Category> categories = new ArrayList();
    private TypeOfTextFragmentEnum typeOfTextFragmentEnum;
    private Pattern pattern;
    private Boolean matched;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
        pattern = Pattern.compile(regex);
    }

    public boolean isShouldApplyToLowerCaseText() {
        return shouldApplyToLowerCaseText;
    }

    public void setShouldApplyToLowerCaseText(boolean shouldApplyToLowerCaseText) {
        this.shouldApplyToLowerCaseText = shouldApplyToLowerCaseText;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public TypeOfTextFragmentEnum getTypeOfTextFragmentEnum() {
        return typeOfTextFragmentEnum;
    }

    public void setTypeOfTextFragment(String typeOfTokenName) {
        this.typeOfTextFragmentEnum = new TypeOfTextFragment(typeOfTokenName).getTypeOfTextFragmentEnum();
    }

    public void setTypeOfTextFragmentEnum(TypeOfTextFragmentEnum typeOfTextFragmentEnum) {
        this.typeOfTextFragmentEnum = typeOfTextFragmentEnum;
    }    
    
    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public Boolean getMatched() {
        return matched;
    }

    public void setMatched(Boolean matched) {
        this.matched = matched;
    }
}
