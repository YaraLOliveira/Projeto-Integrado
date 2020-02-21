/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.repository;

import java.util.List;

/**
 *
 * @author Yara
 */
public class Tipo {
       private DAO DAO;

    public Tipo(DAO DAO) {
        this.DAO = DAO;
    }
       

    public DAO getPersistence() {
        return DAO;
    }

    public void setPersistence(DAO persistence) {
        this.DAO = persistence;
    }

    public <T> void save(T t) {
        DAO.save(t);
    }

    public <T> void update(T t) {
        DAO.update(t);
    }
    
    public <T> T find(int i){
        return (T) DAO.find(i);
    }
    
    public <T> List<T> lista(){
        return DAO.getALL();
    }
    
}
