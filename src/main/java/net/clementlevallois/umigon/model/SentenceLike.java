/*
 * author: Clément Levallois
 */
package net.clementlevallois.umigon.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LEVALLOIS
 */
public class SentenceLike {
    
    private List<NGram> ngrams = new ArrayList();
    private int indexOrdinal;
    private int indexCardinal;

    public List<NGram> getNgrams() {
        return ngrams;
    }

    public void setNgrams(List<NGram> ngrams) {
        this.ngrams = ngrams;
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
    
    
    
}
