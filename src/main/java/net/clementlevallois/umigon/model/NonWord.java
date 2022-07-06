/*
 * author: Clément Levallois
 */
package net.clementlevallois.umigon.model;

/**
 *
 * @author LEVALLOIS
 */
public class NonWord extends TextFragment{
    private PatternOfInterest poi;

    public PatternOfInterest getPoi() {
        return poi;
    }

    public void setPoi(PatternOfInterest poi) {
        this.poi = poi;
    }
}
