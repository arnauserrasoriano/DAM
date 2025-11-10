package Exercicis_Github;

import java.util.Scanner;

public class Problema_bucles5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int numerosPositius=0;
        int numerosNegatius=0;

        do {
            numero = sc.nextInt();
            if (numero!=0) {
                if (numero > 0) {
                    numerosPositius++;
                } else {
                    numerosNegatius++;
                }
            }else {
                break;
            }
        }while(numero!=0);

        System.out.println("Positius: " + numerosPositius + ", Negatius: " + numerosNegatius);
    }
}