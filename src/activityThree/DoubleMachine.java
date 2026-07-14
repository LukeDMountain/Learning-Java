package activityThree;

import java.util.Scanner;

public class DoubleMachine {
    public static void calcularDobro(int nums) {
        System.out.println("Este é o dobro do seu numero " + nums);
    }

    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        System.out.println("Bem-vindo a Máquina do Dobro! Digite qualquer numero e veja ele dobrar.");

        int nums = leia.nextInt();

        calcularDobro(nums * 2);

        leia.close();

    }
}