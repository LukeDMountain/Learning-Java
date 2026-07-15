package activityFour;

import java.util.Scanner;

public class LadderBob {

    public static void desenharEscada(int degraus, char simbolo) {

        for (int linha = 1; linha <= degraus; linha++) {

            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print(simbolo);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de degraus: ");
        int degraus = leia.nextInt();

        System.out.print("Digite o símbolo: ");
        char simbolo = leia.next().charAt(0);

        desenharEscada(degraus, simbolo);

        leia.close();
    }
}