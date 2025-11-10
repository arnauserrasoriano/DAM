package Exercicis_Github;
import java.util.Scanner;

public class exercici_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        int longitud = entrada.length();
        if (longitud%2==0){
            System.out.println(entrada + " -> sortida:" + " longitud " + longitud + " (parell) ");
        }else{
            System.out.println(entrada + " -> sortida:" + " longitud: " + longitud + " (senar) ");
        }
        sc.close();
    }
}
