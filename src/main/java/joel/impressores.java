package joel;

import java.util.Scanner;

public class impressores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos = sc.nextInt();

        while (numCasos-- > 0) {
            long totalPag = 0;

            int numExamens = sc.nextInt();
            int pagines[] = new int[numExamens];
            int copies[] = new int[numExamens];
            int nou[] = new int[numExamens];
            for (int i = 0; i < numExamens; i++) {
                pagines[i] = sc.nextInt();

            }
            for (int i = 0; i < numExamens; i++) {
                copies[i] = sc.nextInt();

            }
            for (int z = 0; z < pagines.length; z++) {
                long folis = (pagines[z] + 1) / 2;
                totalPag += folis * copies[z];

            }
            System.out.println(totalPag);

        }

    }

}





