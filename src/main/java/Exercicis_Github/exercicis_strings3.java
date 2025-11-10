package Exercicis_Github;
import java.util.*;

public class exercicis_strings3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primera frase: ");
        String entrada = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Paraula: ");
        String entrada2 = sc2.nextLine();

        if (entrada.contains(entrada2)){
            System.out.printf("Sí, la cadena conté la paraula " + "`" + entrada2 + "`");
        }
        else{
            System.out.printf("No, la cadena no hi conté la paraula " + "`" + entrada2 + "`");

        }

    }

}
