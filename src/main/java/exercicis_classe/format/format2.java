package exercicis_classe.format;

import java.util.Scanner;

public class format2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.format("%5d %5d%n", i, i * i);
        }
    }
}
