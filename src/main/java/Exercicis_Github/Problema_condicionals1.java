package Exercicis_Github;import java.util.Scanner;

public class Problema_condicionals1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero%2==0){
            for (int n=0;n<numero; n++){
                while (n%2==0){
                    System.out.println(n);
                    break;
                }
            }
        }
        else {
            System.out.println("");
        }
    }
}