package project.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Yara 
 */
public class ConectionSingleton {

//    private Connection conexao;
    private final String url = "jdbc:postgresql://localhost:5432/postgres"; // peguntar 
    private final String user = "postgres";
    private final String password = "aluno";
    private static EntityManagerFactory entityF;
    private static EntityManager entity;

    private ConectionSingleton() {
        entityF = Persistence.createEntityManagerFactory("pi.tuquedeixaPU");
    }
    
    public static EntityManager getEntity(){
        entityF = Persistence.createEntityManagerFactory("pi.tuquedeixaPU");
        if(entity == null){
            entity = entityF.createEntityManager();
            return entity;
        }else{
            return entity;
        }
    }
//
//    private ConectionSingleton() {
//        try {
//            Class.forName("org.postgressql.Driver");
//            JOptionPane.showMessageDialog(null, "Driver pronto.");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Driver não encontrado");
//        }
//
//        try {
//            this.conexao = DriverManager.getConnection(url, user, password);
//            JOptionPane.showMessageDialog(null, "conecxao pronta!");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//    }

    //CONEXAO SINGLETON
//    public static ConectionSingleton getINSTANCE() {
//        if (INSTANCE == null) {
//            INSTANCE = Persistence.createEntityManagerFactory("pi.tuquedeixaPU");
//        }
//        return (ConectionSingleton) INSTANCE;
//    }
//
//    public EntityManager getEntityManager() {
//        return (EntityManager) this.conexao;
//    }

}
