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


