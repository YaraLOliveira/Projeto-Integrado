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
public enum Departamento {
    SECRETARIA(0),
    RECURSOS_HUMANOS(1),
    ACADEMICO(2);
    
    private final Integer tipoDepartamento;

    private Departamento(Integer tipoDepartamento) {
        this.tipoDepartamento = tipoDepartamento;
    }
    
    public Integer getTipoDepartamento(){
        return this.tipoDepartamento;
    }
}
