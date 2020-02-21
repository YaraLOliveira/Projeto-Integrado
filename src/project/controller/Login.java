package project.controller;

import java.util.List;
import javax.persistence.EntityManager;
import project.connection.ConectionSingleton;

import project.model.Person;
import project.repository.AlunoDAO;
import project.repository.DocentesDAO;
import project.repository.Tipo;
import project.repository.UsuarioDAO;



public class Login extends javax.swing.JFrame{
    
    private String informeSenha;
    private String informeLogin;
    private UsuarioDAO pessoaPersist;
    private Person pessoa;
    private Tipo persist;
    
    public Login(String id_usuario, String senha) {
        
        //acessa o banco de dados
        pessoaPersist = new UsuarioDAO(ConectionSingleton.getEntity());
        persist = new Tipo(pessoaPersist);

        //preenche os parametros passados no construtor
        this.informeSenha = informeSenha;
        this.informeLogin = informeLogin;

        //preenche um objeto p provsório do tipo pessoa
        Person p = pessoaPersist.listarResultadoBuscaLogin(informeLogin, informeSenha);

        //preenche variável pessoa com uma instancia de aluno ou de funcionário
        preenchePessoa(p);
    }
        private void preenchePessoa(Person p) {
        if (p != null) {
            if (p.getTipoCadastro() == 'A') {
                persist.setPersistence(new AlunoDAO(ConectionSingleton.getEntity()));
                pessoa = persist.find(p.getId_person());
            } else {
                persist.setPersistence(new DocentesDAO (ConectionSingleton.getEntity()));
                pessoa = persist.find(p.getId_person());
            }

        }
    
    }
    public javax.swing.JFrame renderizaTela() {
        return MainMenuFactory.getMainMenu(pessoa.getPerfil());
    }
}

 