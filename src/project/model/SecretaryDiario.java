/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.model;

import java.util.ArrayList;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import sun.security.x509.AVA;

/**
 *
 * @author Yara Sereia do Cerrado
 */
public class SecretaryDiario <T> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Notas avaliacao;
    protected long id_diario;
    Disciplinas disciplina;
    Docentes funcionario;
    Turmas turma;;

    public SecretaryDiario(long id_aluno, Disciplinas disciplina, Docentes funcionario, Turmas turma) {
        this.id_diario = id_aluno;
        this.disciplina = disciplina;
        this.funcionario = funcionario;
        this.turma = turma;
    }

    public Notas getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Notas avaliacao) {
        this.avaliacao = avaliacao;
    }
    

    public long getId_diario() {
        return id_diario;
    }

    public void setId_diario(long id_diario) {
        this.id_diario = id_diario;
    }

    public Disciplinas getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplinas disciplina) {
        this.disciplina = disciplina;
    }

    public Docentes getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Docentes funcionario) {
        this.funcionario = funcionario;
    }

    public Turmas getTurma() {
        return turma;
    }

    public void setTurma(Turmas turma) {
        this.turma = turma;
    }
  
       
}
