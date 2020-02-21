package project.model;

/**
 *  
 * @author Yara
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; 
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
@Table(name = "disciplinas")
public class Disciplinas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_disciplina")
    protected Integer id_disciplina;
        @OneToOne
    @JoinColumn(name = "id_curso")
    private Cursos id_curso;


        
    @Column(name = "nome_disciplina", length=255 ,nullable=false)
    protected String descricao;
    
    @Column(name = "cargaHoraria_disciplina", length=25 ,nullable=false)
    protected Integer cargaHoraria;
   
    @Column(name = "emenda_disciplina", length=255 ,nullable=false)
    protected String emenda;
    
    @Column(name = "bibliografia_disciplina", length=255 ,nullable=false)
    protected String bibliografia;
    
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "prerequisito", joinColumns = @JoinColumn(name = "id_disciplina"),
             inverseJoinColumns = @JoinColumn(name = "id_prereq"))
    protected List<Disciplinas> preRequisitos;

    
    
        public Disciplinas(Cursos id_curso, String descricao, Integer cargaHoraria, String emenda, String bibliografia) {
        this.id_curso = id_curso;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.emenda = emenda;
        this.bibliografia = bibliografia;
        preRequisitos = new ArrayList<>();
    }

    public Integer getId_disciplina() {
        return id_disciplina;
    }

    public void setId_disciplina(Integer id_disciplina) {
        this.id_disciplina = id_disciplina;
    }

        
       public Cursos getId_curso(){
        return id_curso;
    }

    public void setId_curso(Cursos id_curso) {
        this.id_curso = id_curso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getEmenda() {
        return emenda;
    }

    public void setEmenda(String emenda) {
        this.emenda = emenda;
    }

    public String getBibliografia() {
        return bibliografia;
    }

    //get e set
    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }
    
        public void setDisciplinaPreRequisito(Disciplinas disciplina){
        preRequisitos.add(disciplina);
    }

    public Iterator<Disciplinas> getIterator() {
        return preRequisitos.iterator();
    }
    
    

}
