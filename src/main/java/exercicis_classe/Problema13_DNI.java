package exercicis_classe;

import java.util.Scanner;

public class Problema13_DNI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Que vols fer? ");
        System.out.println("Calcular la lletra? O comprovar dni? (1/2)");  //DNI
        System.out.println();
        String triar = sc.nextLine();
        String abc = "TRWAGMYFPDXBNJZSQVHLCKE";

        if (triar.equals("1")) {
            System.out.println("Posa l'entrada del número del DNI: ");

            String entrada = sc.nextLine();
            int suma = 0;
            int calcul = 0;

            for (int i = 0; i < entrada.length(); i++) {
                suma += Character.getNumericValue(entrada.charAt(i));

            }
            calcul = suma % 23;
            char entrada2 = abc.charAt(calcul);
            System.out.println("La teva lletra és la '" + entrada2 + "'");
        } else if (triar.equals("2")) {
            int suma2 = 0;
            int mitja = 0;
            System.out.println("Posa tot el DNI per comprovar: ");

            String entrada2 = sc.nextLine();
            for (int j = 0; j < entrada2.length(); j++) {
                if (Character.isDigit(entrada2.charAt(j))) {
                    suma2 += Character.getNumericValue(entrada2.charAt(j));
                    mitja = suma2 % 23;
                }
                char parau = abc.charAt(mitja);
                if (Character.isAlphabetic(entrada2.charAt(j))) {
                    if (entrada2.endsWith(String.valueOf(parau))) {
                        System.out.println("Correcte està ben format.");
                    }else{
                        System.out.println("No està ben format!!");
                    }
                }
            }
        }
    }
}



