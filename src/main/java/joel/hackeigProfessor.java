package joel;

import java.util.Scanner;

public class hackeigProfessor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String entrada = sc.nextLine().trim();
        String res="";

        for (int i = entrada.length()-1; i >= 0; i--) {
            char c= entrada.charAt(i);

            switch (c){
                case '1': res+='a'; break;
                case '2': res+='e'; break;
                case '3': res+='i'; break;
                case '4': res+='o'; break;
                case '5': res+='u'; break;
                default: res+=Character.toLowerCase(c);
            }

        }
        System.out.println(res);

    }
}
