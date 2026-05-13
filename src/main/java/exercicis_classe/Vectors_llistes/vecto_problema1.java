package exercicis_classe.Vectors_llistes;

import java.util.Scanner;

public class vecto_problema1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos = Integer.parseInt(sc.nextLine());
        String[] parts = sc.nextLine().split(" ");;

        while(numCasos-->0){
            int contador = 0;
            int numCasos2 = Integer.parseInt(sc.nextLine());

            for (int i=0;i<parts.length;i++){

                contador++;
                }
            System.out.println(parts[numCasos2]);

        }

        }


        /*
        package exercicis_classe.Vectors_llistes;

import java.io.IO;

public class VectorProblema1 {

    public static void main(String[] args) {

        int numCasos = Integer.parseInt(IO.readln());

        // Llegir vector
        var parts = IO.readln().split(" ");

        while (numCasos-- > 0) {

            int index = Integer.parseInt(IO.readln());

            if (index >= 0 && index < parts.length) {

                IO.println(parts[index]);

            } else {

                IO.println("Index fora de rang");
            }
        }
    }
}
         */

}

