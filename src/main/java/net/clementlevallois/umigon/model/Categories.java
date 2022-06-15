/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.clementlevallois.umigon.model;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author C. Levallois
 */
public class Categories implements Serializable {

    private static Map<String, Category> mapIdsToCategories;

    public void populate() {
        mapIdsToCategories = new HashMap();
        InputStream inputStream = Categories.class.getResourceAsStream("categories_raw_data.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        List<String> categoriesAsTSV = br.lines().collect(Collectors.toList());
        for (String categoryAsTSV : categoriesAsTSV) {
            String[] elements = categoryAsTSV.split("\t");
            Category category = new Category(elements[0], elements[1]);
            mapIdsToCategories.put(category.getId(), category);
        }
    }

    public static Category getCategory(String id) {
        return mapIdsToCategories.get(id);
    }
}
