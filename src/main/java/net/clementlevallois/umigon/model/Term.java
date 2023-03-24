/*
 * author: Clement Levallois
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

    public NGram toNgram(){
        NGram ngram = new NGram();
        ngram.setIndexCardinal(this.getIndexCardinal());
        ngram.setIndexCardinal(this.getIndexCardinalInSentence());
        ngram.setIndexCardinal(this.getIndexOrdinal());
        ngram.setIndexCardinal(this.getIndexOrdinalInSentence());
        ngram.setOriginalForm(this.getOriginalForm());
        ngram.getTerms().add(this);
        return ngram;
    }
}
