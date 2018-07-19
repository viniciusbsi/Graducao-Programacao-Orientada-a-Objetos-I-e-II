/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

/**
 *
 * @author vinicius
 */
public class Date {

    /**
     * @param args the command line arguments
     */
    private String dia;
    private String mes;
    private String ano;
    public Date(String diaInicial, String mesInicial, String anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }
    
    public void setDia(String setDia){
        dia = setDia;
    }
    public void setMes(String setMes){
        mes = setMes;
    }
    public void setAno(String setAno){
        ano = setAno;
    }
    
    public String getDia(){
        return dia;
    }
    public String getMes(){
        return mes;
    }
    public String getAno(){
        return ano;
    }
    
    public void displayMessage(){
        System.out.printf("Data: %s/%s/%s", mes, dia, ano);
        
    }
}
