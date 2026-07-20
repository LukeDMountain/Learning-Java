package activityFive;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicsTasks {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        String tarefa = "";

        while (!tarefa.equals("fim")) {

            System.out.print("Digite uma tarefa (ou 'fim' para encerrar): ");
            tarefa = leia.nextLine();

            if (!tarefa.equals("fim")) {
                tarefas.add(tarefa);
            }
        }

        System.out.println("\nTotal de tarefas registadas: " + tarefas.size());

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }

        leia.close();
    }
}