/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroes;

import java.util.ArrayList;

/**
 *
 * @author Yara
 * /
 * ///
 * /*/
public abstract class Decorador extends Reloj{

    private ArrayList<Reloj> relojes = new ArrayList();

    public Decorador(Reloj reloj){
        relojes.add(reloj);
    }
   
    
}
