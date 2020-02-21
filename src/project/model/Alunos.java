package project.model;

import java.io.Serializable;

/**
 *
 * @author Yara 
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import project.enuns.Perfil;

@Entity
@Table(name = "aluno")
public class Alunos extends Person implements Serializable {
   
    @Column(name = "dInicio_aluno", length=10,nullable=false)
    protected String dateStart;
    @Column(name = "dFim_aluno", length=255 ,nullable=false)
    protected String dateFinish;
    
    protected Integer idcurso;
    
    @Column(name = "situacao_aluno", length=255 ,nullable=false)
    protected String situacao;

    
    //construtor

    public Alunos(String dateStart, String dateFinish, Integer idcurso, String situacao, String nomeUsuario, String cidadeUsuario, String endereco, String telefoneUsuario, char tipoCadastro, String usuNome, String usuSenha, Perfil perfil) {
        super(nomeUsuario, cidadeUsuario, endereco, telefoneUsuario, tipoCadastro, usuNome, usuSenha, perfil);
        this.dateStart = dateStart;
        this.dateFinish = dateFinish;
        this.idcurso = idcurso;
        this.situacao = situacao;
    }
    

    public Alunos(Integer idcurso, Integer id_person, String nomeUsuario, String telefoneUsuario, String usuNome, String usuSenha, Perfil perfil) {
        super(id_person, nomeUsuario, telefoneUsuario, usuNome, usuSenha, perfil);
        this.idcurso = idcurso;
    }

    public Alunos(String dateStart, String dateFinish, Integer idcurso, String situacao) {
        this.dateStart = dateStart;
        this.dateFinish = dateFinish;
        this.idcurso = idcurso;
        this.situacao = situacao;
    }

    
    

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(String dateFinish) {
        this.dateFinish = dateFinish;
    }

    public Integer getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Integer idcurso) {
        this.idcurso = idcurso;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }



       

    
}
