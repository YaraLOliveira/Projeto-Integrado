/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroes;

/**
 *
 * @author Yara
 */
public abstract class Reloj {

    protected int hora, minutos, segundos;
    
    public abstract void mostrarHora();
    public abstract String obtenerHora();
}

