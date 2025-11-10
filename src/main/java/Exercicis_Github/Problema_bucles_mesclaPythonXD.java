package Exercicis_Github;

import java.util.Scanner;
import java.util.*;

public class Problema_bucles_mesclaPythonXD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numero = sc.nextLine();
        String[] parts = numero.split(" ");
        List<Integer> numerosPositius = new ArrayList<>();
        List<Integer> numerosNegatius = new ArrayList<>();

        for(String part : parts) {
            int num = Integer.parseInt(part);
            if(numero.endsWith("0")){
                if (num<0){
                    numerosNegatius.add(num);
                    numerosNegatius.remove("0");
                }else{
                    numerosPositius.add(num);
                    numerosPositius.remove(Integer.valueOf("0"));
                }
            }
            else{
                break;
            }
        }
        System.out.println("Numeros negatius: " + numerosNegatius);
        System.out.println("NUmeros postius: " + numerosPositius);
    }
}