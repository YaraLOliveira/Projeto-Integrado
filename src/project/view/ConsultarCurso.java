/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.connection.ConectionSingleton;
import project.model.Cursos;
import project.repository.CursoDAO;
import project.repository.Tipo;

/**
 *
 * @author Yara
 */
public class ConsultarCurso extends javax.swing.JFrame {
    Cursos curso =null;
    Tipo persist;
    int tela;
    CadastroCurso cadastroCursos;
    CadastroDisciplina cadastroDisciplinas;

    
    /**
     * Creates new form consultarCurso
     */
    public ConsultarCurso() {
        initComponents();
    }

    public ConsultarCurso(int tela, javax.swing.JFrame js) {
        //mCursoController = new CursoController();
        initComponents();
        jTableCurso.setAutoCreateRowSorter(true);
        persist = new Tipo (new CursoDAO((ConectionSingleton.getEntity())));
        listaCurso();
        this.tela = tela;
        if(tela == 1 ){
             cadastroCursos = (CadastroCurso) js;
        }else{
            cadastroDisciplinas = (CadastroDisciplina) js;
        }
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        voltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCurso = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltar.setBackground(new java.awt.Color(255, 51, 0));
        voltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        voltar.setText("Voltar");
        voltar.setBorderPainted(false);
        voltar.setFocusPainted(false);
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        jPanel2.add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 100, -1));

        jTableCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Curso", "Coordenador"
            }
        ));
        jTableCurso.setName(""); // NOI18N
        jTableCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableCursoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCurso);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 590, 250));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 590, 360));

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("Onyx", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consultar Cursos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(196, 196, 196))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed

         CadastroCurso cadastrosAlunos = new CadastroCurso();
        cadastrosAlunos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void jTableCursoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCursoMousePressed
        if (evt.getClickCount() == 2) {
            if (chamadaTelaCurso()) {

                int codCurso = Integer.parseInt(jTableCurso.getValueAt(jTableCurso.getSelectedRow(), 0).toString());

                cadastroCursos.dados(unir(codCurso));

                this.dispose();

            } else {

                int codCurso = Integer.parseInt(jTableCurso.getValueAt(jTableCurso.getSelectedRow(), 0).toString());

                cadastroDisciplinas.dadosID(unir(codCurso));
        
        

                this.dispose();

            }

        }
    }//GEN-LAST:event_jTableCursoMousePressed

    /**
     * @param args the command line arguments
     */

    public boolean chamadaTelaCurso() {

        return tela == 1;

    }

    public void listaCurso() {
        try{
            
        List<Cursos> list =  persist.lista();

        for (Cursos fcurso : list) {

            DefaultTableModel model = (DefaultTableModel) jTableCurso.getModel();

            String[] aux = new String[3];
            aux[0] = fcurso.getId_curso().toString();
            aux[1] = fcurso.getDescricao();
            aux[2] = fcurso.getCoordenador().toString();
            model.addRow(aux);
        }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
   
        

    public Cursos unir(int id) {
        return persist.find(id);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCurso;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}