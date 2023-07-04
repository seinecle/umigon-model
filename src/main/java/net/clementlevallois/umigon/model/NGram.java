/*
 * author:  Levallois
 */
package net.clementlevallois.umigon.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LEVALLOIS
 */
public class NGram extends TextFragment implements Serializable {

    private List<Term> terms = new ArrayList();

    public List<Term> getTerms() {
        return terms;
    }

    public void setTerms(List<Term> terms) {
        this.terms = terms;
    }
    
    @Override
    public TypeOfTextFragment.TypeOfTextFragmentEnum getTypeOfTextFragmentEnum() {
        return TypeOfTextFragment.TypeOfTextFragmentEnum.NGRAM;
    }
   
    public String getCleanedAndStrippedNgram(){
        StringBuilder sb = new StringBuilder();
        for (Term term: terms){
            sb.append(term.getCleanedAndStrippedForm());
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public String getCleanedAndStrippedNgramIfCondition(boolean stripped){
        StringBuilder sb = new StringBuilder();
        for (Term term: terms){
            sb.append(term.getCleanedAndStrippedIfCondition(stripped));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public String getCleanedNgram(){
        StringBuilder sb = new StringBuilder();
        for (Term term: terms){
            sb.append(term.getCleanedForm());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    
    
    
}
