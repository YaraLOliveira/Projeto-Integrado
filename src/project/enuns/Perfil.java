
package project.enuns;

public enum Perfil {
    
    ALUNO(1) , 
    RECURSOS_HUMANOS(2),
    SECRETARIA(3),
    COORDENADOR (4),
    PROFESSOR (5)
    , ADMIN(6);

    
    
    private int codigo;
    
    private Perfil(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
    
    

    
    
    
}
