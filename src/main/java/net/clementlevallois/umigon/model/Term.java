/*
 * author: Clément Levallois
 */
package net.clementlevallois.umigon.model;

/**
 *
 * @author LEVALLOIS
 */
public class Term {
    
    String originalForm;
    String strippedForm;
    
    int indexOriginalForm;
    String indexOriginalFormAsString;

    public String getOriginalForm() {
        return originalForm;
    }

    public void setOriginalForm(String originalForm) {
        this.originalForm = originalForm;
    }

    public String getOriginalFormLowercase() {
        return originalForm.toLowerCase();
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

    public int getIndexOriginalForm() {
        return indexOriginalForm;
    }

    public void setIndexOriginalForm(int indexOriginalForm) {
        this.indexOriginalForm = indexOriginalForm;
        this.indexOriginalFormAsString = String.valueOf(indexOriginalForm);
    }
    
    public String getOrigTermAndIndex(){
        return originalForm+"_"+indexOriginalFormAsString;
    }
    
    
    
    
    
    
}
