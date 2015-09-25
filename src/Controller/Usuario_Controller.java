/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.Setor_DAO;
import DAO.Usuario_DAO;
import Model.Usuario_Model;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cpd
 */


public class Usuario_Controller {
    
    Usuario_DAO Usuario_D;
    Setor_DAO Setor_D;
    Usuario_Model Usuario_M;
    
    public Usuario_Controller(){
        Usuario_D = new Usuario_DAO();
        Setor_D = new Setor_DAO();
        Usuario_M = new Usuario_Model();
    }
    
    public boolean verificaUsuario(Usuario_Model Usuario){
        
        
        Usuario_D.cadastrarUsuario(Usuario);
        return true;
        
    }
    
     //Mostrar o próximo código do banco, no campo codigo do cliente.
    public String controleDeCodigo() {
        return Usuario_D.proximoUsuario();
    }
    
    public void controlePesquisaUsuario(String PesquisarPor, String Pesquisa, DefaultTableModel PreencherTable) {

        if (PesquisarPor.equals("Nome")) {
            PesquisarPor = "nome";
        }
        if(PesquisarPor.equals("Setor")){
            PesquisarPor = "setor";
        }
        if(PesquisarPor.equals("Código")){
            PesquisarPor = "codigo_user";
        }
      
        PreencherTable.setNumRows(0);
        Usuario_D.procurarUsuario(PesquisarPor, Pesquisa, PreencherTable);
    }
    //MÉTODO PARA PREENCHIMENTO DE COMBOBOX DO CLIENTE NO ATENDIMENTO
    public void controlePesquisaClienteAtendimento(List<String> ListaDeCliente) {
        Usuario_D.procurarClienteAtendimento(ListaDeCliente);
    }
    
    public Usuario_Model controlePreenchiementoPessoa(int Codigo) {
        return Usuario_D.preencherCamposPESSOA(Codigo);
    }
}
