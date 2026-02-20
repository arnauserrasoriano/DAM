package joel;

import java.util.Scanner;

public class disesenyador_tanqus {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int primerNum = Integer.parseInt(sc.nextLine());
        while (primerNum-- > 0) {
            String[] sep = sc.nextLine().split(" ");

            String asterisc = sep[1];
            int n = Integer.parseInt(sep[0]);

            for (int i = 0; i < n; i++) {
                for (int l = 0; l < n; l++) {
                    System.out.println(asterisc + " ");
                }
                System.out.println();
            }
        }
    }
}
