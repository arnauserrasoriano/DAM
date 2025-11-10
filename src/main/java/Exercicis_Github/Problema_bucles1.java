package Exercicis_Github;

import java.util.Scanner;

public class Problema_bucles1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        for (int n=0;n<numero; n++){
            if (n%2==0) {
                System.out.print(n + " ");
                if (n+2>=numero){
                    System.out.print(n);

                }
            }
        }
    }
}
