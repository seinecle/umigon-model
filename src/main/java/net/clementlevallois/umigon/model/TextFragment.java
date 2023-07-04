/*
 * author: Cl�ment Levallois
 */
package net.clementlevallois.umigon.model;

import java.io.Serializable;
import java.util.Objects;
import net.clementlevallois.umigon.model.TypeOfTextFragment.TypeOfTextFragmentEnum;

/**
 *
 * @author LEVALLOIS
 */
public abstract class TextFragment implements Serializable
//        implements Comparable<TextFragment> 
{

    private int indexCardinal;
    private int indexOrdinal;
    private int indexCardinalInSentence;
    private int indexOrdinalInSentence;
    private int length;
    private TypeOfTextFragmentEnum typeOfTextFragmentEnum;

    private String originalForm = "";
    private String originalFormLemmatized = "";

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

    public String getOriginalFormLemmatized() {
        return originalFormLemmatized;
    }

    public void setOriginalFormLemmatized(String originalFormLemmatized) {
        this.originalFormLemmatized = originalFormLemmatized;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.originalForm);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TextFragment other = (TextFragment) obj;
        return Objects.equals(this.originalForm, other.originalForm);
    }

    
    
}
