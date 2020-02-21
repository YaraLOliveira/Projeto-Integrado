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
public enum TipoCurso {
     GRADUADO(0), POS_GRADUADO(1), MESTRE(2), DOUTOR(3), PHD(4), ENS_MEDIO(5), ENS_FUNDAMENTAL(6);
   
   private final Integer TipoCursos;

    private TipoCurso(Integer tipoTitulacao) {
        this.TipoCursos = tipoTitulacao;
    }
    
    public Integer getTipoTitulacao(){
        return this.TipoCursos;
    }
}
