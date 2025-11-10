package exercicis_classe;
import java.util.Scanner;

public class Problema11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "";
        String entrada;
        String invertit = "";

        do{
            entrada = sc.nextLine();

            text += entrada + '\n';

        }while (!entrada.endsWith("."));

        for(int i=0;i<text.length();i++){
            char index = text.charAt(i);
            if (index != ' '){
                invertit += index;
            }
        }
        System.out.println(invertit);


    }
}
