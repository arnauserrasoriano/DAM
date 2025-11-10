package joel;

import java.util.Scanner;

public class operador{
    public static void main(String[] args) {
        int num_caramels, num_nebots;
        Scanner ent=new Scanner(System.in);

        num_caramels=ent.nextInt();
        num_nebots=ent.nextInt();

        System.out.println(num_caramels%num_nebots);
    }
}

