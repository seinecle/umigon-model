/*
 * author: Clément Levallois
 */
package net.clementlevallois.umigon.model;

import java.io.Serializable;

/**
 *
 * @author LEVALLOIS
 */
public class WhiteSpace extends TextFragment implements Serializable {

    private boolean sentenceOrLineBreak;

    public boolean isSentenceOrLineBreak() {
        return sentenceOrLineBreak;
    }

    public void setSentenceOrLineBreak(boolean sentenceOrLineBreak) {
        this.sentenceOrLineBreak = sentenceOrLineBreak;
    }
}
