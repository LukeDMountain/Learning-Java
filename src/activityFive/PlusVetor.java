package activityFive;

import java.util.Scanner;

public class PlusVetor {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = leia.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.print("Vetor preenchido: [");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);

            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        System.out.println("A soma de todos os elementos é: " + soma);

        leia.close();
    }
}