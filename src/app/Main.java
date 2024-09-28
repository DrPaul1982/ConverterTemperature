package src.app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Application for converting degrees Celsius to Fahrenheit and vice versa (Fahrenheit to Celsius).");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, input degrees in Fahrenheit: ");
        double fahr = scanner.nextDouble();
        System.out.println(fahr + " degrees Fahrenheit will be " + convFahrToCels(fahr) + " degrees Celsius.");
    }

    private static double convFahrToCels(double fahr) {
        return (fahr - 32) * 5 / 9;
    }

}
