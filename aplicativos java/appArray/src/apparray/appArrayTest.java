/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apparray;

import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class appArrayTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        AppArray appArray = new AppArray();
        System.out.print("Valor que consta na posição '6' do array f: ");
        appArray.a();
        
        System.out.print("Array 'g' inicializado tendo '8' como o valor de todos os elementos: ");
        appArray.b();
        
        System.out.println();
        
        System.out.print("Array 'c' com 100 elementos: ");
        appArray.c();
        
        System.out.println();
        
        System.out.print("Cópia de 'a' para 'b': ");
        appArray.d();
        
    }
    
}
