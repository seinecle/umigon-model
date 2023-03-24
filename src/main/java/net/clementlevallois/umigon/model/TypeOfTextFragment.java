/*
 * author: Clement Levallois
 */
package net.clementlevallois.umigon.model;

import java.io.Serializable;

/**
 *
 * @author LEVALLOIS
 */
public class TypeOfTextFragment implements Serializable {

    TypeOfTextFragmentEnum typeOfTextFragmentEnum;

    public static enum TypeOfTextFragmentEnum implements Serializable {
        TERM, NGRAM, ONOMATOPAE, TEXTO_SPEAK, EMOTICON_IN_ASCII, WHITE_SPACE, EMOJI, PUNCTUATION, QUESTION, TOO_SHORT, HASHTAG
    }

    public TypeOfTextFragmentEnum getTypeOfTextFragmentEnum() {
        return typeOfTextFragmentEnum;
    }

    public TypeOfTextFragment(String typeOfTokeName) {
        setTypeOfTextFragmentName(typeOfTokeName);
    }

    public TypeOfTextFragment(TypeOfTextFragmentEnum typeOfTokenEnum) {
        this.typeOfTextFragmentEnum = typeOfTokenEnum;
    }

    public void setTypeOfTextFragmentName(String typeOfTokenName) {

        boolean isValidTokenName = false;
        for (TypeOfTextFragmentEnum c : TypeOfTextFragmentEnum.values()) {
            if (c.name().equals(typeOfTokenName)) {
                isValidTokenName = true;
                this.typeOfTextFragmentEnum = c;
            }
        }
        if (!isValidTokenName) {
            System.out.println("error in class TypeOfToken");
            System.out.println("type of token name " + typeOfTokenName + " is not a valid name");
            this.typeOfTextFragmentEnum = TypeOfTextFragmentEnum.NGRAM;
        }
    }

}
