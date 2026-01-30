package joel;

import java.util.Scanner;

public class cubs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCasos=Integer.parseInt(sc.nextLine());
        while (numCasos-->0){
            int n = Integer.parseInt(sc.nextLine());
            int suma = 0;
            int N=0;
            for (int i = 0;; i++) {
                int calcul = i*i;
                if (suma+calcul>n){
                    break;
                }
                suma += calcul;
                N=i;
            }
            System.out.println(N);
            }
        }
    }

