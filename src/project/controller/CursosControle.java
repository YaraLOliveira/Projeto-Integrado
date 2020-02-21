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
import project.model.Cursos;
import project.repository.CursoDAO;
import project.repository.UsuarioDAO;

/**
 *
 * @author Yara
 */
public class CursosControle {
    CursoDAO yCursoRepository = null;
    UsuarioDAO yPessoaRepository = null;
    
    EntityManagerFactory mEntityManagerFactory = null;
    EntityManager entityManager = null;
    
    
    public CursosControle(){
            mEntityManagerFactory = Persistence.createEntityManagerFactory("com.leonardoCamargo_ControleAcademico_jar_1.0-SNAPSHOTPU");
            entityManager = mEntityManagerFactory.createEntityManager();
            yCursoRepository = new CursoDAO(entityManager);    
    }
    
    public void inserirCurso(Cursos mCurso){
        yCursoRepository.save(mCurso);
    }
    
    public void alterarCurso(Cursos mCurso){
        yCursoRepository.update(mCurso);
    }
    
    public Cursos consultarPorId(int ID){
        return yCursoRepository.find(ID);
    }
    
    public List<Cursos> listar(){
        return yCursoRepository.getALL();
    }
    
}
