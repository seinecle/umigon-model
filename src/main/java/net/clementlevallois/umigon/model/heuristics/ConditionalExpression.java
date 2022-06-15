/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.clementlevallois.umigon.model.heuristics;

import java.util.Set;

/**
 *
 * @author LEVALLOIS
 */
public class ConditionalExpression {

    String condition;
    Set<String> keywords;
    Boolean flipped;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition, Boolean flipped) {
        this.condition = condition;
        this.flipped = flipped;
        
    }

    public Set<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(Set<String> keywords) {
        this.keywords = keywords;
    }

    public Boolean getFlipped() {
        return flipped;
    }

    public void setFlipped(Boolean flipped) {
        this.flipped = flipped;
    }
    
    

}
