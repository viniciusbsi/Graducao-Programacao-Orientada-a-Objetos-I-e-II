/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    ArrayList<Evento> eventos = new ArrayList<>();

    public void inserirEvento(String descricao, int dia, int mes, int ano, String hora_inicial, String hora_final) {
        Evento evento = new Evento(descricao, dia, mes, ano, hora_inicial, hora_final);
        this.eventos.add(evento);
    }

    public void removeEvento(String descricao) {
        int var_controle = 0;
        if (eventos.size() == 0) {
            System.out.println("Não há eventos cadastrados!");
        } 
        else {
            for (int i = 0; i < eventos.size(); i++) {
                Evento evento = eventos.get(i);
                if (evento.descricao.equals(descricao)) {
                    eventos.remove(evento);
                    var_controle = 1;
                    i--;
                    System.out.println("Evento removido com sucesso!");
                }
            }
        }
        if (var_controle == 0){
            System.out.println("Evento não encontrado!");
        }
    }

    public void listaEventos() {
        if (eventos.isEmpty()) {
            System.out.println("Não há eventos cadastrados!");
        } 
        else {
            for(Evento evento : eventos){
                evento.getEvento(evento);
            }
        }
    }

    public void FiltrarPorData(int dia, int mes, int ano) {
        int var_controle = 0;
        if (eventos.isEmpty()) {
            System.out.println("Não há eventos cadastrados!");
        } 
        else {
            for (int i = 0; i < eventos.size(); i++) {
                Evento evento = eventos.get(i);
                if ((evento.dia == dia) && (evento.mes == mes) && (evento.ano == ano)){
                    evento.getEvento(evento);
                    var_controle = 1;
                }
            }
        }
        if (var_controle == 0){
            System.out.println("Evento não encontrado!");
        }
    }
    
    
    public void FiltrarPorDescricao(String descricao) {
        int var_controle = 0;
        if (eventos.isEmpty()) {
            System.out.println("Não há eventos cadastrados!");
        } 
        else {
            for (int i = 0; i < eventos.size(); i++) {
                Evento evento = eventos.get(i);
                if (evento.descricao.equals(descricao)){
                    var_controle = 1;  
                    evento.getEvento(evento);
                }
            }
        }
        if (var_controle == 0){
            System.out.println("Evento não encontrado!");
        }
    }
    public static void main(String[] args) {
            // TODO code application logic here
    }

}
