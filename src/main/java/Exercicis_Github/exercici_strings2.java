package Exercicis_Github;
import java.util.*;

public class exercici_strings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        int compt = 0;

        for(int i=0; i<entrada.length(); i++){
            if("AEIOUaeiou".contains(String.valueOf(entrada.charAt(i)))){
                compt++;

            }

        }
        System.out.printf("(%s) sortida -> Nombre de vocals: (%d)%n", entrada, compt);

    }

}
