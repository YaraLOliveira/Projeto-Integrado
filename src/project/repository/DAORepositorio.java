/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.repository;

/**
 *
 * @author Yara
 */

import javax.persistence.EntityManager;
 

public abstract class DAORepositorio implements DAO{
    
    EntityManager entityManager;

    public DAORepositorio(EntityManager entityManager) {
         this.entityManager = entityManager;
    }
    
    

@Override
    public <T> void save(T f) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(f);
        this.entityManager.getTransaction().commit();
    }

    @Override
    public <T> void update(T f) {
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(f);
        this.entityManager.getTransaction().commit();
    }
    
}
