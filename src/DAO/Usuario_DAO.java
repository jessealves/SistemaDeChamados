/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Usuario_Model;
import Utilitarios.VerificadoresECorretores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cpd
 */
public class Usuario_DAO {
    public Usuario_DAO(){
        
    }
    
    public void cadastrarUsuario(Usuario_Model Usuario) {
        
//        JOptionPane.showMessageDialog(null, " Nome do usuário: " + Usuario.getNome() + "\n" +
//        " Data: " + Usuario.getData() + "\n" + " Senha: " + Usuario.getSenha() + "\n" +
//        " Status: " + Usuario.getStatus() + "\n" + " Login: " + Usuario.getLogin() + "\n" +
//        "Setor: " + Usuario.getSetor());
        
        try {
            String SQLInserirUsuario = "insert into usuario(codigo_user,data_cadastro,nome,"
                    + "senha,setor,login,status) values (?,?,?,?,?,?,?);";
            
            PreparedStatement STMT = ConexaoMySQL.getConnection().prepareStatement(SQLInserirUsuario);
            
            STMT.setInt(1, Usuario.getCodigo_user());
            STMT.setString(2, VerificadoresECorretores.converteParaSQL(Usuario.getData()));
            STMT.setString(3, Usuario.getNome());
            STMT.setString(4, Usuario.getSenha());
            STMT.setString(5, Usuario.getSetor());
            STMT.setString(6, Usuario.getLogin());
            STMT.setString(7, Usuario.getStatus());
            
            STMT.execute();
            ConexaoMySQL.getConnection();
            JOptionPane.showMessageDialog(null, "Usuário: "+ Usuario.getNome() + " Cadastrado com sucesso.","Sucesso",1);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //MOSTRANDO PROXIMO ID DO BANCO PARA CADASTRO DE PESSOA
    public String proximoUsuario() {
        try {
            String SQLSelectPessoa = "select * from usuario order by codigo_user desc limit 1;";
            PreparedStatement STMT = ConexaoMySQL.getConnection().prepareStatement(SQLSelectPessoa);
            ResultSet RS = STMT.executeQuery();
            if (RS.next()) {
                return RS.getInt("codigo_user") + 1 + "";
            } else {
                return "1";
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Cadastar.", "ERRO DE SQL", 0);
            return "0";
        }
    }
    
    //MÉTODO DE CONSULTA PARA PREENCHIMENTO DA TABELA DE CLIENTE.
    public void procurarUsuario(String PesquisarPor, String Pesquisa, DefaultTableModel PreencherTable) {
        try {
            String SQLSelectUsuario = "select * from usuario where " + PesquisarPor + " like '%" + Pesquisa + "%';";
            
            PreparedStatement STMT = ConexaoMySQL.getConnection().prepareStatement(SQLSelectUsuario);
            ResultSet RS = STMT.executeQuery();
            while (RS.next()) {
                PreencherTable.addRow(new Object[]{RS.getInt("codigo_user"),
                    RS.getString("nome"),
                    RS.getString("setor"),
                    VerificadoresECorretores.converteParaJava(RS.getString("data_cadastro")),
                    RS.getString("status")});
                    
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Pesquisar.", "ERRO DE SQL", 0);
        }

    }
}
