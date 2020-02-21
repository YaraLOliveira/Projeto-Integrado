/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.model;

/**
 *
 * @author Yara Sereia do Cerrado
 */


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;
import project.enuns.Perfil;

@Entity
@Table(name = "usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public class Person <T> extends Usuario implements Serializable{

    @Transient
    private T tx;

    public T getT() {
        return tx;
    }

    public void setT(T t) {
        this.tx = tx;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_person;

    public Integer getId_person() {
        return id_person;
    }
    private String nomeUsuario;
    private String cidadeUsuario;
    private String endereco;
    private String telefoneUsuario;
    private char tipoCadastro;

    public Person(String nomeUsuario, String cidadeUsuario, String endereco, String telefoneUsuario, char tipoCadastro, String usuNome, String usuSenha, Perfil perfil) {
        super(usuNome, usuSenha, perfil);
        this.nomeUsuario = nomeUsuario;
        this.cidadeUsuario = cidadeUsuario;
        this.endereco = endereco;
        this.telefoneUsuario = telefoneUsuario;
        this.tipoCadastro = tipoCadastro;
    }

    public Person(Integer id_person, String nomeUsuario, String telefoneUsuario, String usuNome, String usuSenha, Perfil perfil) {
        super(usuNome, usuSenha, perfil);
        this.id_person = id_person;
        this.nomeUsuario = nomeUsuario;
        this.telefoneUsuario = telefoneUsuario;
    }

    public Person() {
    }





    public void setId_person(Integer id_person) {
        this.id_person = id_person;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getCidadeUsuario() {
        return cidadeUsuario;
    }

    public void setCidadeUsuario(String cidadeUsuario) {
        this.cidadeUsuario = cidadeUsuario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(String telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    public char getTipoCadastro() {
        return tipoCadastro;
    }

    public void setTipoCadastro(char tipoCadastro) {
        this.tipoCadastro = tipoCadastro;
    }

    public String getUsuNome() {
        return usuNome;
    }

    public void setUsuNome(String usuNome) {
        this.usuNome = usuNome;
    }

    public String getUsuSenha() {
        return usuSenha;
    }

    public void setUsuSenha(String usuSenha) {
        this.usuSenha = usuSenha;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    
    
    
}
