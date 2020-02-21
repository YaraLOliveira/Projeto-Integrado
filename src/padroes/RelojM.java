/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroes;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Yara
 */
public class RelojM extends Decorador{

    public RelojM(Reloj reloj) {
        super(reloj);
    }

    @Override
    public void mostrarHora() {
        JOptionPane.showMessageDialog(null, obtenerHora());
    }

    @Override
    public String obtenerHora() {
        Calendar calendario = Calendar.getInstance();
        hora =  calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        String mensaje1 = Integer.toString(hora);
        String mensaje2 = Integer.toString(minutos);
        return mensaje1+":"+mensaje2;
    }
    
}

