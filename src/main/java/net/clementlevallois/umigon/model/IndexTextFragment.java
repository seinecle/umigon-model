/*
 * author: Clement Levallois
 */
package net.clementlevallois.umigon.model;

import java.io.Serializable;

/**
 *
 * @author LEVALLOIS
 */
public class IndexTextFragment  implements Serializable{
    
    private int indexOrdinal;
    private int indexCardinal;
    private int indexOrdinalInSentence;
    private int indexCardinalInSentence;

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

    public int getIndexOrdinalInSentence() {
        return indexOrdinalInSentence;
    }

    public void setIndexOrdinalInSentence(int indexOrdinalInSentence) {
        this.indexOrdinalInSentence = indexOrdinalInSentence;
    }

    public int getIndexCardinalInSentence() {
        return indexCardinalInSentence;
    }

    public void setIndexCardinalInSentence(int indexCardinalInSentence) {
        this.indexCardinalInSentence = indexCardinalInSentence;
    }
    
    
    
}
