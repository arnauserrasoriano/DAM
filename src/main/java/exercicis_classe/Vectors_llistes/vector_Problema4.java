package exercicis_classe.Vectors_llistes;

import java.util.*;

public class vector_Problema4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts2;

        String[] parts = sc.nextLine().split(" ");
        int numCasos = Integer.parseInt(sc.nextLine());


        System.out.print("[");
        for(int i=0;i<parts.length;i++){
            System.out.print(Integer.parseInt(parts[numCasos]));
            if(i<parts.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}
