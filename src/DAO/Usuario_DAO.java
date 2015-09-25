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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cpd
 */
public class Usuario_DAO {

    public Usuario_DAO() {

    }

    public void cadastrarUsuario(Usuario_Model Usuario) {

        boolean admin = Usuario.getAdmin();
        String nome = String.valueOf(Usuario.getAdmin());

        if (admin == true) {
            nome = "SIM";
        } else {
            nome = "NÃO";
        }

        try {
            String SQLInserirUsuario = "insert into usuario(codigo_user,data_cadastro,nome,"
                    + "setor,login,senha,admin,status) values (?,?,?,?,?,?,?,?);";

            PreparedStatement STMT = ConexaoMySQL.getConnection().prepareStatement(SQLInserirUsuario);

            STMT.setInt(1, Usuario.getCodigo_user());
            STMT.setString(2, VerificadoresECorretores.converteParaSQL(Usuario.getData()));
            STMT.setString(3, Usuario.getNome());
            STMT.setString(4, Usuario.getSetor());
            STMT.setString(5, Usuario.getLogin());
            STMT.setString(6, Usuario.getSenha());
            STMT.setString(7, nome);
            STMT.setString(8, Usuario.getStatus());

            STMT.execute();
            ConexaoMySQL.getConnection();
            JOptionPane.showMessageDialog(null, "Usuário: " + Usuario.getNome() + " Cadastrado com sucesso.", "Sucesso", 1);
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
                    RS.getString("admin"),
                    RS.getString("status")});

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Pesquisar.", "ERRO DE SQL", 0);
        }

    }
    
    //MÉTODO DE CONSULTA PARA PREENCHIMENTO DO CAMPO FUNCIONARIO NO ATENDIMENTO.
    public void procurarClienteAtendimento(List<String> ListaDeCliente) {
        try {
             //where nome like '%" + Pesquisa + "%'
            String SQLSelectFuncionario = "select * from setor;";
            
            PreparedStatement STMT = ConexaoMySQL.getConnection().prepareStatement(SQLSelectFuncionario);
            ResultSet RS = STMT.executeQuery();
            while (RS.next()) {
                ListaDeCliente.add(RS.getString("codigo_setor") + " - " + RS.getString("nome"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Pesquisar.", "ERRO DE SQL", 0);
        }

    }
    
    //preenchimento de campos ao clicar na tabela de usuarios.
    public Usuario_Model preencherCamposPESSOA(int Codigo) {

        //Instância da classe Pessoa_Modelo
        Usuario_Model UsuarioModel = new Usuario_Model();

        try {
            String SQLSelectPessoa = "select * from usuario where codigo_user = ?;";
            PreparedStatement STMT = ConexaoMySQL.getConnection().prepareStatement(SQLSelectPessoa);
            STMT.setInt(1, Codigo);
            ResultSet RS = STMT.executeQuery();
            if (RS.next()) {
                UsuarioModel.setCodigo_user(RS.getInt("codigo_user"));
                UsuarioModel.setData(VerificadoresECorretores.converteParaJava(RS.getString("data_cadastro")));
                UsuarioModel.setNome(RS.getString("nome"));
                UsuarioModel.setSetor(RS.getString("setor"));
                UsuarioModel.setLogin(RS.getString("login"));
                UsuarioModel.setSenha(RS.getString("senha"));
                UsuarioModel.setAdmin(Boolean.parseBoolean(RS.getString("admin")));
                UsuarioModel.setStatus(RS.getString("status"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Preencher Campos.", "ERRO DE SQL", 0);
        }
        return UsuarioModel;
    }
}
