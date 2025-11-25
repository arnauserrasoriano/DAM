package joel;

import java.util.Scanner;

public class EduardoChillida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vora1 = sc.nextInt();
        int vora2 = sc.nextInt();
        int vora3 = sc.nextInt();


        int calcul = (360) - vora1 - vora2 - vora3;
        if ((vora1 >= 88 && vora1 <= 93 && vora1 != 90) &&
                (vora2 >= 88 && vora2 <= 93 && vora2 != 90) &&
                (vora3 >= 88 && vora3 <= 93 && vora3 != 90) &&
                (calcul >= 88 && calcul <= 93 && calcul != 90))
        {

            System.out.println("SI");
        }

        else {
            System.out.println("NO");
        }
    }
}

