package joel;

import java.util.Scanner;

public class numeroSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = String.valueOf(sc.nextLine());
        int resultat = 1;

        for (int x = 0; x < entrada.length(); x++) {
            char c = entrada.charAt(x);
            int digit = c - '0';
            if (digit != 0) {
                resultat = resultat * digit;
            }
        }
        while(resultat>9){
            int nou=1;

            String res = String.valueOf(resultat);
            for(int i=0;i<res.length();i++){
                int digit= res.charAt(i) - '0';
                if (digit != 0) {
                    nou = nou * digit;
                }
            }
            resultat=nou;

        }
        System.out.println(resultat);

    }
}



