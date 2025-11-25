package exercicis_classe.Matrius;
import java.util.*;

public class matrius_problema4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] num = new char[5][5];
        String valor = "abcdefghijklmnopqrstuvxzy";
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                num[i][j] = valor.charAt(k);
                k++;
                System.out.print(num[i][j] + "\t");

            }
            System.out.println();

        }
    }
}







