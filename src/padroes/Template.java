/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroes;

import java.util.ArrayList;
import java.util.Iterator;
import project.model.SecretaryHistorico;

/**
 *
 * @author Yara Sereia do Cerrado
 */
public abstract class Template {

    private String t;

    public Template(String temp) {
        t = temp;
    }

    public abstract boolean ePrimeiro(SecretaryHistorico hist1, SecretaryHistorico hist2);

    public Iterator<SecretaryHistorico> listagem() throws Exception {
        try {
            ArrayList<SecretaryHistorico> array = new ArrayList<SecretaryHistorico>();
            for (int i = 0; i < array.size(); i++) {
                for (int j = i; j < array.size(); j++) {

                    if (!ePrimeiro(array.get(i), array.get(j))) {
                        SecretaryHistorico temp = array.get(j);
                        array.set(j, array.get(i));
                        array.set(i, temp);
                    }
                }
            }
            return array.iterator();
        } catch (Exception erro) {
            throw erro;
        }
    }

}
