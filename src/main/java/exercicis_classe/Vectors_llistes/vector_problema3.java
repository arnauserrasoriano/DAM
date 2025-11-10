package exercicis_classe.Vectors_llistes;

import java.util.Arrays;
import java.util.Scanner;

public class vector_problema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] num = sc.nextLine().split(" ");

        System.out.print("[");

        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
            if (i<num.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");


        int num2 = sc.nextInt() -1;
        System.out.println(num[num2]);


    }
}
