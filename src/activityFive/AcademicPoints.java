package activityFive;

import java.util.ArrayList;
import java.util.Scanner;

public class AcademicPoints {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        double nota;
        double soma = 0;

        while (true) {
            System.out.print("Digite uma nota (valor negativo para encerrar): ");
            nota = leia.nextDouble();

            if (nota < 0) {
                break;
            }

            notas.add(nota);
            soma += nota;
        }

        if (notas.size() > 0) {
            double media = soma / notas.size();
            System.out.printf("Média das notas: %.2f%n", media);
        } else {
            System.out.println("Nenhuma nota foi informada.");
        }

        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) < 5.0) {
                notas.remove(i);
                i--;
            }
        }

        System.out.println("Notas aprovadas (>= 5.0): " + notas);

        leia.close();
    }
}