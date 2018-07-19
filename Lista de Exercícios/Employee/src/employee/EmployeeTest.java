/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // TODO code application logic here
        Employee employee1 = new Employee("Vinicius","Oliveira", 100.0);
        Employee employee2 = new Employee("Jose","Silva", 100.0);
        Scanner input = new Scanner(System.in);
        
        //Apresenta os dados da conta
        System.out.printf("Salário mensal do empregado %s %s é de %s: \n", employee1.getNome(), employee1.getSobrenome(), employee1.getSalarioMensal());
        System.out.printf("Salário mensal do empregado %s %s é de %s: \n", employee2.getNome(), employee2.getSobrenome(), employee2.getSalarioMensal());
        
        //Altera dados do primeiro empregado
        System.out.print("Digite o nome do primeiro empregado:");
        String nome1 = input.nextLine();
        employee1.setNome(nome1);
        
        System.out.print("Digite o sobrenome do primeiro empregado:");
        String sobrenome1 = input.nextLine();
        employee1.setSobrenome(sobrenome1);
        
        System.out.print("Digite o salário mensal do primeiro empregado:");
        double salarioMensal1 = input.nextDouble();
        employee1.setSalarioMensal(salarioMensal1);
        
        //Altera dados do segundo empregado
        System.out.print("Digite o nome do segundo empregado: \n");
        String nome2 = input.nextLine();
        employee2.setNome(nome2);
        
        System.out.print("Digite o sobrenome do segundo empregado:");
        String sobrenome2 = input.nextLine();
        employee2.setSobrenome(sobrenome2);
        
        System.out.print("Digite o salário mensal do segundo empregado:");
        double salarioMensal2 = input.nextDouble();
        employee2.setSalarioMensal(salarioMensal2);
        
        //Apresenta salários anual usando objeto 1 (verificar se há algum problema!)
        employee1.setSalarioAnual(salarioMensal1, salarioMensal2);
        
        //Apresenta salários com 10% de aumento usando objeto 1 (verificar se há algum problema!)
        employee1.setSalarioAnualAumento(salarioMensal1, salarioMensal2);
        
        
        
        
        
    }
    
    
}
