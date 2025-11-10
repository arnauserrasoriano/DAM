package joel;

import java.util.Scanner;

public class exercici_ifelse {

    public static void main(String[] args) {
        String resposta;
        Scanner ent = new Scanner(System.in);
        resposta = ent.nextLine();

        if (resposta.equals("Coratge")) {
            System.out.println("Gryffindor");
        } else if (resposta.equals("Coneixement")) {
            System.out.println("Ravenclaw");
        } else if (resposta.equals("Ambició")) {
            System.out.println("Slytherin");
        } else {
            System.out.println("Hufflepuff");
        }
    }
}

