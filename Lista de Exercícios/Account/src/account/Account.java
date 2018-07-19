/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Vinícius de Oliveira BSI-3
 */
public class Account {

    /**
     * @param args the command line arguments
     */
    private double balance;
    public Account(double initialBalance){
        if (initialBalance > 0.0){
            balance = initialBalance;
        }
    }
    
    public void debit(double value){
        if((balance - value) >= 0){
            balance = balance - value;
            System.out.printf("Saldo:%s", balance);
        }
        else{
            System.out.println("Quantia de débito excedeu o saldo da conta");
        }
        
    }
}
