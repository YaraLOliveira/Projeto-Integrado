/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import project.model.Turmas;

/**
 *
 * @author Yara Sereia do Cerrado
 */
public class TurmaDAO extends DAORepositorio {

    public TurmaDAO(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public <T> T find(Integer i) {
        return (T) this.entityManager.find(Turmas.class, i);
    }

    @Override
    public <T> List<T> getALL() {
        Query query = this.entityManager.createQuery("SELECT f FROM Turma f");
        return query.getResultList();
    }
    
}
