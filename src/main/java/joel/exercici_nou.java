package joel;

import java.util.Scanner;

public class exercici_nou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int motxilla_final=0;
        int motxilla_perduda=0;
        int motxilla=0;
        do{
            int n = Integer.parseInt(sc.nextLine());

            String entrada = sc.nextLine();

            if(entrada.equals("X")){
                motxilla_perduda += motxilla;
                motxilla = n;


            } else if (entrada.equals("V")) {
                motxilla_final = n + motxilla;
                break;
            }
        }while (true);
        System.out.println(motxilla_final);
        System.out.println(motxilla_perduda);
    }

}
