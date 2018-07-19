/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

/**
 *
 * @author Vinícius de Oliveira BSI-3
 */
public class GradeBook {

    /**
     * @param args the command line arguments
     */
    private String nomeCurso;
    private String nomeInstrutor;
    
    public GradeBook (String cursoNome, String instrutorNome){
        nomeCurso = cursoNome;
        nomeInstrutor = instrutorNome; 
    }
    
    public void setNomeCurso( String setNomeCurso) {
        nomeCurso = setNomeCurso;
    }
    
    public void setNomeInstrutor( String setNomeInstrutor) {
        nomeInstrutor = setNomeInstrutor;
    }
    
    public String getNomeCurso(){
        return nomeCurso;
    }
    public void displayMessage(){
        System.out.printf("Bem-vindo ao curso %s. Esse curso é apresentado por %s", nomeCurso, nomeInstrutor);
    }
    
}
