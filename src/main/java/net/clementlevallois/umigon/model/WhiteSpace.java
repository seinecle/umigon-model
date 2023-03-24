/*
 * author: Clement Levallois
 */
package net.clementlevallois.umigon.model;

import java.io.Serializable;

/**
 *
 * @author LEVALLOIS
 */
public class WhiteSpace extends TextFragment implements Serializable {

    private boolean sentenceOrLineBreak;

    @Override
    public TypeOfTextFragment.TypeOfTextFragmentEnum getTypeOfTextFragmentEnum() {
        return TypeOfTextFragment.TypeOfTextFragmentEnum.WHITE_SPACE;
    }

    public boolean isSentenceOrLineBreak() {
        return sentenceOrLineBreak;
    }

    public void setSentenceOrLineBreak(boolean sentenceOrLineBreak) {
        this.sentenceOrLineBreak = sentenceOrLineBreak;
    }
}
