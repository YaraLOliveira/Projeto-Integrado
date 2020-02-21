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
public class SecretaryHistorico {
    private Notas avaliacao;
    private Turmas turma;

    public SecretaryHistorico(Notas avaliacao, Turmas turma) {
        this.avaliacao = avaliacao;
        this.turma = turma;
    }

    public Notas getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Notas avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Turmas getTurma() {
        return turma;
    }

    public void setTurma(Turmas turma) {
        this.turma = turma;
    }


}


