/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroperfeito;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class NumeroPerfeitoTeste {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        NumeroPerfeito numeroPerfeito = new NumeroPerfeito();

        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        String retorno = numeroPerfeito.VerificaNumeroPerfeito(numero);
        System.out.println(retorno);
        
        numeroPerfeito.VerificaPerfeitos();
        
    }
}
