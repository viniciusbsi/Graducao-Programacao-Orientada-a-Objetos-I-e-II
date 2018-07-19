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
public class Data {
    int dia;
    int mes;
    int ano;
    String hora_inicial;
    String hora_final;

    Data(int dia, int mes, int ano, String hora_inicial, String hora_final){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora_inicial = hora_inicial;
        this.hora_final = hora_final;
    }
}
