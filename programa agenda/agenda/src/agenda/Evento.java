/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author vinicius
 */
public class Evento extends Data {

    String descricao;

    Evento(String descricao, int dia, int mes, int ano, String hora_inicial, String hora_final) {
        super(dia, mes, ano, hora_inicial, hora_final);
        this.descricao = descricao;
    }
    
    public void getEvento(Evento evento){
        System.out.printf("%s - %d/%d/%d %s - %s \n", evento.descricao, evento.dia, evento.mes, evento.ano, evento.hora_inicial, evento.hora_final);
    }
}
