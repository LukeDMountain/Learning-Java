package activityTwo;

import java.util.Scanner;

public class SherlockNums {
    public static void main(String[] args) {

        int num;
        Scanner leia = new Scanner(System.in);

        num = leia.nextInt();
        if (num < 0 && num % 2 == 0){
            System.out.println("é par e negativo.");
        } else if (num < 0 && num % 2 != 0){
            System.out.println("é impar e negativo.");
        } else if (num > 0 && num % 2 == 0){
            System.out.println("é par e positivo.");
        } else if (num > 0 && num % 2 != 0){
            System.out.println("é impar e positivo.");

            
        }


    }
    }