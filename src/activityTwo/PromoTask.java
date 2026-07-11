package activityTwo;

import java.util.Scanner;

public class PromoTask {
    public static void main(String[] args) {

        double valorCompra;
        double desconto;
        double valorFinal;

        Scanner leia = new Scanner(System.in);

        System.out.println("Bem-vindo à loja Tchupaquesmaine!");
        System.out.println("Por favor, me diga o valor da sua compra:");

        valorCompra = leia.nextDouble();

        if (valorCompra < 100) {
            System.out.println("Você não recebeu desconto.");
            System.out.println("Valor da compra: R$ " + valorCompra);

        } else if (valorCompra >= 100 && valorCompra <= 299) {

            desconto = valorCompra * 10 / 100;
            valorFinal = valorCompra - desconto;

            System.out.println("Você recebeu 10% de desconto!");
            System.out.println("Valor original: R$ " + valorCompra);
            System.out.println("Valor final: R$ " + valorFinal);

        } else if (valorCompra >= 300) {

            desconto = valorCompra * 20 / 100;
            valorFinal = valorCompra - desconto;

            System.out.println("Você recebeu 20% de desconto!");
            System.out.println("Valor original: R$ " + valorCompra);
            System.out.println("Valor final: R$ " + valorFinal);

        }
    }
}