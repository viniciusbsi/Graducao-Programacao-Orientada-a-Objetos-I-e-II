/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Vinícius de Oliveira BSI-3
 */
public class Employee {

    /**
     * @param args the command line arguments
     */
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    
    public Employee(String nomeInicial, String sobrenomeInicial, double salarioMensalInicial){
        nome = nomeInicial;
        sobrenome = sobrenomeInicial;
        if(salarioMensalInicial > 0.0){
            salarioMensal = salarioMensalInicial;
        }
    }
    
    public void setNome( String nomeInicial) {
        nome = nomeInicial;
    }
    public String getNome(){
        return nome;
    }
    
    public void setSobrenome( String sobrenomeInicial) {
        sobrenome = sobrenomeInicial;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public void setSalarioMensal( double salarioMensalInicial) {
        if(salarioMensalInicial > 0.0){
            salarioMensal = salarioMensalInicial;
        }
    }
    public double getSalarioMensal(){
        return salarioMensal;
    }
    public void setSalarioAnual(double salarioMensal1, double salarioMensal2){
        double salarioAnual1 = salarioMensal1 * 12;
        double salarioAnual2 = salarioMensal2 * 12;
        System.out.printf("Salário anual do empregado 1:%.2f\nSalário anual do empregado 2: %.2f\n", salarioAnual1, salarioAnual2);
    }
    public void setSalarioAnualAumento(double salarioMensal1, double salarioMensal2){
        double salarioAnual1 = salarioMensal1 * 12;
        double salarioAnual2 = salarioMensal2 * 12;
        System.out.printf("Salário anual do empregado 1:%.2f\nSalário anual do empregado 2: %.2f\n", salarioAnual1 *1.1, salarioAnual2*1.1);
    }
    
}
