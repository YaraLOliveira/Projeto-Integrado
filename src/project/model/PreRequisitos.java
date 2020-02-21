/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.model;


import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Yara
 */
@Entity
@Table(name = "prerequisito")
public class PreRequisitos<T> {

    public PreRequisitos(int codprereq, Disciplinas preRequisito) {
        this.codprereq = codprereq;
        this.preRequisito = preRequisito;
    }
    @Id 
    private int codprereq;
    @Id
    @ManyToMany
    @JoinColumn
    private Disciplinas preRequisito;

    public int getCodprereq() {
        return codprereq;
    }

    public void setCodprereq(int codprereq) {
        this.codprereq = codprereq;
    }

    public Disciplinas getPreRequisito() {
        return preRequisito;
    }

    public void setPreRequisito(Disciplinas preRequisito) {
        this.preRequisito = preRequisito;
    }
    
    
}
