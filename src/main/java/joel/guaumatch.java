package joel;

import java.util.Scanner;

public class guaumatch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        String[] noms = new String[N];
        String[] mides = new String[N];
        int[] edats = new int[N];

        for (int i = 0; i < N; i++) {
            noms[i] = sc.next();
            mides[i] = sc.next().toUpperCase(); // normalitzem mida
            edats[i] = sc.nextInt();
        }

            String nomMeu=sc.nextLine();
            String midaMeva=sc.next().toUpperCase();
            int edatMeva = sc.nextInt();

            boolean trobat = false;
            for (int i = 0; i < N; i++) {
                if (mides[i].equals(midaMeva) && Math.abs(edats[i] - edatMeva) <= 2) {
                    System.out.println(noms[i]);
                    trobat = true;
                }
            }
                if (!trobat) {
                    System.out.println("NO MATCH");
                }

            }
        }
