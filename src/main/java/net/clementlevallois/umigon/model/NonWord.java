/*
 * author: Clément Levallois
 */
package net.clementlevallois.umigon.model;

import java.io.Serializable;

/**
 *
 * @author LEVALLOIS
 */
public class NonWord extends TextFragment implements Serializable{
    private PatternOfInterest poi;
    
    public PatternOfInterest getPoi() {
        return poi;
    }

    public void setPoi(PatternOfInterest poi) {
        this.poi = poi;
    }
}
