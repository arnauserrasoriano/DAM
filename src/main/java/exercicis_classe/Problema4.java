package exercicis_classe;

import java.util.*;

class Problema4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comptA = 0;
        String entrada;
        int resultat = 0;
        String entrada2;
        String text = "";
        String text2= "";
        int salts = 0;
        int comptB = 0;
        boolean v;
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

        for (int j = 0; j < text.length(); j++) {
            char c = text.charAt(j);
            if (c != ' ' && c != '.') {
                text2 += c;
            }
        }
        int format =text2.length() -1;
        System.out.println("Hi han "+ format +" caracters");
        System.out.println("Hi han "+ salts +" salts");

    }
}


