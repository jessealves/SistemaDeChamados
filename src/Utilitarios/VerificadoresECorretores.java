package Utilitarios;

/**
 * @author Jessé Alves
 */
public class VerificadoresECorretores {

    public static String converteParaSQL(String Data) {
        return Data.substring(6, 10) + "-" + Data.substring(3, 5) + "-" + Data.substring(0, 2);
    }

    public static String converteParaJava(String Data) {
        return Data.substring(8, 10) + "/" + Data.substring(5, 7) + "/" + Data.substring(0, 4);
    }
    
    public static String convertePara_CEP_Formatado(String CEP){
        //#####-###
        return CEP.substring(0, 5) + "-" + CEP.substring(5, 8);
    }
    
    public static String convertePara_CEP_SEM_Format(String CEP){
        //#####-###
        return CEP.substring(0, 5) + CEP.substring(6, 9);
    }
    
    public static String convertePara_RG_Formatado(String RG){
        //##.###.###-##
        return RG.substring(0, 2) + "." + RG.substring(2, 5) + "." + RG.substring(5, 8) + "-" + RG.substring(8, 10);
    }
    
    public static String convertePara_RG_SEM_Format(String RG){
        //##.###.###-##
        return RG.substring(0, 2) + RG.substring(3, 6) + RG.substring(7, 10) + RG.substring(11, 13);
    }
    
    public static String convertePara_CPF_Formatado(String CPF){
        //###.###.###-##
        return CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." + CPF.substring(6, 9) + "-" + CPF.substring(9, 11);
    }
    
    public static String convertePara_CPF_SEM_Format(String CPF){
        //###.###.###-##
        return CPF.substring(0, 3) + CPF.substring(4, 7) + CPF.substring(8, 11) + CPF.substring(12, 14);
    }
    
    public static String convertePara_CNPJ_Formatado(String CNPJ){
        //XX.XXX.XXX/YYYY-ZZ
        return CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "." + CNPJ.substring(5, 8) + "/" + CNPJ.substring(8, 12) + "-" + CNPJ.substring(12, 14);
    }
    
    public static String convertePara_CNPJ_SEM_Format(String CNPJ){
        //XX.XXX.XXX/YYYY-ZZ
        return CNPJ.substring(0, 2) + CNPJ.substring(3, 6) + CNPJ.substring(7, 10) + CNPJ.substring(11, 15) + CNPJ.substring(16, 18);
    }
    
    public static String converte_HORA_ParaSQL(String Hora) {
        return Hora.substring(0,2) + ":" + Hora.substring(3,5);
    }
    
 //  TESTE
//   public static void main(String args[]){
//       System.out.println(converte_HORA_ParaSQL("21:16"));
//   }
}
