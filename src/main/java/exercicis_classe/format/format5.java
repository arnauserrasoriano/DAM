package exercicis_classe.format;

import java.util.Scanner;

public class format5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix tres nombres enters: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        double mitjana = (a + b + c) / 3.0;

        System.out.println(
                String.format("Mitjana: %.2f | Màxim: %d | Mínim: %d",
                        mitjana, max, min)
        );
    }
}
