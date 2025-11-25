package exercicis_classe.arrays;


import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] var = new String[num];
        String paraules;

        for (int i = 0; i < var.length; i++) {
            paraules = sc.nextLine();
            var[i] = paraules;
        }
        System.out.print("[");

        for (int j = 0; j < var.length; j++) {
            System.out.print(var[j]);

            if (j < var.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.print(" -> ");
        System.out.print("[");
        for (int j = 0; j < var.length; j++) {
            System.out.print(var[j].length());
            if(j<var.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        }
    }


