/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quarta;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Quarta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Digite o número:");
        number = input.nextInt();
        if (number % 2 == 0) {
            System.out.printf("é par");
        }
        else{
            System.out.printf("é impar");
        }
    }
    
}
