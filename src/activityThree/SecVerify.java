package activityThree;

import java.util.Scanner;

public class SecVerify {

    public static boolean verificarMaioridade(int idade) {
        if (idade >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a sua idade para verificação:");
        int idade = leia.nextInt();

        if (verificarMaioridade(idade)) {
            System.out.println("Acesso Liberado");
        } else {
            System.out.println("Acesso Negado");
        }

        leia.close();
    }
}