package Exercicis_Github;
import java.util.*;

public class exercici_string4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primera frase: ");
        String entrada = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Paraula: ");
        String entrada2 = sc2.nextLine();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Paraula: ");
        String entrada3 = sc2.nextLine();

        if(entrada.startsWith(entrada2)){
            System.out.println("Comença en '" + entrada2 + "': " + "Sí");
        }else {
            System.out.println("Comença en '" + entrada2 + "': " + "No");
        }

        if(entrada.endsWith(entrada3)){
            System.out.println("Acaba en '" + entrada3 + "': " + "Sí");
        }else {
            System.out.println("Acaba en '" + entrada3 + "': " + "No");
        }





    }

}
