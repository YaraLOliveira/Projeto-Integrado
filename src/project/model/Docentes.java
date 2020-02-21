/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.model;

import java.io.Serializable;
import project.enuns.Departamento;
import project.enuns.Perfil;
import project.enuns.TipoCurso;

/**
 *
 * @author Yara
 */
public class Docentes extends Person implements Serializable{
    
    protected Departamento departamentoFuncionario;
    protected TipoCurso titulacaoFuncionario;

    public Docentes() {}

    public Docentes(Departamento departamentoFuncionario, TipoCurso titulacaoFuncionario, String nomeUsuario, String cidadeUsuario, String endereco, String telefoneUsuario, char tipoCadastro, String usuNome, String usuSenha, Perfil perfil) {
        super(nomeUsuario, cidadeUsuario, endereco, telefoneUsuario, tipoCadastro, usuNome, usuSenha, perfil);
        this.departamentoFuncionario = departamentoFuncionario;
        this.titulacaoFuncionario = titulacaoFuncionario;
    }




    public TipoCurso getTitulacaoFuncionario() {
        return titulacaoFuncionario;
    }

    public Departamento getDepartamentoFuncionario() {
        return departamentoFuncionario;
    }

    public void setDepartamentoFuncionario(Departamento departamentoFuncionario) {
        this.departamentoFuncionario = departamentoFuncionario;
    }


    public void setTitulacaoFuncionario(TipoCurso titulacaoFuncionario) {
        this.titulacaoFuncionario = titulacaoFuncionario;
    }
}
