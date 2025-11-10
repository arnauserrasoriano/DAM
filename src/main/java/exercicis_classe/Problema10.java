package exercicis_classe;
import java.util.Scanner;

public class Problema10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "";
        String entrada;
        String invertit = "";

        do{
            entrada = sc.nextLine();

            text += entrada + '\n';

        }while (!entrada.endsWith("."));


        for(int i=text.length() -1 ;i>0;i--){
            invertit += text.charAt(i);
        }
        System.out.println(invertit);
    }
}
