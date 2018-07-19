/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class DataTest {
    public static void main(String[] args){
        Data date1 = new Data("28","12","1998");
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Data inicial: %s/%s/%s \n", date1.getDia(), date1.getMes(), date1.getAno());
        
        System.out.print("Digite o dia:");
        String dia = input.nextLine();
        date1.setDia(dia);
        
        System.out.print("Digite o mes:");
        String mes = input.nextLine();
        date1.setMes(mes);
        
        
        System.out.print("Digite o ano:");
        String ano = input.nextLine();
        date1.setAno(ano);
        
        date1.displayMessage();
    }
}
