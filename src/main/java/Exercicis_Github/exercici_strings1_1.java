package Exercicis_Github;
import java.util.Scanner;

public class exercici_strings1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        int longitud = entrada.length();
        boolean parella = longitud % 2 == 0;
        System.out.printf(entrada + " -> sortida:" + " longitud " + longitud + " (%s)%n ", parella ? "parella" : "senar");
        sc.close();
    }
}
