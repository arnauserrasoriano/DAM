package Exercicis_Github;

import java.util.Scanner;

public class Problema_condicionals3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numero = sc.nextFloat();
        if (numero<5){
            System.out.println("Suspès");
        } else if (numero>=5 && numero<=6 ) {
            System.out.println("Aprovat");

        } else if (numero>=7 && numero <= 8) {
            System.out.println("Notable");

        }else if (numero>=9 && numero <= 10) {
            System.out.println("Excel·lent");
        }

    }


}
