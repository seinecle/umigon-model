/*
 * author: Clément Levallois
 */
package net.clementlevallois.umigon.model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import net.clementlevallois.umigon.model.TypeOfToken.TypeOfTokenEnum;

/**
 *
 * @author LEVALLOIS
 */
public class PatternOfInterest {
    
    private String description;
    private String regex;
    private boolean shouldApplyToLowerCaseText;
    private List<Category> categories = new ArrayList();
    private TypeOfTokenEnum typeOfTokenEnum;
    private Pattern pattern;

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

    public TypeOfTokenEnum getTypeOfToken() {
        return typeOfTokenEnum;
    }

    public void setTypeOfToken(String typeOfTokenName) {
        this.typeOfTokenEnum = new TypeOfToken(typeOfTokenName).getTypeOfTokenEnum();
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }
    
    
}
