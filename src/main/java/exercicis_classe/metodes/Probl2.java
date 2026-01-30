package exercicis_classe.metodes;

import java.util.Scanner;

public class Probl2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numCasos=Integer.parseInt(sc.nextLine());

        while (numCasos-->0){
            boolean trobat = false;
            String[] entrada = sc.nextLine().split(" ");
            int numBuscar = Integer.parseInt(sc.nextLine());
            int posicio = 0;
            for (int i = 0; i < entrada.length; i++) {
                if(numBuscar==Integer.parseInt(entrada[i])){
                    posicio = i;
                    System.out.println(i+" ");
                    trobat = true;
                }
            }

            if(!trobat){
                System.out.println("NO APAREIX");
            }else {
                System.out.println(posicio);
            }
            break;

        }
    }
}
