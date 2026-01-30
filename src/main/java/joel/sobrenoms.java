package joel;

import java.util.Arrays;
import java.util.Scanner;

public class sobrenoms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] noms = sc.nextLine().split(",");
        String[] sobrenoms = sc.nextLine().split(",");
        boolean valid=false;
        int coin=0;
        for (int i = 0; i < sobrenoms.length; i++) {
            int compt = 0;

            String sobrenom = sobrenoms[i].trim();
            if (sobrenom.length() < 2) continue;

            for (int j = 0; j < noms.length; j++) {
                String nom = noms[j].trim();

                if (nom.startsWith(sobrenom)) {
                    compt++;

                }

            }
            if(compt==1){
                coin++;
            }

        }
        System.out.println(coin);

    }
}

