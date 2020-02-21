/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import project.model.Notas;
import project.repository.NotaDAO;
import project.repository.UsuarioDAO;

/**
 *
 * @author Yara
 */
public class NotaControle {
    UsuarioDAO yPessoaRepository = null;
    NotaDAO yNotaRepository = null;
    
    EntityManagerFactory mEntityManagerFactory = null;
    EntityManager entityManager = null;

    public NotaControle() {
        mEntityManagerFactory = Persistence.createEntityManagerFactory("pi.tuquedeixaPU");
        entityManager = mEntityManagerFactory.createEntityManager();
        yNotaRepository = new NotaDAO(entityManager);  
    }
    
    public void inserirNota(Notas notas){
        yNotaRepository.save(notas);
    }
    
    public void alterarNota(Notas notas){
        yNotaRepository.update(notas);
    }
    
    public Notas consultarPorId(int ID){
        return yNotaRepository.find(ID);
    }
    
    public List<Notas> listarNota(){
       
        return yNotaRepository.getALL();
    }
    
    
    
}
