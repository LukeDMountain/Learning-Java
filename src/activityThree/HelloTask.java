package activityThree;

import java.util.Scanner;

public class HelloTask {
    public static void imprimirSaudacao(String nome) {
        System.out.println("Bem-vindo(a) " + nome + "! Essa é a nossa aula de métodos :D");
    }

    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema, para prosseguimento, diga seu nome:");
        String nome = leia.nextLine();

        imprimirSaudacao(nome);

        leia.close();



    }
}