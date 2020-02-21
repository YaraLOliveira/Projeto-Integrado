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
import project.model.Alunos;
import project.repository.AlunoDAO;
import project.repository.UsuarioDAO;

/**
 *
 * @author Yara
 */
public class AlunoControle {
    AlunoDAO yAlunoRepository = null;
    UsuarioDAO yPessoaRepository = null;
    
    EntityManagerFactory mEntityManagerFactory = null;
    EntityManager entityManager = null;
    
        public AlunoControle(){
            mEntityManagerFactory = Persistence.createEntityManagerFactory("pi.tuquedeixaPU");
            entityManager = mEntityManagerFactory.createEntityManager();
            yAlunoRepository = new AlunoDAO(entityManager);    
    }

    public void inserirAluno(Alunos mAluno){
        yAlunoRepository.save(mAluno);
    }
    
    public void alterarAluno(Alunos mAluno){
        yAlunoRepository.update(mAluno);
    }
    
    public Alunos consultarPorId(int ID){
        return yAlunoRepository.find(ID);
    }
    
    public List<Alunos> listarAlunos(){
       
        return yAlunoRepository.getALL();
    }
    
}
