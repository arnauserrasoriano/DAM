package Exercicis_Classe;

import java.util.Scanner;

public class Problema_bucles3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long resultat = 0;
        int numero = sc.nextInt();
        for(int n=1; n<10; n++){
            resultat = numero * n;
            System.out.println(numero + "x" + n + "=" + resultat);
        }

    }
}