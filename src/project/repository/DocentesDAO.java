/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.repository;

import java.util.List;
import javax.persistence.EntityManager;
import project.model.Docentes;


/**
 *
 * @author Yara
 */
public class DocentesDAO extends DAORepositorio {

    public DocentesDAO(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public <T> T find(Integer i) {
        return (T) this.entityManager.find(Docentes.class, i);

    }

    @Override
    public <T> List<T> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
