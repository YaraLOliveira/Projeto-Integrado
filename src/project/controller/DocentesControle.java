/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.controller;

import java.util.List;
import javax.persistence.EntityManager;
import project.enuns.Departamento;
import project.enuns.TipoCurso;
import project.model.Docentes;
import project.repository.DocentesDAO;

/**
 *
 * @author Yara
 */
public class DocentesControle {
    private Docentes docentes;
    private DocentesDAO docentesRepository;
    private EntityManager entityManager;
    
    public DocentesControle(Docentes docente, EntityManager entityManager){
        this.entityManager = entityManager;
        this.docentesRepository = new DocentesDAO(entityManager);
        this.docentes = docente;
    }
        public DocentesControle(EntityManager entityManager){
        this.entityManager = entityManager;
        this.docentesRepository = new DocentesDAO(entityManager);
        this.docentes = new Docentes();
    }
        
    public void inserir(){
        this.docentesRepository.save(docentes);
    }
    
    public void alterar(){
        this.docentesRepository.update(docentes);
    }
    
    public Docentes consultarPorId(Integer id){
        this.docentes = this.docentesRepository.find(id);
        return this.docentes;
    }
    
    public List<Docentes> listar(){
        return this.docentesRepository.getALL();
    }
    
}
