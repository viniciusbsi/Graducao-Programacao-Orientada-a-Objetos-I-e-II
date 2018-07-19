/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class GradeBookTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        GradeBook gradebook = new GradeBook("BSI", "Vinícius");
        
        System.out.printf("Curso inicial: %s \n", gradebook.getNomeCurso());
        
        System.out.print("Digite o nome do curso:");
        String nomeCurso = input.nextLine();
        gradebook.setNomeCurso(nomeCurso);
        
        System.out.print("Digite o nome do instrutor:");
        String nomeInstrutor = input.nextLine();
        gradebook.setNomeInstrutor(nomeInstrutor);
        
        gradebook.displayMessage();
        
        
    }
    
}
