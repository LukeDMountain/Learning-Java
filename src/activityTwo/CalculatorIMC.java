package activityTwo;

import java.util.Scanner;

public class CalculatorIMC {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double peso;
        double altura;


        System.out.println("Escreva seu peso");
        peso = leia.nextDouble();
        System.out.println("Escreva sua altura para ver o seu imc e o resultado");
        altura = leia.nextDouble();
        double imc =  peso / (altura*altura);

        if (imc < 18.5){
            System.out.println("Este é o seu imc: " + imc + " Você está abaixo do peso.");
        } else if (imc  >= 18.5&& imc <= 24.9) {
            System.out.println("Este é o seu imc: " + imc + " Você está com o peso normal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Este é o seu imc: " + imc + " Você está sobrepeso.");
        } else{
            System.out.println("Este é o seu imc: " + imc + " Você está obeso.");
        }


    }
}