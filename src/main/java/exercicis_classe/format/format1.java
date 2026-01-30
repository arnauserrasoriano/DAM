package exercicis_classe.format;

import java.util.Scanner;

public class format1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        double c = sc.nextDouble();

        // Cálculos
        double f = c * 9 / 5 + 32;
        double k = c + 273.15;

        // Salida con formato
        System.out.format(
                "Celsius: %.2f | Fahrenheit: %.2f | Kelvin: %.2f%n",
                c, f, k
        );
    }
}
