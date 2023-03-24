/*
 * author: Clement Levallois
 */
package net.clementlevallois.umigon.model;

import java.io.Serializable;

/**
 *
 * @author LEVALLOIS
 */
public class Text implements Serializable {

    String originalForm;
    String originalFormLowercase;
    String cleanedForm;
    String cleanedFormLowercase;
    String strippedForm;
    String strippedFormLowercase;

    public String getOriginalForm() {
        return originalForm;
    }

    public void setOriginalForm(String originalForm) {
        this.originalForm = originalForm;
    }

    public String getOriginalFormLowercase() {
        return originalForm.toLowerCase();
    }

    public String getCleanedForm() {
        return cleanedForm;
    }

    public void setCleanedForm(String cleanedForm) {
        this.cleanedForm = cleanedForm;
    }

    public String getCleanedFormLowercase() {
        return cleanedForm.toLowerCase();
    }

    public String getStrippedForm() {
        return strippedForm;
    }

    public void setStrippedForm(String strippedForm) {
        this.strippedForm = strippedForm;
    }

    public String getStrippedFormLowercase() {
        return strippedForm.toLowerCase();
    }

}
