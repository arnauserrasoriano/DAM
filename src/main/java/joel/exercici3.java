package joel;

import java.util.Scanner;

public class exercici3 {
    public static void main(String[] args) {
        int numCaramels, numNebots;
        numCaramels = Integer.parseInt(IO.readln("Posa el nñumero de caramels:\n"));
        numNebots = Integer.parseInt(IO.readln("Posa el nñumero de nebots:\n"));

        IO.println(numCaramels%numNebots);
    }
}

