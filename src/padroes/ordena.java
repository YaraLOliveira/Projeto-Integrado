/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroes;

import project.model.SecretaryHistorico;

/**
 *
 * @author Yara
 */
public class ordena extends  Template {

    public ordena(String temp) {
        super(temp);
    }

    @Override
    public boolean ePrimeiro(SecretaryHistorico hist1, SecretaryHistorico hist2) {
       if (hist1.getAvaliacao().getFrequencia().compareToIgnoreCase(hist2.getAvaliacao().getFrequencia())<= 0) {
            return true;
        } else {
            return false;
        }
    }
} 
