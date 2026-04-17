package joel;

import java.sql.SQLOutput;

public class piramide {
    public static void main(String[] args) {
        int o=5;
        for (int i = 0; i < o; i++) {
            for (int j = 0; j < o - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
