package joel;

import java.util.Scanner;

public class cantina {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numCasos=Integer.parseInt(sc.nextLine());
        int est = 0;
        int pro=0;
        int vis=0;

        while(numCasos-->0){
            String entrada = sc.nextLine();
            String[] sepa = entrada.split(" ");
            int resultat = Integer.parseInt(sepa[2]);

            if(sepa[0].equals("EST")){
                if(sepa[1].equals("IN")){
                    est+=resultat;

                }else {
                    est-=resultat;
                }
            }
            else if(sepa[0].equals("PRO")){
                if(sepa[1].equals("IN")){
                        pro+=resultat;

                }else {
                    pro-=resultat;
                }


            } else if (sepa[0].equals("VIS")) {
                if(sepa[1].equals("IN")){
                    vis+=resultat;

                }else {
                    vis-=resultat;
                }

            }
        }
        int maxEst = pro * 5;
        int maxVis = pro * 1;
        int extraEst = Math.max(0, est - maxEst);
        int extraVis = Math.max(0, vis - maxVis);
        int total = extraEst + extraVis;

        if(total>0){
            System.out.println("ALARMA" + total);
        }else{
            System.out.println("OK");
        }
    }
    }

