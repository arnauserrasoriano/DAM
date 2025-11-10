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



