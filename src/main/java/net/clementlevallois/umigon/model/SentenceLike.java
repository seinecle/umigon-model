/*
 * author: Clement Levallois
 */
package net.clementlevallois.umigon.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LEVALLOIS
 */
public class SentenceLike implements Serializable {

    private List<NGram> ngrams = new ArrayList();
    private List<TextFragment> textFragments = new ArrayList();
    private int indexOrdinal;
    private int indexCardinal;

    public List<NGram> getNgrams() {
        return ngrams;
    }

    public void setNgrams(List<NGram> ngrams) {
        this.ngrams = ngrams;
    }

    public List<TextFragment> getTextFragments() {
        return textFragments;
    }

    public void setTextFragments(List<TextFragment> textFragments) {
        this.textFragments = textFragments;
    }

    public int getIndexOrdinal() {
        return indexOrdinal;
    }

    public void setIndexOrdinal(int indexOrdinal) {
        this.indexOrdinal = indexOrdinal;
    }

    public int getIndexCardinal() {
        return indexCardinal;
    }

    public void setIndexCardinal(int indexCardinal) {
        this.indexCardinal = indexCardinal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (TextFragment tf : textFragments) {
            sb.append(tf.getOriginalForm());
        }
        return sb.toString();
    }

}
