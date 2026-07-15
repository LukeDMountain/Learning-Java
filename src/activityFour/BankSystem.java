package activityFour;

import java.util.Scanner;

public class BankSystem {

    public static void abrirCofre() {

        final int senha = 9999;
        int resposta;
        int tentativas = 5;

        Scanner leia = new Scanner(System.in);

        while (tentativas > 0) {

            System.out.print("Digite o código do cofre: ");
            resposta = leia.nextInt();

            if (resposta == senha) {
                System.out.println("Cofre Aberto!");
                return;
            } else {
                tentativas--;

                if (tentativas > 0) {
                    System.out.println("Código Errado. Restam " + tentativas + " tentativa(s).");
                } else {
                    System.out.println("Cofre Bloqueado!");
                }
            }
        }

        leia.close();
    }

    public static void main(String[] args) {
        abrirCofre();
    }
}