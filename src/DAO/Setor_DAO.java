/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Setor_Model;
import Utilitarios.VerificadoresECorretores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cpd
 */
public class Setor_DAO {
    public Setor_DAO(){
        
    }
    
    public void cadastrarSetor(Setor_Model Setor) {
        try {
            String SQLInserirUsuario = "insert into setor(data_cadastro,nome,"
                    + "status) values (?,?,?);";

            PreparedStatement STMT = ConexaoMySQL.getConnection().prepareStatement(SQLInserirUsuario);

            STMT.setString(1, VerificadoresECorretores.converteParaSQL(Setor.getData()));
            STMT.setString(2, Setor.getNome());
            STMT.setString(3, Setor.getStatus());

            STMT.execute();
            ConexaoMySQL.getConnection();
            JOptionPane.showMessageDialog(null, "Setor: " + Setor.getNome() + " Cadastrado com sucesso.", "Sucesso", 1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no cadastro do setor");
        }

    }
    
    //MÉTODO DE CONSULTA PARA PREENCHIMENTO DA TABELA DE CLIENTE.
    public void procurarSetor(String Pesquisa, DefaultTableModel PreencherTable) {
        try {
            String SQLSelectUsuario = "select * from setor where nome like '%" + Pesquisa + "%';";

            PreparedStatement STMT = ConexaoMySQL.getConnection().prepareStatement(SQLSelectUsuario);
            ResultSet RS = STMT.executeQuery();
            while (RS.next()) {
                PreencherTable.addRow(new Object[]{RS.getInt("codigo_setor"),
                    RS.getString("nome"),
                    VerificadoresECorretores.converteParaJava(RS.getString("data_cadastro")),
                    RS.getString("status")});

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Pesquisar.", "ERRO DE SQL", 0);
        }

    }
}
