package src.app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Application for converting degrees Celsius to Fahrenheit and vice versa (Fahrenheit to Celsius).");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, input degrees in Fahrenheit: ");
        double fahr = scanner.nextDouble();
        System.out.println(fahr + " degrees Fahrenheit will be " + convFahrToCels(fahr) + " degrees Celsius.");

        System.out.print("Please, input degrees in Celsius: ");
        double cels = scanner.nextDouble();
        System.out.println(cels + " degrees Celsius will be " + convClsToFahr(cels) + " degrees Fahrenheit.");
    }

    private static double convFahrToCels(double fahr) {
        return (fahr - 32) * 5 / 9;
    }

    private static double convClsToFahr(double cels) {
        return (cels * 9 / 5) + 32;
    }

}
