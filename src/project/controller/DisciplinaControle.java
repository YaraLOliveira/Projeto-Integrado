/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.controller;

import java.util.List;
import javax.persistence.EntityManager;
import project.connection.ConectionSingleton;
import project.model.Disciplinas;
import project.repository.DisciplinaDAO;
import project.repository.Tipo;

/**
 *
 * @author Yara
 */
public class DisciplinaControle {
    DisciplinaDAO mDisciplinaRepository = null;
    Tipo persistenciaGeral;
    
    public DisciplinaControle() {
        mDisciplinaRepository = new DisciplinaDAO((ConectionSingleton.getEntity()));
        persistenciaGeral = new Tipo(mDisciplinaRepository);
    }

    public void inserirDisciplina(Disciplinas mDisciplina) {
        persistenciaGeral.save(mDisciplina);
    }

    public void alterarDisciplina(Disciplinas mDisciplina) {
        persistenciaGeral.update(mDisciplina);
    }

    public Disciplinas consultarPorId(int ID) {
        return persistenciaGeral.find(ID);
    }

    public List<Disciplinas> listarDisciplinas() {
        return persistenciaGeral.lista();
    }
}
