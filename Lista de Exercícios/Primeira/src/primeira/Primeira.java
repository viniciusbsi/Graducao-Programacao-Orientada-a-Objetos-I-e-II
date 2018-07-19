/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeira;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Primeira {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int soma;
        int produto;
        int diferenca;
        int divisao;

        System.out.print("Digite o primeiro número:");
        number1 = input.nextInt();
        System.out.print("Digite o segundo número:");
        number2 = input.nextInt();
        soma = number1 + number2;
        produto = number1 * number2;
        if (number1 > number2) {
            diferenca = number1 - number2;
            divisao = number1 / number2;
        }
        else{
            diferenca = number2 - number1;
            divisao = number2 / number1;
        }
        if (number1 == number2){
            diferenca = 0;
            divisao = 1;
        }
        System.out.printf("Soma: %d; Produto: %d; Diferença: %d; Divisão: %d", soma, produto, diferenca, divisao);
    }
    
}
