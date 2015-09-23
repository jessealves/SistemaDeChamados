//Nome do nosso pacote // 
package DAO;

//import org.gjt.mm.mysql.Driver; MACETE PARA DESCOBRIR O CAMINHO DO DRIVER.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoMySQL {

    public String URL = "jdbc:mysql://127.0.0.1:3306/samur.chamado";
    public String Driver = "org.gjt.mm.mysql.Driver";
    public String Usuario = "root";
    public String Senha = "";
    public static Connection Conn;

    public ConexaoMySQL() {
        
        try {
            Class.forName(Driver);
            Conn = DriverManager.getConnection(URL, Usuario, Senha);
//            JOptionPane.showMessageDialog(null, "Conectado com sucesso com o banco de dados.", "CONEXÃO",1);
        } catch (SQLException | ClassNotFoundException ex) {
            //Logger.getLogger(ConexaoMySQL.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro na tentativa de conexão com o banco.", "ERRO DE CONEXÃO",0);
        }
    }

    public static Connection getConnection() {
        if (Conn == null) {
            new ConexaoMySQL();
        }
        return Conn;
    }

    public static void closeConnection() {
        try {
            if (!Conn.isClosed()) {
                Conn.close();
                JOptionPane.showMessageDialog(null, "Conexão encerrada.", "CONEXÃO", 0);
            }
        } catch (SQLException ex) {
            //Logger.getLogger(ConexaoMySQL.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não existe conexão.", "CONEXÃO", 0);
        }
    }
    
    public static void main(String args[]){
        ConexaoMySQL.getConnection();
    }
}
