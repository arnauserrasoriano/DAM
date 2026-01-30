package exercicis_classe.format;

import java.util.Scanner;

public class format4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix un nombre: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.format("%2d x %2d = %3d%n", n, i, n * i);
        }
    }
}