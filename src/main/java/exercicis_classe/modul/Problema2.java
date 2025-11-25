package exercicis_classe.modul;
import java.util.Scanner;

import static exercicis_classe.modul.Problema1.retornaCaracter;

public class Problema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < entrada ; i++) {
            mostrarVarisCaracters(9);
        }
    }

    public static void mostrarVarisCaracters(int numCaracter) {
        while (numCaracter-->1){
            char aleatori = retornaCaracter();
            System.out.println(aleatori);
        }
    }
}
