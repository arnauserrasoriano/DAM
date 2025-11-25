package joel;

import java.util.Scanner;

public class taularodona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double perimetre1=sc.nextDouble();
        double mida = sc.nextDouble();
        int quantitat = sc.nextInt();

        double perimetre = Math.PI * perimetre1;
        double calcul = mida * quantitat;

        if (perimetre>=calcul){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }


        }
    }


