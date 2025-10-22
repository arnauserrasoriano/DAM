package Exercicis_Classe;
import java.util.Scanner;

public class Problema_bucle1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero != 0) {
            for (int n = 0; n <= numero; n += 2) {
                System.out.print(n + " ");
            }
        }
    }
}
