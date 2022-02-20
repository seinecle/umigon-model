/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.clementlevallois.umigon.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author C. Levallois
 */
public class Categories implements Serializable {

    private Map<Category, String> mapCategories;

    public void populate() {
        mapCategories = new HashMap();
        //
        // *** 0 *** errors
        //
        mapCategories.put(Category._9, "not suitable for semantic analysis");
        mapCategories.put(Category._91, "english text not detected");
        mapCategories.put(Category._92, "text too short or garbled");

        //
        // *** 1 *** tone
        //
        mapCategories.put(Category._10, "neutral tone");
        mapCategories.put(Category._11, "positive tone");
        mapCategories.put(Category._111, "positive tone, not promoted");
        mapCategories.put(Category._12, "negative tone");
        mapCategories.put(Category._13, "possibly ironic tone");
        mapCategories.put(Category._14, "fun tone");
        mapCategories.put(Category._17, "delight");

        //
        // *** 2 *** intensity
        //
        mapCategories.put(Category._20, "neutral intensity");
        mapCategories.put(Category._21, "weak intensity");
        mapCategories.put(Category._22, "strong intensity");

        //
        // *** 3 *** time
        //
        mapCategories.put(Category._3, "time");
        mapCategories.put(Category._30, "neutral time");
        mapCategories.put(Category._31, "past time");
        mapCategories.put(Category._311, "immediate past");
        mapCategories.put(Category._320, "present time");
        mapCategories.put(Category._321, "immediate present: just now");
        mapCategories.put(Category._33, "future time");
        mapCategories.put(Category._331, "immediate future");

        //
        // *** 4 *** question
        //
        mapCategories.put(Category._40, "question");

        //
        // *** 5 *** type of address
        //
        mapCategories.put(Category._50, "neutral address");
        mapCategories.put(Category._51, "subjective address");
        mapCategories.put(Category._52, "direct address");
        mapCategories.put(Category._521, "call to action");

        //
        // *** 6 *** topic
        //
        mapCategories.put(Category._60, "neutral topic");
        mapCategories.put(Category._61, "commercial tone / promoted");
        mapCategories.put(Category._611, "commercial offer");
        mapCategories.put(Category._612, "tweeted by the client");
        mapCategories.put(Category._6121, "a retweet of the client's tweet");
        mapCategories.put(Category._62, "factual statement");
        mapCategories.put(Category._621, "factual statement - statistics cited");

    }

    public String get(Categories.Category i) {
        return mapCategories.get(i);
    }

    public enum Category implements Serializable {

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

        Category(String plainName) {
            this.plainName = plainName;
        }

        // the toString just returns the given name
        @Override
        public String toString() {
            return this.plainName;
        }

    }
}
