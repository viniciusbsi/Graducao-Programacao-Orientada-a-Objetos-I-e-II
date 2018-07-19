/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroperfeito;

/**
 *
 * @author aluno
 */
public class NumeroPerfeito {

    /**
     * @param args the command line arguments
     */
    public int soma;
    public String divisores;
    public String verifica;
    
    public String VerificaNumeroPerfeito (int numero){
        soma = 0;
        divisores = "";
        for(int counter = 1; counter < numero; counter++){
            if((numero%counter) == 0){
                soma = soma+counter;
                divisores = divisores+counter;
            }
        }
        if(soma == numero){
            String retorno;
            retorno = numero + " É PERFEITO " + divisores;
            return (retorno);
        }
        else{
            String retorno;
            retorno = "NÃO É PERFEITO";
            return (retorno);
        }
    }
    
    public void VerificaPerfeitos(){
        for(int counter = 1; counter <= 1000; counter++){
            verifica = VerificaNumeroPerfeito(counter);
            if(verifica != "NÃO É PERFEITO"){
                System.out.print(counter);
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
