package activityThree;

import java.util.Scanner;

public class MinusNumsTask {

    public static int SubtrairNumeros(int x, int y) {
        int sub = x - y;
        return sub;
    }

    public static void imprimirResultado(int resultado) {
        System.out.println("O resultado da operação é: " + resultado);
    }

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Bem-vindo à Calculadora com Métodos Encadeados!");

        System.out.print("Digite o primeiro número: ");
        int x = leia.nextInt();

        System.out.print("Digite o segundo número: ");
        int y = leia.nextInt();

        int resultado = SubtrairNumeros(x, y);

        imprimirResultado(resultado);

        leia.close();
    }
}