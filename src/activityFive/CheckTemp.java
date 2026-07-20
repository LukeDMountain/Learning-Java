package activityFive;

import java.util.Scanner;

public class CheckTemp {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double[] temperaturas = new double[6];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª temperatura: ");
            temperaturas[i] = leia.nextDouble();
        }

        double maior = temperaturas[0];
        double menor = temperaturas[0];

        for (int i = 1; i < temperaturas.length; i++) {

            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }

            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }
        }

        System.out.print("Temperaturas: [");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print(temperaturas[i]);

            if (i < temperaturas.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        System.out.println("Maior temperatura: " + maior + "ºC");
        System.out.println("Menor temperatura: " + menor + "ºC");

        leia.close();
    }
}