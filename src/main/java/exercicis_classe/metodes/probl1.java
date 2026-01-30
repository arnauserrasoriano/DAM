package exercicis_classe.metodes;

import java.util.Scanner;

public class probl1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = 0;
        int num_anterior = 0;
        int compt = 0;
        boolean esPrimer = true;
        int compt_num=0;
        do {
            entrada = Integer.parseInt(sc.nextLine());
            if (esPrimer) {
                num_anterior = entrada;
                esPrimer = false;

            } else {
                if (entrada > num_anterior) {
                    compt++;
                }
            }


            compt_num++;
        }while (entrada!=0);

        System.out.println(compt_num);
        System.out.println(compt);

    }

}
