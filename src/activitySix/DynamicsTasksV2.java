package activitySix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DynamicsTasksV2 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        ArrayList<String> tarefas = new ArrayList<>();
        ArrayList<String> concluidas = new ArrayList<>();

        while (true) {
            System.out.print("Digite uma tarefa (ou 'fim' para encerrar): ");
            String tarefa = leia.nextLine();

            if (tarefa.equalsIgnoreCase("fim")) {
                break;
            }

            tarefas.add(tarefa);
        }

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Listar tarefas");
            System.out.println("2 - Ordenar tarefas (A-Z)");
            System.out.println("3 - Remover tarefa específica");
            System.out.println("4 - Remover FIFO");
            System.out.println("5 - Remover FEFO");
            System.out.println("6 - Remover LIFO");
            System.out.println("7 - Concluir tarefa");
            System.out.println("8 - Listar tarefas concluídas");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = Integer.parseInt(leia.nextLine());

            switch (opcao) {

                case 1:
                    listarTarefas(tarefas);
                    break;

                case 2:
                    Collections.sort(tarefas);
                    System.out.println("Tarefas ordenadas com sucesso!");
                    break;

                case 3:
                    System.out.print("Digite o nome da tarefa que deseja remover: ");
                    String nome = leia.nextLine();

                    if (tarefas.remove(nome)) {
                        System.out.println("Tarefa removida!");
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }
                    break;

                case 4:
                    removerFIFO(tarefas);
                    break;

                case 5:
                    removerFEFO(tarefas);
                    break;

                case 6:
                    removerLIFO(tarefas);
                    break;

                case 7:
                    concluirTarefa(leia, tarefas, concluidas);
                    break;

                case 8:
                    System.out.println("Tarefas concluídas: " + concluidas);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        leia.close();
    }

    public static void listarTarefas(ArrayList<String> tarefas) {

        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        System.out.println("\nLista de tarefas:");

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }
    }

    public static void removerFIFO(ArrayList<String> tarefas) {

        if (!tarefas.isEmpty()) {
            System.out.println("Removida: " + tarefas.remove(0));
        } else {
            System.out.println("Lista vazia.");
        }
    }

    public static void removerFEFO(ArrayList<String> tarefas) {

        if (!tarefas.isEmpty()) {
            System.out.println("Removida: " + tarefas.remove(0));
        } else {
            System.out.println("Lista vazia.");
        }
    }

    public static void removerLIFO(ArrayList<String> tarefas) {

        if (!tarefas.isEmpty()) {
            System.out.println("Removida: " + tarefas.remove(tarefas.size() - 1));
        } else {
            System.out.println("Lista vazia.");
        }
    }

    public static void concluirTarefa(Scanner leia,
                                      ArrayList<String> tarefas,
                                      ArrayList<String> concluidas) {

        listarTarefas(tarefas);

        if (tarefas.isEmpty()) {
            return;
        }

        System.out.print("Digite o número da tarefa concluída: ");
        int indice = leia.nextInt();
        leia.nextLine();

        if (indice >= 1 && indice <= tarefas.size()) {

            String tarefa = tarefas.remove(indice - 1);
            concluidas.add(tarefa);

            System.out.println("Tarefa concluída!");
        } else {
            System.out.println("Número inválido.");
        }
    }
}