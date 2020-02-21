package project.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.swing.JComboBox;

/**
 *
 * @author Yara 
 * /*/

@Entity
@Table(name = "curso")
public class Cursos <T> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    protected Integer id_curso;


     
    @Column(name = "nome_curso")
    protected String descricao;
    
    @Column(name = "coordenador_curso")
    protected Integer coordenador; //import login decorator professor
    
    @Column(name = "coordenador_curso")
    protected char status;    
    
    
    public Cursos(String descricao, JComboBox<String> coordenador, char situacao) {
       
    }
        public Cursos(String descricao, Integer coordenador, char status) {
        this.descricao = descricao;
        this.coordenador = coordenador;
        this.status = status;
    }

    public Cursos() {
    }
        

    public Integer getId_curso() {
        return id_curso;
    }

    public void setId_curso(Integer id_curso) {
        this.id_curso = id_curso;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Integer coordenador) {
        this.coordenador = coordenador;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

   
}
