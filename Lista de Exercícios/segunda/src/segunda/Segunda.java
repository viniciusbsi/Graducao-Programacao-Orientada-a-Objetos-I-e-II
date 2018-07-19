/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segunda;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Segunda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        System.out.print("Digite o primeiro número:");
        number1 = input.nextInt();
        System.out.print("Digite o segundo número:");
        number2 = input.nextInt();
        
        if (number1 > number2) {
            System.out.printf("%d é maior", number1);
        }
        else{
            System.out.printf("%d é maior", number2);
        }
    }
    
}
