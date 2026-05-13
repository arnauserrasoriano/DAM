package exercicis_classe;

import java.util.*;

class Problema5 {
    public static void main(String[] args) {
        int comptU = 0;
        Scanner sc = new Scanner(System.in);

        String entrada;
        String text = "";
        String text2= "";
        int salts = 0;
        do {

            System.out.print("Posa una frase: ");
            entrada = sc.nextLine();

            if (entrada.isEmpty()) {
                System.out.println("Necesites posar un caracter no buit!!");
            } else {
                text += entrada + '\n';
                salts++;
            }
        } while (!entrada.endsWith("."));
        String entrada2;

        do {

            System.out.print("Posa una lletra: ");
            entrada2 = sc.nextLine();

            for (int j = 0; j < text.length(); j++) {
                char c = text.charAt(j);
                if (c != ' ' && c != '.') {
                    text2 += c;

                }

            }
            char target = entrada2.charAt(0);

            for (int i = 0; i < text2.length(); i++) {

                if (text2.charAt(i) == target) {
                    comptU++;
                }
            }



        }while (entrada2.isEmpty());


        int format =text2.length() -1;
        System.out.println("Hi han "+ format +" caracters");
        System.out.println("Hi han "+ salts +" salts");
        System.out.format("Surt "+ comptU +" vegades");

    }
}


/*
package exercicis_classe;

import java.io.IO;

public class Problema5 {

    public static void main(String[] args) {

        int comptU = 0;

        StringBuilder text = new StringBuilder();
        StringBuilder text2 = new StringBuilder();

        int salts = 0;

        // Llegir frases
        while (true) {

            IO.println("Posa una frase: ");

            var entrada = IO.readln();

            if (entrada.isBlank()) {

                IO.println("Necesites posar un caracter no buit!!");
                continue;
            }

            text.append(entrada).append('\n');
            salts++;

            if (entrada.endsWith(".")) {
                break;
            }
        }

        // Eliminar espais i punts
        for (int j = 0; j < text.length(); j++) {

            char c = text.charAt(j);

            if (c != ' ' && c != '.') {
                text2.append(c);
            }
        }

        // Demanar lletra
        String entrada2;

        while (true) {

            IO.println("Posa una lletra: ");

            entrada2 = IO.readln();

            if (!entrada2.isBlank()) {
                break;
            }

            IO.println("Has de posar una lletra!");
        }

        char target = entrada2.charAt(0);

        // Comptar coincidències
        for (int i = 0; i < text2.length(); i++) {

            if (text2.charAt(i) == target) {
                comptU++;
            }
        }

        int format = text2.length();

        IO.println("Hi han " + format + " caracters");
        IO.println("Hi han " + salts + " salts");
        IO.println("Surt " + comptU + " vegades");
    }
}
 */