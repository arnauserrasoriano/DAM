package exercicis_classe;

import java.util.*;

class Problema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comptA = 0;
        String entrada;
        int reserva = 0;
        String entrada2;
        String text = "";

        do {
            System.out.print("Posa una frase: ");
            entrada = sc.nextLine();
            if (entrada.isEmpty()) {
                System.out.println("Necesites posar un caracter no buit!!");
            } else {
                text += entrada + '\n';
            }
        } while (!entrada.endsWith("."));

        do {
                for (int j = 0; j < text.length(); j++) {
                    int resultat = text.indexOf('a');

                    if (resultat == -1) {
                        break;
                    } else {
                        reserva = resultat + 1;
                    }
                }
                break;
            } while (true);
    }
}

/*
import java.io.IO;

class Problema3 {

    public static void main(String[] args) {

        StringBuilder text = new StringBuilder();

        // Llegir frases
        while (true) {

            IO.println("Posa una frase: ");

            var entrada = IO.readln();

            if (entrada.isBlank()) {

                IO.println("Necesites posar un caracter no buit!!");
                continue;
            }

            text.append(entrada).append('\n');

            if (entrada.endsWith(".")) {
                break;
            }
        }

        int comptA = 0;

        // Comptar lletres 'a'
        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == 'a') {
                comptA++;
            }
        }

        IO.println("Hi han " + comptA + " lletres a");
    }
}
 */