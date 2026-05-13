package exercicis_classe.arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroCasos = Integer.parseInt(sc.nextLine());
        String[] vec = new String[numeroCasos];
        String paraules;
        boolean[] comp = new boolean[numeroCasos];


        for(int x=0; x<vec.length;x++){
            paraules = sc.nextLine();
            vec[x]=paraules;

        }

        for(int i=0; i<vec.length;i++) {
            String primeralletra = vec[i].substring(0,1);
            String ultimalletra = vec[i].substring(vec[i].length()-1);

            if(vec[i].startsWith(ultimalletra) && vec[i].endsWith(primeralletra)){
                comp[i]=true;
            }else {
                comp[i]=false;

            }

            }
        System.out.println(Arrays.toString(comp));

    }
}

/*
package exercicis_classe.arrays;

import java.io.IO;
import java.util.Arrays;

public class Problema3 {

    public static void main(String[] args) {

        int numeroCasos = Integer.parseInt(IO.readln());

        String[] vec = new String[numeroCasos];
        boolean[] comp = new boolean[numeroCasos];

        // Llegir paraules
        for (int x = 0; x < vec.length; x++) {

            vec[x] = IO.readln();
        }

        // Comprovar primera i última lletra
        for (int i = 0; i < vec.length; i++) {

            char primeraLletra = vec[i].charAt(0);
            char ultimaLletra = vec[i].charAt(vec[i].length() - 1);

            comp[i] = primeraLletra == ultimaLletra;
        }

        IO.println(Arrays.toString(comp));
    }
}
 */