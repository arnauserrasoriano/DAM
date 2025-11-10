package Exercicis_Github;

import java.util.Scanner;

public class Problema_bucles4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        boolean esPrimer = true;
        int cont = 0;
        for(int n=1; numero>=n; n++){
            if (numero % n == 0){
                esPrimer = false;
                cont++;
            }
        }
        if (cont == 2) {
            System.out.println("Primer");
        } else {
            System.out.println("No primer");
        }

    }
}