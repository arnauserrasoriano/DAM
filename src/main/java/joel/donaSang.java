package joel;
import java.util.Scanner;

public class donaSang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String receptor = sc.nextLine().trim();
        String sortida = sc.nextLine().trim();

        boolean compatible = false;

        String rc = sortida.substring(0, sortida.length() - 1);
        String rs = receptor.substring(0, receptor.length() - 1);
        char rc1 = sortida.charAt(sortida.length() - 1);
        char rs1 = receptor.charAt(receptor.length() - 1);

        if (rc.equals("O")) {
            compatible = rs.equals("O");
        } else if (rc.equals("A")) {
            compatible = rs.equals("A") || rs.equals("O");
        } else if (rc.equals("B")) {
            compatible = rs.equals("B") || rs.equals("O");
        } else if (rc.equals("AB")) {
            compatible = true;
        }

        if (rc1 == '-') {

                if (rs1 == '+') {
                    compatible = false;

                }
            }

            if (compatible) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

        }
    }


