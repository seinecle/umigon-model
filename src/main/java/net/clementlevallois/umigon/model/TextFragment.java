/*
 * author: Clément Levallois
 */
package net.clementlevallois.umigon.model;

import net.clementlevallois.umigon.model.TypeOfTextFragment.TypeOfTextFragmentEnum;

/**
 *
 * @author LEVALLOIS
 */
public abstract class TextFragment {

    private int indexCardinal;
    private int indexOrdinal;
    private int indexCardinalInSentence;
    private int indexOrdinalInSentence;
    private int length;
    private TypeOfTextFragmentEnum typeOfTextFragmentEnum;

    private String originalForm = "";

    public String getOriginalForm() {
        return originalForm;
    }

    public void setOriginalForm(String originalForm) {
        this.originalForm = originalForm;
    }

    public void addCharToOriginalForm(char c) {
        originalForm = originalForm + String.valueOf(c);
    }

    public void addStringToOriginalForm(String s) {
        originalForm = originalForm + s;
    }

    public int getIndexCardinal() {
        return indexCardinal;
    }

    public void setIndexCardinal(int indexCardinal) {
        this.indexCardinal = indexCardinal;
    }

    public int getIndexOrdinal() {
        return indexOrdinal;
    }

    public void setIndexOrdinal(int indexOrdinal) {
        this.indexOrdinal = indexOrdinal;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public TypeOfTextFragmentEnum getTypeOfTextFragmentEnum() {
        return typeOfTextFragmentEnum;
    }

    public int getIndexCardinalInSentence() {
        return indexCardinalInSentence;
    }

    public void setIndexCardinalInSentence(int indexCardinalInSentence) {
        this.indexCardinalInSentence = indexCardinalInSentence;
    }

    public int getIndexOrdinalInSentence() {
        return indexOrdinalInSentence;
    }

    public void setIndexOrdinalInSentence(int indexOrdinalInSentence) {
        this.indexOrdinalInSentence = indexOrdinalInSentence;
    }
    
    

}
