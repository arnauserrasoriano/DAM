package joel;

import java.util.Scanner;

public class animesPerdudes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int almes_terra = 0;
        int almes_finals = 0;
        int perdues_almes=0;
        boolean guanyat = false;

        do{
            String line;
            do {
                line = sc.nextLine().trim();
            } while (line.equals(""));

            int n = Integer.parseInt(line);

            String entrada;
            do {
                entrada = sc.nextLine().trim();
            } while (entrada.equals(""));



            if(entrada.equals("D")){
                almes_finals=n;

                break;
            }
            else if(entrada.equals("M")){

                perdues_almes+=almes_terra;
                almes_terra = n;
            }
            else if(entrada.equals("G")){

                almes_finals = n + almes_terra;

                guanyat=true;
                break;
            }

        }while (true);

        System.out.println("P: "+perdues_almes);
        System.out.println("A: "+almes_finals);
        if(guanyat){
            if(almes_finals>perdues_almes){
                System.out.println("SI");

            } else if (almes_finals==perdues_almes) {
                System.out.println("IGUAL");

            } else {
                System.out.println("NO");
            }
        }else{
            System.out.println("D");
        }

    }
}
