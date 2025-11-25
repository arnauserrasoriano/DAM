package exercicis_classe.modul;

import java.util.Random;
import java.util.Scanner;

public class Problema1 {
    public static char retornaCaracter(){
        return (char)(new Random().nextInt('}'-' ' +1)+' ');
    }

    public static char retornaCaracter(char lletra1, char lletra2){
        if(lletra1>lletra2) {
            char temp;
            temp = lletra1;
            lletra1 = lletra2;
            lletra2 = temp;
        }
            return (char)(new Random().nextInt(lletra2 - lletra1+1)+lletra1);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int entrada=Integer.parseInt(sc.nextLine());
        for(int x=0;x<entrada;x++){
            System.out.print(retornaCaracter('x','a'));

        }
    }
}
