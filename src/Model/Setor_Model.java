package Model;

/**
 *
 * @author Cpd
 */
public class Setor_Model {
    int codigo_setor;
    String data;
    String nome;
    String status;

    public int getCodigo() {
        return codigo_setor;
    }

    public void setCodigo(int codigo) {
        this.codigo_setor = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
