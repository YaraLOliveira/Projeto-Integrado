package project.model;

import project.enuns.Perfil;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
public abstract class Usuario {
    
    @Column (name = "usu_nome", nullable = false, unique = true)
     String usuNome;
    @Column (name = "password", nullable = false, unique = true)
     String usuSenha;
    @Column (name = "usu_perfil", nullable = false, unique = true)
     Perfil perfil;

    public Usuario(String usuNome, String usuSenha, Perfil perfil) {
        this.usuNome = usuNome;
        this.usuSenha = usuSenha;
        this.perfil = perfil;
    }

    public Usuario() {
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
