package Exercicis_Github;

import java.util.Scanner;


public class Problema_condicionals5 {
    public void main() {
        Scanner sc = new Scanner(System.in);

        int numeroOperat = sc.nextInt();

        System.out.println((numeroOperat % 10 == 0 ? "Sí" : "No"));
    }
}
