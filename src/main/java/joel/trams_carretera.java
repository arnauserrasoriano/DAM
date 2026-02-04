package joel;

import java.util.HashMap;
import java.util.Scanner;

public class trams_carretera {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int metros=sc.nextInt();
        int velocitat=sc.nextInt();

        int numCotxes=sc.nextInt();
        HashMap<String, Integer> mapa = new HashMap<>();

        while (numCotxes-->0){
            String matricula=sc.next();
            int t=sc.nextInt();
            mapa.put(matricula,t);
        }

        int numCotxes2=sc.nextInt();
        while (numCotxes2-->0){
            String matricula2=sc.next();
            int t2=sc.nextInt();
            if(mapa.containsKey(matricula2)){
                int entrada = mapa.get(matricula2);
                int temps=t2-entrada;
                double calc = (metros*3.6)/temps;
                int v = (int) Math.round(calc);
                if(v>velocitat){
                    System.out.println(matricula2+" "+v);
                }
            }
        }
    }
}
