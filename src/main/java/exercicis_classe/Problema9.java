package exercicis_classe;

import java.awt.image.ImagingOpException;
import java.util.*;


public class Problema9 {
    public static void main(String[] args) {
        System.out.println("Posa una paraula: ");
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        int compt = 0;

        String resultat = "";
        for (int i = entrada.length() - 1; i >= 0; i--) {
            resultat += entrada.charAt(i);
        }
        System.out.println(resultat);

        System.out.println("Posa el caracter a trobar: ");
        Scanner sc2 = new Scanner(System.in);
        String entrada2 = sc2.nextLine();

        if (entrada.contains(entrada2)) {
            compt++;
        }
        System.out.println("Conte la paraula" + compt + "vegades");
    }



}



