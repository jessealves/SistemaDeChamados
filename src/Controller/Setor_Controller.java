/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.Setor_DAO;
import Model.Setor_Model;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cpd
 */
public class Setor_Controller {
    Setor_DAO Setor_D;
    public Setor_Controller(){
        Setor_D = new Setor_DAO();
    }
     public boolean verificaUsuario(Setor_Model Setor){
        
        
        Setor_D.cadastrarSetor(Setor);
        return true;
        
    }
     
      public void controlePesquisaSetor(String Pesquisa, DefaultTableModel PreencherTable) {

//        if (PesquisarPor.equals("Nome")) {
//            PesquisarPor = "nome";
//        }
//        if(PesquisarPor.equals("Setor")){
//            PesquisarPor = "setor";
//        }
//        if(PesquisarPor.equals("Código")){
//            PesquisarPor = "codigo_user";
//        }
      
        PreencherTable.setNumRows(0);
        Setor_D.procurarSetor(Pesquisa, PreencherTable);
    }
}
