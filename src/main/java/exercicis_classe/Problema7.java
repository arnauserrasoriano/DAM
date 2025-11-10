package exercicis_classe;

import java.util.*;

class Problema7 {
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
        int c = text.indexOf(" ", indexInt);


        while(c != ' '){

            compt++;
            indexInt = c + 1;
            }



        System.out.println(compt);
        compt++;


    }
}



