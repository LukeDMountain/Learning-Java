package activityThree;

import java.util.Scanner;

public class ClimateMonitor {
    public static double converterParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static void avaliarClima(double fahrenheit) {

        if (fahrenheit < 50.0) {
            System.out.println("Clima Frio.");
        } else if (fahrenheit >= 50.0 && fahrenheit < 80.0) {
            System.out.println("Clima Agradável.");
        } else {
            System.out.println("Clima Quente.");
        }
    }

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("=== Sistema de Monitoramento Climático ===");
        System.out.print("Digite a temperatura em Celsius: ");

        double celsius = leia.nextDouble();
        double fahrenheit = converterParaFahrenheit(celsius);

        avaliarClima(fahrenheit);

        leia.close();
    }
}