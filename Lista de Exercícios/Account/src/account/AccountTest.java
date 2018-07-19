/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
import java.util.Scanner;
/**
 *
 * @author Vinícius de Oliveira BSI-3
 */
public class AccountTest {
    public static void main(String[] args){
        Account account = new Account(10.00);
        Scanner input = new Scanner(System.in);
        double valorDeditado;
        System.out.print("Digite o valor a ser deditado:");
        valorDeditado = input.nextDouble();
        account.debit(valorDeditado);
    }    
}
