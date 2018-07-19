package agenda_data;

import java.text.ParseException;
import java.util.Scanner;

/**
 * Created by Heloisa, Kauan & Vinicius on 9/5/17.
 */

public class Menu {
    public static void main(String[] args) throws ParseException {
        Agenda agenda = new Agenda();
        int opcao;

        do {
            menu();
            Scanner input = new Scanner(System.in);
            opcao = input.nextInt();
            String descricao, dataInicial, horaInicial, horaFinal;


            switch (opcao) {
                case 1:
                    Scanner desc = new Scanner(System.in);
                    System.out.print("Descrição do Compromisso: ");
                    descricao = desc.nextLine();

                    Scanner dtIn = new Scanner(System.in);
                    System.out.print("Data Inicial no formato DD/MM/AAAA: ");
                    dataInicial = dtIn.nextLine();

                    Scanner hrIn = new Scanner(System.in);
                    System.out.print("Hora Inicial no formato HH:MM: ");
                    horaInicial = hrIn.nextLine();

                    Scanner HrFm = new Scanner(System.in);
                    System.out.print("Hora Final no formato HH:MM: ");
                    horaFinal = HrFm.nextLine();

                    agenda.inserirCompromisso(descricao, dataInicial, horaInicial, horaFinal);
                    break;

                case 2:
                    if (agenda.arrayVazio()) {
                        System.out.print("Não há compromissos cadastrados!\n");
                    }else{
                        Scanner descComp = new Scanner(System.in);
                        System.out.print("Descrição do Compromisso: ");
                        String descricao_remove = descComp.nextLine();
                        agenda.removeCompromisso(descricao_remove);
                    }
                    break;

                case 3:
                    agenda.listaCompromisso();
                    break;

                case 4:
                    if (agenda.arrayVazio()) {
                        System.out.print("Não há compromissos cadastrados!\n");
                    }else{
                        Scanner dt = new Scanner(System.in);
                        System.out.print("Data: ");
                        String data_filtro = dt.nextLine();
                        agenda.FiltrarPorData(data_filtro);
                    }
                    break;

                case 5:
                    if (agenda.arrayVazio()) {
                        System.out.print("Não há compromissos cadastrados!\n");
                    }else{
                        Scanner descComp = new Scanner(System.in);
                        System.out.print("Descrição do Compromisso: ");
                        String descricao_filtro = descComp.nextLine();
                        agenda.FiltrarPorDescricao(descricao_filtro);
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    public static void menu() {
        System.out.println("\n\tAGENDA DE COMPROMISSOS");
        System.out.println("1. Adicionar Compromisso");
        System.out.println("2. Remover Compromisso");
        System.out.println("3. Listar Compromissos");
        System.out.println("4. Filtrar Agenda por Data");
        System.out.println("5. Filtrar Agenda por Compromissos");
        System.out.println("Opção:");

    }
}
