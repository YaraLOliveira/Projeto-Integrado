/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.enuns;

/**
 *
 * @author Yara
 */
public enum Situation {
    ATIVA(1), INATIVA(0);
    
    private final Integer situacaoAtual;

    private Situation(Integer situacaoAtual) {
        this.situacaoAtual = situacaoAtual;
    }
    
    public Integer getSituacao(){
        return this.situacaoAtual;
    }
    
}
