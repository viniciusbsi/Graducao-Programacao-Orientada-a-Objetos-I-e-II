package agenda;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vinicius
 */
public class menu {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        int opcao;

        do {
            menu();
            Scanner input = new Scanner(System.in);
            opcao = input.nextInt();
            int dia, mes, ano;
            String descricao, hora_inicial, hora_final;
    
            
            switch (opcao) {
                case 1:
                    System.out.print("Descrição do evento: ");
                    descricao = input.nextLine();

                    System.out.print("Dia: ");
                    dia = input.nextInt();

                    System.out.print("Mês: ");
                    mes = input.nextInt();

                    System.out.print("Ano: ");
                    ano = input.nextInt();

                    System.out.print("Hora inicial no formato HH:MM: ");
                    hora_inicial = input.nextLine();

                    System.out.print("Hora final no formato HH:MM: ");
                    hora_final = input.nextLine();

                    agenda.inserirEvento(descricao, dia, mes, ano, hora_inicial, hora_final);
                    break;

                case 2:
                    System.out.print("Descrição do evento: ");
                    String descricao_remove = input.nextLine();
                    agenda.removeEvento(descricao_remove);
                    break;

                case 3:
                    agenda.listaEventos();
                    break;

                case 4:
                    System.out.print("Dia: ");
                    int dia_filtro = input.nextInt();
                    System.out.print("Mês: ");
                    int mes_filtro = input.nextInt();
                    System.out.print("Ano: ");
                    int ano_filtro = input.nextInt();
                    agenda.FiltrarPorData(dia_filtro, mes_filtro, ano_filtro);

                    break;

                case 5:
                    System.out.print("Descrição: ");
                    String descricao_filtro = input.nextLine();
                    agenda.FiltrarPorDescricao(descricao_filtro);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    public static void menu() {
        System.out.println("\tCadastro de eventos");
        System.out.println("1. Adicionar evento");
        System.out.println("2. Remover evento");
        System.out.println("3. Listar eventos");
        System.out.println("4. Filtro por data");
        System.out.println("5. Filtro por evento");
        System.out.println("Opcao:");
    }
}
