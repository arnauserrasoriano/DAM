package joel;

import java.util.Scanner;

public class ciutat_plana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos = Integer.parseInt(sc.nextLine());

        while (numCasos-- > 0) {
            int segonNum = Integer.parseInt(sc.nextLine());
            String[] numero = sc.nextLine().split(" ");
            long[] stack = new long[segonNum];
            for (int i = 0; i < segonNum; i++) {
                Long x = Long.parseLong(numero[i]);
                long resultat = 0;
                for (int j = i - 1; j >= 0; j--) {
                    Long y = Long.parseLong(numero[j]);
                    if (y > x) {
                        resultat = y;
                        break;
                    }
                }
                System.out.print(resultat + " ");

            }

            System.out.println();

        }
        sc.close();
    }
}
