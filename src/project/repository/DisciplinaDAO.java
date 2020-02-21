/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.repository;

import java.util.List;
import javax.persistence.EntityManager;
import project.model.Disciplinas;
import javax.persistence.Query;

/**
 *
 * @author Yara Sereia do Cerrado
 */
public class DisciplinaDAO extends DAORepositorio {

    public DisciplinaDAO(EntityManager entityManager) {
        super(entityManager);
    }
    
    @Override
    public <T> T find(Integer i) {
       return (T) this.entityManager.find(Disciplinas.class, i);
    }

    @Override
    public <T> List<T> getALL() {
         Query query = this.entityManager.createQuery("SELECT p FROM Aluno p");
        return query.getResultList();
    }
    
}
