/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apparray;
import java.util.Scanner;

/**
 *
 * @author vinicius de oliveira BSI3
 */
public class AppArray {

    /**
     * @param args the command line arguments
     */
    public void a(){
        Scanner input = new Scanner(System.in);
        int[] f = {5, 7, 4, 3, 5, 6, 9};
        System.out.println(f[6]);
    }

    public void b(){
        Scanner input = new Scanner(System.in);
        int[] g = {8, 8, 8, 8, 8};
        for(int i = 0; i < 5; i++){
            System.out.print(g[i]);
        }    
    }
    
    public void c(){
        Scanner input = new Scanner(System.in);
        float[] c = new float[100];
        float total = 0;
        for(int i = 0; i < 100; i++){
            c[i] = i;
        }
        
        for(int i = 0; i < 100; i++){
            total = c[i] + total;
        }
        System.out.print(total);
        
    }
    
    public void d(){
        Scanner input = new Scanner(System.in);
        int[] a = {1,2,3,4,5,6,7,8,9,10,11};
        int[] b = new int[34];
        for(int i=0; i < 11; i++){
            b[i] = a[i];
        }
        for(int i=0; i < 11; i++){
            System.out.print(b[i]);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
