package project.view;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import project.connection.ConectionSingleton;
import project.model.Alunos;
import project.model.Notas;
import project.model.Turmas;
import project.repository.NotaDAO;
import project.repository.Tipo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yara
 */
public class ProfessorPerspective extends javax.swing.JFrame {

    Alunos aluno = null;
    Turmas turma = null;
    Notas nota = null;
    Tipo persist;

    /**
     * Creates new form ProfessorPerspective
     */
    public ProfessorPerspective() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public ProfessorPerspective(Notas nota) {
        initComponents();
        dados(nota);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        frequencia = new javax.swing.JTextField();
        salvar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nota2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        notaFinal = new javax.swing.JTextField();
        IDaluno = new javax.swing.JTextField();
        IDturma = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        buscarIDaluno = new javax.swing.JButton();
        idNota = new javax.swing.JButton();
        nota1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        IDturma1 = new javax.swing.JTextField();
        buscarIDturma2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Turma:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("id:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Nota I:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, 20));

        frequencia.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        frequencia.setText("  , %");
        frequencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frequenciaActionPerformed(evt);
            }
        });
        getContentPane().add(frequencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 84, -1));

        salvar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        salvar.setText("Lançar Nota");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        getContentPane().add(salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        voltar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        voltar.setText("voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Turma", "Disciplina", "Aluno", "Nota I", "Nota II", "Nota Final"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 680, 210));

        nota2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(nota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 83, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Nota II:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Nota Final:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, 20));

        notaFinal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(notaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 84, -1));
        getContentPane().add(IDaluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 110, -1));

        IDturma.setText("jTextField4");
        getContentPane().add(IDturma, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 60, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Frequencia:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 100, -1));

        buscarIDaluno.setText("...");
        buscarIDaluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarIDalunoActionPerformed(evt);
            }
        });
        getContentPane().add(buscarIDaluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, 20));

        idNota.setText("...");
        idNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idNotaActionPerformed(evt);
            }
        });
        getContentPane().add(idNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, -1, 20));

        nota1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(nota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 84, -1));

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        jLabel6.setFont(new java.awt.Font("Onyx", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PROFESSOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel6)
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 90));
        getContentPane().add(IDturma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 110, 20));

        buscarIDturma2.setText("...");
        buscarIDturma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarIDturma2ActionPerformed(evt);
            }
        });
        getContentPane().add(buscarIDturma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, 20));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Aluno:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        // TODO add your handling code here:
        persist = new Tipo(new NotaDAO((ConectionSingleton.getEntity())));

        try {
            // mAlunoController = new AlunoController();
            if (isInsert()) {
                nota = unir();
                persist.save(nota);
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
            } else {
                nota = persist.find(Integer.parseInt(idNota.getText()));
                atualizar(nota);
                persist.update(nota);
                JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso");
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_salvarActionPerformed

    private void buscarIDalunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarIDalunoActionPerformed
        // TODO add your handling code here:
        ConsultarAlunos f = new ConsultarAlunos();
        f.setVisible(true);
    }//GEN-LAST:event_buscarIDalunoActionPerformed

    private void idNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idNotaActionPerformed
        // TODO add your handling code here:
        ConsultarTurma f = new ConsultarTurma();
        f.setVisible(true);
    }//GEN-LAST:event_idNotaActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        Menu f = new Menu();
        f.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void frequenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frequenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frequenciaActionPerformed

    private void buscarIDturma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarIDturma2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarIDturma2ActionPerformed

    public void dadosIDTurma(Turmas turma) {
        IDturma.setText(turma.getIdTurma().toString());
    }

    public void dadosIDaluno(Alunos aluno) {
        IDaluno.setText(aluno.getId_person().toString());
    }

    public boolean isInsert() {
        String id = idNota.getText();
        return id.isEmpty();
    }

    public void atualizar(Notas nota) {
        nota.setNota1(nota1.getText());
        nota.setNota2(nota2.getText());
        nota.setNotaFinal(notaFinal.getText());
        nota.setFrequencia(frequencia.getText());
        nota.setAluno(aluno);
        nota.setTurma(turma);
    }

    public Notas unir() {
        Integer Aluno = aluno.getId_person();
        Integer Turma = turma.getIdTurma();
        persist = new Tipo(new NotaDAO(ConectionSingleton.getEntity()));
        String notas1 = (nota1.getText());
        String notas2 = (nota2.getText());
        String notasfinal = (notaFinal.getText());
        String freq = (frequencia.getText());
        return new Notas(aluno, turma, notas1, notas2, notasfinal, freq);
    }

    public void dados(Notas nota) {
        idNota.setText(nota.getAvaliacaoId().toString());
        nota1.setText((nota.getNota1()));
        nota2.setText((nota.getNota2()));
        notaFinal.setText((nota.getNotaFinal()));
        frequencia.setText((nota.getFrequencia()));
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentPerspective().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDaluno;
    private javax.swing.JTextField IDturma;
    private javax.swing.JTextField IDturma1;
    private javax.swing.JButton buscarIDaluno;
    private javax.swing.JButton buscarIDturma2;
    private javax.swing.JTextField frequencia;
    private javax.swing.JButton idNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nota1;
    private javax.swing.JTextField nota2;
    private javax.swing.JTextField notaFinal;
    private javax.swing.JButton salvar;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
