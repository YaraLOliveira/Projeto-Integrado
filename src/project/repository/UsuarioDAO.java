/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.repository;

import java.sql.Connection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import project.model.Person;

/**
 *
 * @author Yara Sereia do Cerrado
 */
public class UsuarioDAO extends DAORepositorio {

    public UsuarioDAO(EntityManager entityManager) {
        super(entityManager);
    }
      
     public Person listarResultadoBuscaLogin(String login, String senha) {
        TypedQuery<Person> query = entityManager.createQuery("SELECT p FROM Pessoa p"
                + " WHERE p.usuario = :user AND p.senha = :pwd", Person.class);
        query.setParameter("user", login);
        query.setParameter("pwd", senha);
        Person p = null;
        try {
            p = query.getSingleResult();
        } catch (NoResultException e) {

        }
        return p;
    }

    
    @Override
    public <T> T find(Integer i) {
        return (T) this.entityManager.find(Person.class, i);
    }

    @Override
    public <T> List<T> getALL() {
       Query query = this.entityManager.createQuery("SELECT p FROM Aluno p");
       return query.getResultList();
    }
    
}
