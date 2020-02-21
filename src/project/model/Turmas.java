package project.model;

import java.io.Serializable;

/**
 *
 * @author Yara Sereia do Cerrado
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import project.enuns.Situation;

@Entity
@Table(name = "turma")
public class Turmas <T> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_turma")
    protected Integer idTurma;
    @Column
    protected int horario;
    @Column
    protected String diasSemana;
    
    @Column(name = "nome_turma", length=255,nullable=false)
    protected String discricao;
    @Column
    protected Docentes professorResponsavel;
    
    protected Disciplinas disciplina;
    
    @Column(name = "semestre_turma", length=4,nullable=false)
    protected String anoSemestre;
    
    
    @Column(name = "situacao_turma", length=4,nullable=false)
    protected Situation status;
    
    //add professor
    
    //@ElementCollection
    
//    @OneToMany(mappedBy = "turma", cascade = CascadeType.ALL)
    List<Alunos> alunosMatriculados;
//    protected Alunos aluno;

    public Turmas(Integer idTurma, int horario, String diasSemana, String discricao, Docentes professorResponsavel, Disciplinas disciplina, String anoSemestre, Situation status, List<Alunos> alunosMatriculados) {
        this.idTurma = idTurma;
        this.horario = horario;
        this.diasSemana = diasSemana;
        this.discricao = discricao;
        this.professorResponsavel = professorResponsavel;
        this.disciplina = disciplina;
        this.anoSemestre = anoSemestre;
        this.status = status;
        this.alunosMatriculados = alunosMatriculados;
        
    }

    public Turmas(int horario, String diasSemana, String discricao, String anoSemestre) {
        this.horario = horario;
        this.diasSemana = diasSemana;
        this.discricao = discricao;
        this.anoSemestre = anoSemestre;
    }
    
    
    

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(String diasSemana) {
        this.diasSemana = diasSemana;
    }

    
        public Docentes getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Docentes professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }
    
    public String getDiscricao() {
        return discricao;
    }

    public void setDiscricao(String discricao) {
        this.discricao = discricao;
    }

//    public Alunos getAluno() {
//        return aluno;
//    }
//
//    public void setAluno(Alunos aluno) {
//        this.aluno = aluno;
//    }

    public Integer getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(Integer idTurma) {
        this.idTurma = idTurma;
    }

    public Disciplinas getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplinas disciplina) {
        this.disciplina = disciplina;
    }

    public String getAnoSemestre() {
        return anoSemestre;
    }

    public void setAnoSemestre(String anoSemestre) {
        this.anoSemestre = anoSemestre;
    }

    public Situation getStatus() {
        return status;
    }

    public void setStatus(Situation status) {
        this.status = status;
    }

    public Iterator<Alunos> getAlunosMatriculados() {
        return alunosMatriculados.iterator();
    }

    public void setAlunosMatriculados(List<Alunos> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

    




}
