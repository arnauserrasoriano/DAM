package joel;

import java.util.Arrays;
import java.util.Scanner;

public class comprimir_notes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos = Integer.parseInt(sc.nextLine());

        while (numCasos-- > 0) {

            String[] entrada1 = sc.nextLine().split(" ");
            int sum = 1;
            String[] temp = new String[entrada1.length * 2];
            int pos = 0;
            String[] entrada = Arrays.copyOfRange(entrada1, 1, entrada1.length);

            for (int i = 1; i < entrada.length; i++) {

                if (entrada[i].equals(entrada[i-1])) {
                    sum++;

                }else{
                    temp[pos++] = String.valueOf(sum);
                    temp[pos++] = entrada[i-1];

                    sum=1;

                }


            }
            temp[pos++] = String.valueOf(sum);
            temp[pos++] = entrada[entrada.length - 1];

            String[] comprimida = Arrays.copyOf(temp, pos);

            if (comprimida.length <= entrada.length) {
                System.out.println(Arrays.toString(comprimida));
            } else {
                System.out.println(Arrays.toString(entrada));
            }

        }

    }
}

