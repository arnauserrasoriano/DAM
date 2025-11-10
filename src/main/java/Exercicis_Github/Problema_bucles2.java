package Exercicis_Github;


import java.util.Scanner;

public class Problema_bucles2 {
    public static void main(String[] args) {
        int n = 1;
        long resultat = 1;
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        while (n <= numero){
            resultat *= n;
            n++;
        }
        System.out.print(resultat);

    }
}

