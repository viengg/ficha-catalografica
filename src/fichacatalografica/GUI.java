/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichacatalografica;

import javax.swing.*;

/**
 *
 * @author Vien
 */
public class GUI extends javax.swing.JFrame {
    private final Formulario formulario;
    private final ManipuladorTexto manipulador;
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        formulario = new Formulario();
        manipulador = new ManipuladorTexto(this);
        TextoAssunto.addActionListener(manipulador);
        TextoAutor.addActionListener(manipulador);
        TextoDescricao.addActionListener(manipulador);
        TextoNotas.addActionListener(manipulador);
        TextoTitulo.addActionListener(manipulador);
    }
    
    public Formulario getFormulario()
    {
        return formulario;
    }
    
    public JTextField getTextoAutor()
    {
        return TextoAutor;
    }
    
    public JTextField getTextoAssunto()
    {
        return TextoAssunto;
    }
    
    public JTextField getTextoDescricao()
    {
        return TextoDescricao;
    }
    
    public JTextField getTextoNotas()
    {
        return TextoNotas;
    }
    
    public JTextField getTextoTitulo()
    {
        return TextoTitulo;
    }
    
    public JTextField getTextoAluno()
    {
        return textoAluno;
    }
    
    public void resetGUI()
    {
        getTextoAssunto().setText("");
        getTextoAutor().setText("");
        getTextoNotas().setText("");
        getTextoDescricao().setText("");
        getTextoTitulo().setText("");
        getTextoAluno().setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextoAutor = new javax.swing.JTextField();
        TextoTitulo = new javax.swing.JTextField();
        TextoDescricao = new javax.swing.JTextField();
        TextoAssunto = new javax.swing.JTextField();
        TextoNotas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        textoAluno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ficha Catalográfica Dinâmica");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Autor");

        jLabel2.setText("Título e Imprenta");

        jLabel3.setText("Descrição Física");

        jLabel4.setText("Notas");

        jLabel5.setText("Assunto");

        TextoAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoAutorActionPerformed(evt);
            }
        });

        TextoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoTituloActionPerformed(evt);
            }
        });

        jButton1.setText("Imprime Ficha");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Matricula do Aluno");

        textoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoAlunoActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TextoAutor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TextoTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TextoDescricao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TextoAssunto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TextoNotas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(textoAluno, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(textoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(TextoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TextoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(TextoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(56, 56, 56))
        );

        jLayeredPane1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {TextoAssunto, TextoAutor, TextoDescricao, TextoNotas, TextoTitulo});

        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(textoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TextoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(TextoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(TextoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TextoNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(TextoAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLayeredPane1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {TextoAssunto, TextoAutor, TextoDescricao, TextoNotas, TextoTitulo});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TextoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoTituloActionPerformed

    private void TextoAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoAutorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        formulario.setAluno(getTextoAluno().getText());
        formulario.setAssunto(getTextoAssunto().getText());
        formulario.setAutor(getTextoAutor().getText());
        formulario.setDescricao(getTextoDescricao().getText());
        formulario.setNotas(getTextoNotas().getText());
        formulario.setTitulo(getTextoTitulo().getText());
        int response = JOptionPane.showConfirmDialog(null, 
                                "Deseja preencher outra ficha?", 
                                 "Ficha salva com sucesso!",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(response == JOptionPane.NO_OPTION)
        {
            formulario.writeToFile("ficha_"+formulario.getAluno()+".txt");
            System.out.println(formulario);
            System.exit(0);
        }
        else if(response == JOptionPane.YES_OPTION)
        {
            formulario.writeToFile("ficha_"+formulario.getAluno()+".txt");
            System.out.println(formulario);
            resetGUI();
            formulario.resetForm();
        }
            
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoAlunoActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextoAssunto;
    private javax.swing.JTextField TextoAutor;
    private javax.swing.JTextField TextoDescricao;
    private javax.swing.JTextField TextoNotas;
    private javax.swing.JTextField TextoTitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField textoAluno;
    // End of variables declaration//GEN-END:variables
}
