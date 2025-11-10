package exercicis_classe;

import java.util.*;

class Problema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comptA = 0;
        String entrada;
        String entrada2;
        int reserva = 0;

        do {
            System.out.print("Posa una frase: ");
            entrada = sc.nextLine();
            if (entrada.isEmpty()) {
                System.out.println("Necesites posar un caracter no buit!!");
            } else {
                break;
            }
        } while (true);

        do {
            System.out.print("Posa la lletra a buscar: ");
            entrada2 = sc.nextLine();
            if (entrada2.isEmpty()) {
                System.out.println("Necesites posar una lletra!!");
            } else {
                for (int j = 0; j < entrada.length(); j++) {
                    int resultat = entrada.indexOf('a');

                    if (resultat == -1) {
                        break;
                    }
                    else{
                        reserva = resultat + 1;
                    }
                }
                System.out.println("Hi han (" + reserva + ") caràcters amb la lletra: [" + entrada2.charAt(0) + "]");
                break;
            }
        } while (true);
    }
}