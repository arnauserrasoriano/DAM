package exercicis_classe;
import java.util.Scanner;

public class Problema12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "";
        String entrada;
        int indexInt = 0;
        String invertit = "";
        String trobat="";
        do {
            entrada = sc.nextLine();

            text += entrada + '\n';

        } while (!entrada.endsWith("."));



        do {
            int index = text.indexOf(" ", indexInt);

            if (index == -1) {
                trobat += text.substring(indexInt);
                break;
            }else{
                trobat += text.substring(indexInt, index) + "";


                indexInt = index + 1;

            }


        } while (true);

        for(int i=trobat.length()-1;i>0;i--){
            invertit += trobat.charAt(i);
        }

        System.out.println(invertit);

        }
    }






