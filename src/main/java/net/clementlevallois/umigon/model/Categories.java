/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.clementlevallois.umigon.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author C. Levallois
 */
public class Categories {

    private Map<String, String> mapCategories;

    public void populate() {
        mapCategories = new HashMap();
        //
        // *** 0 *** errors
        //
        mapCategories.put("9", "not suitable for semantic analysis");
        mapCategories.put("91", "english text not detected");
        mapCategories.put("92", "text of tweet too short or garbled");

        //
        // *** 1 *** tone
        //
        mapCategories.put("10", "neutral tone");
        mapCategories.put("11", "positive tone");
        mapCategories.put("111", "positive tone, not promoted");
        mapCategories.put("12", "negative tone");
        mapCategories.put("13", "possibly ironic tone");
        mapCategories.put("14", "fun tone");
        mapCategories.put("17", "hyper satisfaction");

        //
        // *** 2 *** intensity
        //
        mapCategories.put("20", "neutral intensity");
        mapCategories.put("21", "weak intensity");
        mapCategories.put("22", "strong intensity");

        //
        // *** 3 *** time
        //
        mapCategories.put("3", "time");
        mapCategories.put("30", "neutral time");
        mapCategories.put("31", "past time");
        mapCategories.put("311", "immediate past");
        mapCategories.put("320", "present time");
        mapCategories.put("321", "immediate present: just now");
        mapCategories.put("33", "future time");
        mapCategories.put("331", "immediate future");

        //
        // *** 4 *** question
        //
        mapCategories.put("40", "question");

        //
        // *** 5 *** type of address
        //
        mapCategories.put("50", "neutral address");
        mapCategories.put("51", "subjective address");
        mapCategories.put("52", "direct address");
        mapCategories.put("521", "call to action");

        //
        // *** 6 *** topic
        //
        mapCategories.put("60", "neutral topic");
        mapCategories.put("61", "commercial tone / promoted");
        mapCategories.put("611", "commercial offer");
        mapCategories.put("612", "tweeted by the client");
        mapCategories.put("6121", "a retweet of the client's tweet");
        mapCategories.put("62", "factual statement");
        mapCategories.put("621", "factual statement - statistics cited");

    }

    public String get(String i) {
//        System.out.println("code of category returned: "+ i);
        return mapCategories.get(i);
    }
}
