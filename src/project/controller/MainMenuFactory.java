/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.controller;

import project.enuns.Perfil;
import project.view.Menu;



/**
 *
 * @author Yara
 */
public class MainMenuFactory {
    
    public static javax.swing.JFrame getMainMenu(Perfil perfil){
        //para referência favor consultar a classe Menu_Principal
        switch(perfil){
            case ADMIN:
                return new Menu(true, true, true, true, true);
            case COORDENADOR:
                return new Menu(false, false, true, false, false);
            case PROFESSOR:
                return new Menu(false,false,false,false, false);
            case ALUNO:
                return new Menu(false,false,false,false, true);
            case RECURSOS_HUMANOS:
                return new Menu(false,false,false,true, false);
            case SECRETARIA:
                return new Menu(true,false,false,false, false);
            default:
                return new Menu(false,false,false,false, false);
        
        }
    } 
    
}
