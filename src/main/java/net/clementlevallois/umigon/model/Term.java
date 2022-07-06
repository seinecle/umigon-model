/*
 * author: Clément Levallois
 */
package net.clementlevallois.umigon.model;

import java.io.Serializable;

/**
 *
 * @author LEVALLOIS
 */
public class Term extends TextFragment implements Serializable {

    private String cleanedForm;
    private String cleanedAndStrippedForm;

    public String getCleanedForm() {
        return cleanedForm;
    }

    public void setCleanedForm(String cleanedForm) {
        this.cleanedForm = cleanedForm;
    }

    public String getCleanedAndStrippedForm() {
        return cleanedAndStrippedForm;
    }

    public void setCleanedAndStrippedForm(String cleanedAndStrippedForm) {
        this.cleanedAndStrippedForm = cleanedAndStrippedForm;
    }

    public String getCleanedAndStrippedIfCondition(boolean stripped) {
        return stripped ? cleanedAndStrippedForm : cleanedForm;
    }
}
