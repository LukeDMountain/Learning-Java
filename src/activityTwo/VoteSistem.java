package activityTwo;

import java.util.Scanner;

public class VoteSistem {

    public static void main(String[] args) {

            int idade;

             Scanner leia = new Scanner(System.in);


        System.out.println("Bem-vindo a verificação de idade.\n Veja se você tem a disponibilidade de votar.");

        idade = leia.nextInt();
        if (idade < 16){
            System.out.println("Você não tem idade o suficiente para votar");
        } else if (idade > 18 && idade < 70) {
            System.out.println("Você é obrigado a votar");
        }else{
            System.out.println("Você pode votar se quiser (Facultativo).");
        }


    }
}