/*
 * author:  Levallois
 */
package net.clementlevallois.umigon.model;

import java.io.Serializable;

/**
 *
 * @author LEVALLOIS
 */
public class Category implements Serializable {

    CategoryEnum categoryEnum;

    public static enum CategoryEnum implements Serializable {
        _10("neutral tone"),
        _11("positive tone"),
        _111("positive tone, not promoted"),
        _12("negative tone"),
        _13("possibly ironic tone"),
        _14("fun tone"),
        _17("delight"),
        _20("neutral intensity"),
        _21("weak intensity"),
        _22("strong intensity"),
        _3("time"),
        _30("neutral time"),
        _31("past time"),
        _311("immediate past"),
        _320("present time"),
        _321("immediate present: just now"),
        _33("future time"),
        _331("immediate future"),
        _40("question"),
        _50("neutral address"),
        _51("subjective address"),
        _52("direct address"),
        _521("call to action"),
        _60("neutral topic"),
        _61("commercial tone / promoted"),
        _611("commercial offer"),
        _612("tweeted by the client"),
        _6121("a retweet of the client's tweet"),
        _62("factual statement"),
        _621("factual statement - statistics cited"),
        _9("not suitable for semantic analysis"),
        _91("english text not detected"),
        _92("text too short or garbled");

        private final String plainName;

        CategoryEnum(String plainName) {
            this.plainName = plainName;
        }

        // the toString just returns the given name
        @Override
        public String toString() {
            return this.plainName;
        }
    }

    public Category(String catNumber) {
        setCategoryEnumFromString(catNumber);
    }

    public CategoryEnum getCategoryEnum() {
        return categoryEnum;
    }

    public void setCategoryEnum(CategoryEnum categoryEnum) {
        this.categoryEnum = categoryEnum;
    }

    public void setCategoryEnumFromString(String categoryEnumFromString) {

        boolean isValidCategoryName = false;
        for (Category.CategoryEnum c : Category.CategoryEnum.values()) {
            if (c.name().equals("_" + categoryEnumFromString)) {
                isValidCategoryName = true;
                this.categoryEnum = c;
            }
        }
        if (!isValidCategoryName) {
            System.out.println("error in class Category");
            System.out.println("category name " + categoryEnumFromString + " is not a valid name");
            this.categoryEnum = CategoryEnum._10;
        }

    }

}
