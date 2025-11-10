package exercicis_classe;

import java.util.Scanner;

public class Problema8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Posa una frase: ");
        String text = "";

        do {
            String escaner = sc.nextLine();

            text += escaner + '\n';
            if (!text.endsWith(".")) {
                break;
            }
            System.out.println(text);

        } while (true);

        String text2 = "";

        for(int i=0; i<text.length();i++){
            char trobat = text.charAt(i);
            if (Character.isUpperCase(trobat)){
                text2 += String.valueOf(trobat).toLowerCase();

            }
            else if(Character.isLowerCase(trobat)){
                text2 += String.valueOf(trobat).toUpperCase();

            }
            else{
                text2 += trobat;

            }

        }
        System.out.println(text2);

    }
}
