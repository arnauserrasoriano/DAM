package joel;

import java.util.Scanner;

public class pr2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int casos = Integer.parseInt(sc.nextLine().trim());
        while (casos-->0){
            String[] numeros = sc.nextLine().split(" ");
            int numeroCas=Integer.parseInt(sc.nextLine().trim());
            boolean apareix = false;

            for (int i = 0; i < numeros.length; i++) {
                if(numeroCas==Integer.parseInt(numeros[i])){
                    System.out.print(i + " ");
                    apareix=true;
                }

            }
            if (!apareix){

                System.out.println("NO APAREIX");
            }else {
                System.out.println();
            }

        }
    }

}

