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

    private String originalForm;
    private String cleanedForm;
    private String cleanedAndStrippedForm;

    @Override
    public TypeOfTextFragment.TypeOfTextFragmentEnum getTypeOfTextFragmentEnum() {
        return TypeOfTextFragment.TypeOfTextFragmentEnum.TERM;
    }


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

    public String getOriginalForm() {
        return originalForm;
    }

    public void setOriginalForm(String originalForm) {
        this.originalForm = originalForm;
    }
    
    public NGram toNgram(){
        NGram ngram = new NGram();
        ngram.setIndexCardinal(this.getIndexCardinal());
        ngram.setIndexCardinal(this.getIndexCardinalInSentence());
        ngram.setIndexCardinal(this.getIndexOrdinal());
        ngram.setIndexCardinal(this.getIndexOrdinalInSentence());
        ngram.setString(this.getString());
        ngram.getTerms().add(this);
        return ngram;
    }
}
