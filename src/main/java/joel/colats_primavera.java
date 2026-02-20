package joel;

import java.util.*;

public class colats_primavera {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int MAX = 200000;

        String[] staff = new String[MAX];
        String[] vip = new String[MAX];
        String[] regular = new String[MAX];

        int sF = 0, sB = 0;
        int vF = 0, vB = 0;
        int rF = 0, rB = 0;

        while (sc.hasNextLine()) {

            String line = sc.nextLine();

            if (line.equals("EXIT")) {

                boolean empty = true;
                StringBuilder sb = new StringBuilder();

                for (int i = sF; i < sB; i++) {
                    sb.append(staff[i]).append(" ");
                    empty = false;
                }
                for (int i = vF; i < vB; i++) {
                    sb.append(vip[i]).append(" ");
                    empty = false;
                }
                for (int i = rF; i < rB; i++) {
                    sb.append(regular[i]).append(" ");
                    empty = false;
                }

                if (empty) System.out.println("EMPTY");
                else System.out.println(sb.toString().trim());

                break;
            }


            if (line.equals("NEXT")) {

                if (sF < sB) {
                    System.out.println(staff[sF++]);
                } else if (vF < vB) {
                    System.out.println(vip[vF++]);
                } else if (rF < rB) {
                    System.out.println(regular[rF++]);
                }

                continue;
            }

            String[] p = line.split(" ");
            String nom = p[1];
            String tipus = p[2];

            if (tipus.equals("STAFF")) {
                staff[sB++] = nom;
            } else if (tipus.equals("VIP")) {
                vip[vB++] = nom;
            } else {
                regular[rB++] = nom;
            }
        }
    }
}
