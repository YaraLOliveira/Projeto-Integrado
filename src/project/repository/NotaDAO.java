/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.repository;

import project.model.Notas;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


/**
 *
 * @author Yara Sereia do Cerrado
 */
public class NotaDAO extends DAORepositorio  {

    public NotaDAO(EntityManager entityManager) {
        super(entityManager);
    }


    @Override
    public <T> T find(Integer i) {
       return (T) this.entityManager.find(Notas.class, i);
    }

    @Override
    public <T> List<T> getALL() {
         Query query = this.entityManager.createQuery("SELECT p FROM Aluno p");
        return query.getResultList();
    }

}
