/*
 * author: Clement Levallois
 */
package net.clementlevallois.umigon.model;

import java.io.Serializable;

/**
 *
 * @author LEVALLOIS
 */
public class Hashtag extends TextFragment implements Serializable {

    @Override
    public TypeOfTextFragment.TypeOfTextFragmentEnum getTypeOfTextFragmentEnum() {
        return TypeOfTextFragment.TypeOfTextFragmentEnum.HASHTAG;
    }
    
}
