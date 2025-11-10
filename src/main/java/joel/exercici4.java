package joel;

import java.util.Scanner;

public class exercici4 {
    public static void main(String[] args) {
            float numero;
            Scanner ent=new Scanner(System.in);
            numero = ent.nextFloat();
        float operacio = 1 / numero;
        System.out.println(operacio);
        ent.close();
    }
}
