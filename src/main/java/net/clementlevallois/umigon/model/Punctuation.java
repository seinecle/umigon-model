/*
 * author: Clement Levallois
 */
package net.clementlevallois.umigon.model;

import java.io.Serializable;

/**
 *
 * @author LEVALLOIS
 */
public class Punctuation extends TextFragment implements Serializable {

    @Override
    public TypeOfTextFragment.TypeOfTextFragmentEnum getTypeOfTextFragmentEnum() {
        return TypeOfTextFragment.TypeOfTextFragmentEnum.PUNCTUATION;
    }

    public NonWord toNonWord(PatternOfInterest poi, String string) {
        NonWord nonWord = new NonWord();
        nonWord.setPoi(poi);
        nonWord.setOriginalForm(string);
        nonWord.setTypeOfTextFragmentEnum(poi.getTypeOfTextFragmentEnum());
        nonWord.setIndexCardinal(this.getIndexCardinal());
        nonWord.setIndexOrdinal(this.getIndexOrdinal());
        nonWord.setTypeOfTextFragmentEnum(poi.getTypeOfTextFragmentEnum());
        
        return nonWord;

    }

}
