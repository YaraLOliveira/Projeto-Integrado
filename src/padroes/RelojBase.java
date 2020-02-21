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
import java.util.Calendar;
import javax.swing.JOptionPane;


public class RelojBase extends Reloj{

    @Override
    public void mostrarHora() {
        JOptionPane.showMessageDialog(null, obtenerHora());
    }

    @Override
    public String obtenerHora() {
        Calendar calendario = Calendar.getInstance();
        hora =  calendario.get(Calendar.HOUR_OF_DAY);
        String mensaje = Integer.toString(hora);
        return mensaje;
    }
    
}