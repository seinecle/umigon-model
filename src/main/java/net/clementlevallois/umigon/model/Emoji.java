/*
 * author: Clement Levallois
 */
package net.clementlevallois.umigon.model;

import java.io.Serializable;

/**
 *
 * @author LEVALLOIS
 */
public class Emoji extends TextFragment implements Serializable {

    private String semiColonForm;

    public String getSemiColonForm() {
        return semiColonForm;
    }

    public void setSemiColonForm(String semiColonForm) {
        this.semiColonForm = semiColonForm;
    }
    
    
    @Override
    public TypeOfTextFragment.TypeOfTextFragmentEnum getTypeOfTextFragmentEnum() {
        return TypeOfTextFragment.TypeOfTextFragmentEnum.EMOJI;
    }
    
}
