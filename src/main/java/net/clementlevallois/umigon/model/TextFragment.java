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

    private String string = "";
    private int indexCardinal;
    private int indexOrdinal;
    private int length;
    private TypeOfTextFragmentEnum typeOfTextFragment;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void addCharToString(char c) {
        string = string + String.valueOf(c);
    }

    public void addStringToString(String s) {
        string = string + s;
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

    public TypeOfTextFragmentEnum getTypeOfTextFragment() {
        return typeOfTextFragment;
    }

    public void setTypeOfTextFragment(TypeOfTextFragmentEnum typeOfTextFragment) {
        this.typeOfTextFragment = typeOfTextFragment;
    }

}
