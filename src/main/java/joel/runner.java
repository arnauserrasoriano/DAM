package joel;

import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numCasos=Integer.parseInt(sc.nextLine());
        while (numCasos-->0){
            String[] entrada = sc.nextLine().trim().split("\\s+");
            if(entrada[2].equals("KM")) {
                double valor1 = Double.parseDouble(entrada[1]);
                double valor2 = Double.parseDouble(entrada[0]);

                double calculkm = (double) valor1 / valor2;
                int min = (int) calculkm;
                int res = (int) ((calculkm - min) * 60);

                int seg = res % 60;
                System.out.printf("%d:%02d /km", min, seg);
                System.out.println();

            } else if (entrada[2].equals("MS")) {
                double valor1 = Double.parseDouble(entrada[1]);
                double valor2 = Double.parseDouble(entrada[0]);
                double calculms = ((valor1 * 1000)/valor2)/60;
                int min = (int) calculms;
                int res = (int) ((calculms - min) * 60);

                int seg = res % 60;
                System.out.printf("%d:%02d /km", min, seg);
                System.out.println();
            } else {
                System.out.println("ERROR");
            }

        }
    }
}
