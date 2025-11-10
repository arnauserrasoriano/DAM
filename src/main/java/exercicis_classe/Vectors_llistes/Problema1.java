package exercicis_classe.Vectors_llistes;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCasos = Integer.parseInt(sc.nextLine());
        while(numCasos-->0){
            int numNumeros = Integer.parseInt(sc.nextLine());

            String[] parts = sc.nextLine().split(" ");

            for(int i = 0; i < numNumeros; i++) {
                System.out.println(parts[i]);
            }
            int numRepetits = Integer.parseInt(sc.nextLine());

            for(int j = 0; j < parts.length; j++) {
                if (Integer.parseInt(parts[j])==numRepetits){
                    System.out.println(parts[j]);
                }
            }
        }
    }
}
