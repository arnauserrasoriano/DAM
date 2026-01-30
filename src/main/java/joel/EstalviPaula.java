package joel;

import java.util.Scanner;

public class EstalviPaula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos = Integer.parseInt(sc.nextLine());

        while(numCasos-->0){
            String entrada =  sc.nextLine();
            String[] sepa = entrada.split(" ");
            int num = Integer.parseInt(sepa[0]);
            int num2 = Integer.parseInt(sepa[1]);
            int num3 = Integer.parseInt(sepa[2]);

            int suma = 0;

            for (int i = 0; i < num3; i++) {
                if (i % 2 == 0){
                    suma += num2;
                    if(suma>num){
                        suma = num;
                    }
                }
            }
            System.out.println(suma);
            sc.close();
        }
    }
}
