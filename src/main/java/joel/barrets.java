package joel;

import java.util.Scanner;

public class barrets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[] llista = new int[N];
        int compt = 0;
        for (int i = 0; i < llista.length; i++) {
            llista[i] = sc.nextInt();
        }
        for (int i = 0; i < llista.length; i++) {

            int oposat = (i + N / 2) % N;
            if (llista[i] == llista[oposat]) {
                compt++;
            }
        }
        System.out.println(compt);
    }
}
