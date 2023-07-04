/*
 * author: Cl�ment Levallois
 */
package net.clementlevallois.umigon.model;

import java.io.Serializable;

/**
 *
 * @author LEVALLOIS
 */
public class NonWord extends TextFragment implements Serializable {

    private PatternOfInterest poi;
    private TypeOfTextFragment.TypeOfTextFragmentEnum typeOfTextFragmentEnum;


    @Override
    public TypeOfTextFragment.TypeOfTextFragmentEnum getTypeOfTextFragmentEnum() {
        return typeOfTextFragmentEnum;
    }

    public PatternOfInterest getPoi() {
        return poi;
    }

    public void setPoi(PatternOfInterest poi) {
        this.poi = poi;
        this.typeOfTextFragmentEnum = poi.getTypeOfTextFragmentEnum();
    }

    public void setTypeOfTextFragmentEnum(TypeOfTextFragment.TypeOfTextFragmentEnum typeOfTextFragmentEnum) {
        this.typeOfTextFragmentEnum = typeOfTextFragmentEnum;
    }

}
