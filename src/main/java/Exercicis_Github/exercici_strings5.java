package Exercicis_Github;
import java.util.*;

public class exercici_strings5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primera: ");
        String entrada = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Segon: ");
        String entrada2 = sc2.nextLine();


        if (entrada.compareTo(entrada2)<0){
            System.out.println("'"+entrada + "' va abans que '" + entrada2 + "'");
        }
        else if(entrada.compareTo(entrada2)==0){
            System.out.println("Són iguals");
        }
        else {
            System.out.println("'"+entrada + "' va després que '" + entrada2 + "'");
        }







    }

}
