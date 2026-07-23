package PublicTransportDF.TransportePublico;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        Onibus onibus = new Onibus();
        Metro metro = new Metro();

        double carteira;

        System.out.println("===== TRANSPORTE PÚBLICO DF =====");

        System.out.print("Quanto deseja depositar? R$ ");
        carteira = leia.nextDouble();
        leia.nextLine();

        if (carteira < 5.50) {
            System.out.println("Saldo insuficiente.");
            leia.close();
            return;
        }

        System.out.println("\nEscolha o transporte:");
        System.out.println("1 - Ônibus");
        System.out.println("2 - Metrô");

        int opcao = leia.nextInt();

        switch (opcao) {

            case 1:
                carteira -= onibus.getTarifa();
                onibus.iniciarViagem();
                onibus.abrirPortasTraseiras();
                break;

            case 2:
                carteira -= metro.getTarifa();
                metro.iniciarViagem();
                metro.fecharPortasAutomaticamente();
                break;

            default:
                System.out.println("Opção inválida.");
                leia.close();
                return;
        }

        System.out.printf("\nSaldo restante: R$ %.2f%n", carteira);

        leia.close();
    }
}