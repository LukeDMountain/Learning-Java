package activityTwo;

import java.util.Scanner;

public class SchoolPoints {
    public static void main(String[] args) {
        double nota;


        Scanner leia = new Scanner(System.in);
        System.out.println("Bem-vindo ao Revisa Senai!\n Digite sua nota para saber sua atual situação");
        nota = leia.nextDouble();
        if (nota >= 7.0){
            System.out.println("Você está aprovado!");
        } else if (nota >= 5.0 && nota < 7) {
            System.out.println("Você está de recuperação.");
        }else {
            System.out.println("Você está reprovado.");
        }
    }
}
