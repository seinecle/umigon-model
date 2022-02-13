/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.clementlevallois.umigon.model;

import net.clementlevallois.umigon.model.Categories.Category;

/**
 *
 * @author LEVALLOIS
 */
public class CategoryAndIndex {
    
    private Category category;
    private int index;

    public CategoryAndIndex(Category category, int index) {
        this.category = category;
        this.index = index;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    
    
}
