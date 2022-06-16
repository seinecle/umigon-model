/*
 * author: Clément Levallois
 */
package net.clementlevallois.umigon.model;

/**
 *
 * @author LEVALLOIS
 */
public class TypeOfToken {

    TypeOfTokenEnum typeOfTokenEnum;

    public static enum TypeOfTokenEnum {
        NGRAM, ONOMATOPAE, TEXTO_SPEAK, EMOJI, PUNCTUATION, QUESTION, TOO_SHORT, HASHTAG
    }

    public TypeOfTokenEnum getTypeOfTokenEnum() {
        return typeOfTokenEnum;
    }

    public TypeOfToken(String typeOfTokeName) {
        setTypeOfTokeName(typeOfTokeName);
    }

    public TypeOfToken(TypeOfTokenEnum typeOfTokenEnum) {
        this.typeOfTokenEnum = typeOfTokenEnum;
    }

    public void setTypeOfTokeName(String typeOfTokeName) {

        boolean isValidTokenName = false;
        for (TypeOfTokenEnum c : TypeOfTokenEnum.values()) {
            if (c.name().equals(typeOfTokeName)) {
                isValidTokenName = true;
                this.typeOfTokenEnum = c;
            }
        }
        if (!isValidTokenName) {
            System.out.println("error in class TypeOfToken");
            System.out.println("type of token name " + typeOfTokeName + " is not a valid name");
        }
    }

}
