import java.util.Scanner;

public class torneig{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos = Integer.parseInt(sc.nextLine());
        int lider2 = 0;
        for (int c = 0; c < numCasos; c++) {
            boolean lideratge = false;

            int partits = Integer.parseInt(sc.nextLine());

            int puntsA = 0;
            int puntsB = 0;
            int anterior=0;
            int lider1 = 0;

            for (int i = 0; i < partits; i++) {
                int lider = 0;

                String entrada = sc.nextLine();
                if (entrada.equals("A")) {
                    puntsA += 3;
                } else if (entrada.equals("B")) {
                    puntsB += 3;
                } else if (entrada.equals("E")) {
                    puntsA += 1;
                    puntsB += 1;
                }

                if (puntsA > puntsB) {
                    lider = 1;
                } else if (puntsB > puntsA) {
                    lider = 2;
                } else {
                    lider = 0;
                }

                if (lider != 0 && lider != anterior) {
                    lider1++;
                }
                anterior=lider;
           }
            System.out.println(puntsA + " " + puntsB + " " + Math.abs(puntsA - puntsB) + " " + lider1);


        }

    }

}

