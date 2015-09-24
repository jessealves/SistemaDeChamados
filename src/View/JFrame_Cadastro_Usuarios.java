/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Setor_Controller;
import Controller.Usuario_Controller;
import Model.Usuario_Model;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cpd
 */
public class JFrame_Cadastro_Usuarios extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_Cadastro_Usuarios
     */
    SimpleDateFormat FormatoData;
    Date DataAtual;
    
    Usuario_Model Usuario_M;
    Usuario_Controller Usuario_C;
    Setor_Controller Setor_C;
    
    List<String> ListaDeSetores;
    
    DefaultTableModel ModeloTabela;
    
    
    public JFrame_Cadastro_Usuarios() {
        initComponents();
        
        ListaDeSetores = new ArrayList<>();
        
        FormatoData = new SimpleDateFormat("dd/MM/YYYY");
        DataAtual = new Date();
        jD_Data_Cadastro.setDate(DataAtual);
        
        Usuario_M = new Usuario_Model();
        Usuario_C = new Usuario_Controller();
        Setor_C = new Setor_Controller();
        
        ModeloTabela = (DefaultTableModel) jTable_Usuario.getModel();
        
        //AO CLICAR EM NOVO, SETA NO CAMPO DE CODIGO, QUAL SERÁ O PRÓXIMO CÓDIGO DISPONIVEL NO BANCO.
        jT_Codigo_User.setText(Usuario_C.controleDeCodigo());
        
        jC_Setor.removeAllItems();
        ListaDeSetores.clear();
        String Pesquisa = JOptionPane.showInputDialog(null, "Informe o nome do Cliente que deseja atendimento: ",
                "Pesquisa de Clientes", 3);
        Setor_C.controlePesquisaSetor(Pesquisa, ListaDeSetores);
        for (String S : ListaDeSetores) {
            jC_Setor.addItem(S);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jC_Setor = new javax.swing.JComboBox();
        jP_Senha = new javax.swing.JPasswordField();
        jD_Data_Cadastro = new com.toedter.calendar.JDateChooser();
        jT_NomeUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jT_Codigo_User = new javax.swing.JTextField();
        jT_Login = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jC_Status = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jCh_Sim = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Usuario = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jB_Sair = new javax.swing.JButton();
        jB_SalvarUsuario = new javax.swing.JButton();
        jB_LimparCampos = new javax.swing.JButton();
        jB_Cancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jC_Pesquisar_Por = new javax.swing.JComboBox();
        jT_Pesquisar_Usuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(147, 205, 128));

        jPanel2.setBackground(new java.awt.Color(167, 212, 145));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jC_Setor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tecnologia e Informação" }));

        jD_Data_Cadastro.setEnabled(false);

        jT_NomeUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jT_NomeUsuarioFocusLost(evt);
            }
        });

        jLabel2.setText("Setor:");

        jLabel1.setText("Nome:");

        jT_Codigo_User.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jT_Codigo_User.setEnabled(false);

        jT_Login.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jT_Login.setEnabled(false);

        jLabel4.setText("Senha:");

        jLabel5.setText("Data de Cadastro:");

        jLabel3.setText("Login:");

        jLabel6.setText("Código:");

        jLabel7.setText("Status:");

        jC_Status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo(a)", "Inativo(a)", "Bloqueado(a)" }));
        jC_Status.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel9.setText("Admin:");

        jCh_Sim.setText("Sim");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jT_Codigo_User, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jD_Data_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jC_Status, 0, 195, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jT_NomeUsuario))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jT_Login)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jC_Setor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jP_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCh_Sim)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jT_Codigo_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jD_Data_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jC_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jT_NomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jC_Setor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jT_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jP_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jCh_Sim))
                .addContainerGap())
        );

        jTable_Usuario.setBackground(new java.awt.Color(167, 212, 145));
        jTable_Usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Setor", "Data de Cadastro", "Admin", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Usuario.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable_Usuario.setGridColor(new java.awt.Color(167, 212, 145));
        jScrollPane1.setViewportView(jTable_Usuario);
        if (jTable_Usuario.getColumnModel().getColumnCount() > 0) {
            jTable_Usuario.getColumnModel().getColumn(0).setMinWidth(55);
            jTable_Usuario.getColumnModel().getColumn(0).setPreferredWidth(55);
            jTable_Usuario.getColumnModel().getColumn(1).setMinWidth(180);
            jTable_Usuario.getColumnModel().getColumn(1).setPreferredWidth(180);
            jTable_Usuario.getColumnModel().getColumn(2).setMinWidth(150);
            jTable_Usuario.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable_Usuario.getColumnModel().getColumn(3).setMinWidth(110);
            jTable_Usuario.getColumnModel().getColumn(3).setPreferredWidth(110);
            jTable_Usuario.getColumnModel().getColumn(4).setMinWidth(50);
            jTable_Usuario.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable_Usuario.getColumnModel().getColumn(5).setMinWidth(90);
            jTable_Usuario.getColumnModel().getColumn(5).setPreferredWidth(90);
        }

        jPanel3.setBackground(new java.awt.Color(167, 212, 145));

        jB_Sair.setText("Sair");
        jB_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SairActionPerformed(evt);
            }
        });

        jB_SalvarUsuario.setText("Salvar");
        jB_SalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SalvarUsuarioActionPerformed(evt);
            }
        });

        jB_LimparCampos.setText("Editar");

        jB_Cancelar.setText("Cancelar");
        jB_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jB_SalvarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_LimparCampos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_Cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_Sair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jB_Cancelar, jB_LimparCampos, jB_Sair, jB_SalvarUsuario});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_SalvarUsuario)
                    .addComponent(jB_LimparCampos)
                    .addComponent(jB_Cancelar)
                    .addComponent(jB_Sair))
                .addContainerGap())
        );

        jLabel8.setText("Pesquisar usuário por:");

        jC_Pesquisar_Por.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "Setor", "Código" }));

        jT_Pesquisar_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_Pesquisar_UsuarioMouseClicked(evt);
            }
        });
        jT_Pesquisar_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jT_Pesquisar_UsuarioKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jC_Pesquisar_Por, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jT_Pesquisar_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jC_Pesquisar_Por, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_Pesquisar_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(659, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_SalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SalvarUsuarioActionPerformed
        String nome = jT_NomeUsuario.getText();
        
        boolean sim = jCh_Sim.isSelected();
//        boolean nao = jR_Nao.isSelected();
//        
//        JOptionPane.showMessageDialog(null, sim);

        popularUsuario();
        
        
        
        Usuario_C.verificaUsuario(Usuario_M);
        
//        if (nome.equals("")) {
//            JOptionPane.showMessageDialog(null, "Campo Nome não pode ser vazio.", "Erro de Preenchimento", 0);
//        }
    }//GEN-LAST:event_jB_SalvarUsuarioActionPerformed

    private void jT_NomeUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jT_NomeUsuarioFocusLost
        jT_Login.setText(jT_NomeUsuario.getText());
    }//GEN-LAST:event_jT_NomeUsuarioFocusLost

    private void jB_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_CancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jB_CancelarActionPerformed

    private void jB_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jB_SairActionPerformed

    private void jT_Pesquisar_UsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_Pesquisar_UsuarioMouseClicked
       jT_Pesquisar_Usuario.setText("");
        ModeloTabela.setNumRows(0);
        Usuario_C.controlePesquisaUsuario((String) jC_Pesquisar_Por.getSelectedItem(), jT_Pesquisar_Usuario.getText(), ModeloTabela);
    }//GEN-LAST:event_jT_Pesquisar_UsuarioMouseClicked

    private void jT_Pesquisar_UsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_Pesquisar_UsuarioKeyPressed
         ModeloTabela.setNumRows(0);
        Usuario_C.controlePesquisaUsuario((String) jC_Pesquisar_Por.getSelectedItem(), jT_Pesquisar_Usuario.getText(), ModeloTabela);
    }//GEN-LAST:event_jT_Pesquisar_UsuarioKeyPressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFrame_Cadastro_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Cadastro_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Cadastro_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Cadastro_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Cadastro_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Cancelar;
    private javax.swing.JButton jB_LimparCampos;
    private javax.swing.JButton jB_Sair;
    private javax.swing.JButton jB_SalvarUsuario;
    private javax.swing.JComboBox jC_Pesquisar_Por;
    private javax.swing.JComboBox jC_Setor;
    private javax.swing.JComboBox jC_Status;
    private javax.swing.JCheckBox jCh_Sim;
    private com.toedter.calendar.JDateChooser jD_Data_Cadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jP_Senha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT_Codigo_User;
    private javax.swing.JTextField jT_Login;
    private javax.swing.JTextField jT_NomeUsuario;
    private javax.swing.JTextField jT_Pesquisar_Usuario;
    private javax.swing.JTable jTable_Usuario;
    // End of variables declaration//GEN-END:variables

    final void popularUsuario(){
//        Usuario_M.setCodigo_user(Integer.valueOf(jT_Codigo_User.getText()));
        Usuario_M.setData(FormatoData.format(jD_Data_Cadastro.getDate()));
        Usuario_M.setStatus((String)jC_Status.getSelectedItem());
        Usuario_M.setNome(jT_NomeUsuario.getText());
        Usuario_M.setSetor((String)jC_Setor.getSelectedItem());
        Usuario_M.setLogin(jT_Login.getText());
        Usuario_M.setSenha(new String(jP_Senha.getPassword()));
        Usuario_M.setAdmin(jCh_Sim.isSelected());
    }
    
    final void limparCampos(){
        
    }
}
