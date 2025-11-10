package exercicis_classe.Vectors_llistes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class vecto_problema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = Integer.parseInt(sc.nextLine());

        String[] paraules = new String[k];
        for(int i=0;i< paraules.length;i++){
            paraules[i] = sc.nextLine();
            }
        int p = Integer.parseInt(sc.nextLine()) -1;

        System.out.println(paraules[p]);


        }
    }

