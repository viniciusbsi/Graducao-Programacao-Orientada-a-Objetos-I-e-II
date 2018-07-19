/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vinicius
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    ArrayList<Compromisso> compromissos = new ArrayList<>();
    Compromisso compromisso = new Compromisso();

    public void inserirCompromisso(String descricao, String dataInicial, String horaInicial, String horaFinal) throws ParseException {
        if (compromisso.validaData(dataInicial)){
            Compromisso compromisso = new Compromisso(descricao, dataInicial, horaInicial, horaFinal) ;
            this.compromissos.add(compromisso);
        }
        else {
            System.out.println("Formato incorreto!");

        }
    }

    public boolean arrayVazio(){
       return compromissos.isEmpty();
    }

    public void removeCompromisso(String descricao) {
        int var_controle = 0;
        if (compromissos.size() == 0) {
            System.out.println("Não há compromissos cadastrados!");
        }
        else {
            for (int i = 0; i < compromissos.size(); i++) {
                Compromisso compromisso = compromissos.get(i);
                if (compromisso.descricao.equals(descricao)) {
                    compromissos.remove(compromisso);
                    var_controle = 1;
                    i--;
                    System.out.println("Compromisso removido com sucesso!");
                }
            }
        }
        if (var_controle == 0){
            System.out.println("Compromisso não encontrado!");
        }
    }

    public void listaCompromisso() {
        if (compromissos.isEmpty()) {
            System.out.println("Não há compromissos cadastrados!");
        }
        else {
            for(Compromisso compromisso : compromissos){
                compromisso.getCompromisso();
            }
        }
    }

    public void FiltrarPorDescricao(String descricao) {
        int var_controle = 0;
        if (compromissos.isEmpty()) {
            System.out.println("Não há compromissos cadastrados!");
        }
        else {
            for (int i = 0; i < compromissos.size(); i++) {
                Compromisso compromisso = compromissos.get(i);
                if (compromisso.descricao.equals(descricao)){
                    var_controle = 1;
                    compromisso.getCompromisso();
                }
            }
        }
        if (var_controle == 0){
            System.out.println("Compromisso não encontrado!");
        }
    }

    public void FiltrarPorData(String data_filtro) throws ParseException{
        if (compromisso.validaData(data_filtro)){
            int var_controle = 0;
            if (compromissos.isEmpty()) {
                System.out.println("Não há compromissos cadastrados!");
            }
            else {
                for (int i = 0; i < compromissos.size(); i++) {
                    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
                    Compromisso compromisso = compromissos.get(i);
                    Date filtroData = sd.parse(sd.format(compromisso.makeDate(data_filtro)));
                    Date dataCompromisso = sd.parse(sd.format(compromisso.dataInicio));
                    if (dataCompromisso.equals(filtroData)){
                        compromisso.getCompromisso();
                        var_controle = 1;
                    }
                }
            }
            if (var_controle == 0){
                System.out.println("Compromisso não encontrado!");
            }
        } else {
            System.out.println("Formato incorreto!");

        }}
    
    public static void main(String[] args) {
            // TODO code application logic here
    }

}
