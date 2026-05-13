package exercicis_classe;

import java.util.*;

class Problema6 {
    public static void main(String[] args) {
        int compt = 0;
        Scanner sc = new Scanner(System.in);

        String entrada;
        String text = "";
        int indexInt = 0;
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

        String trobat = text.substring(indexInt, text.length());
        int index = 0;
        do {
            int c = text.indexOf(" ", indexInt);

            if (c == -1) {
                break;
            }
            else{
                compt++;
                indexInt = c + 1;
            }

        }while (true);

        System.out.println(compt);
        compt++;


    }
}

/*
package exercicis_classe;

import java.io.IO;

public class Problema6 {

    public static void main(String[] args) {

        int compt = 0;

        StringBuilder text = new StringBuilder();

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

        // Comptar paraules
        boolean dinsParaula = false;

        for (int i = 0; i < text.length(); i++) {

            char c = text.charAt(i);

            if (c != ' ' && c != '\n' && c != '.') {

                if (!dinsParaula) {
                    compt++;
                    dinsParaula = true;
                }

            } else {
                dinsParaula = false;
            }
        }

        IO.println("Hi han " + compt + " paraules");
        IO.println("Hi han " + salts + " salts");
    }
}
 */


