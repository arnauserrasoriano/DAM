package joel;

import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int compt =0;
        int compt1 =1;
        int anterior=0;
        boolean primer=true;

        do {
            int numero = Integer.parseInt(sc.nextLine());
            if (primer) {
                anterior = numero;
                primer = false;
            } else {

                if (numero > anterior) {
                    compt++;
                }
                anterior = numero;
            }

            if (numero == 0) {
                break;
            }
            compt1++;

        }while (true);
        System.out.println(compt1 +" "+ compt);
    }
}
