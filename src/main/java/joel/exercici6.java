/*
package joel;

import java.util.Scanner;
public class exercici6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de casos: ");
        int numCasos = sc.nextInt();

        while(numCasos>0){
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Cas: ");
            String cas = sc2.nextLine();

            Scanner sc3 = new Scanner(System.in);
            System.out.println("Frase: ");
            String frase = sc3.nextLine();
            numCasos--;

            switch (cas) {
                case "P":
                    String resultat = frase.toUpperCase();
                    System.out.println(resultat);
                    break;
                case "K":
                    int comptA = 0;
                    int index = 0;

                    do {
                        String resultatK = frase.toLowerCase();

                        int trobat = frase.indexOf(" ", index);
                        if (trobat == -1) {
                            if (comptA == 0) {
                                resultatK = frase.substring(index, frase.length());
                            } else {
                                resultatK = resultatK + "-" + frase.substring(index, frase.length());
                                comptA++;
                            }
                        }

                        String paraula=frase.substring(index,trobat);

                        if (!paraula.isBlank()){
                            if (comptA == 0){
                                resultatK = paraula;
                            }else {
                                resultatK= resultatK+ "-"+paraula;
                                comptA++;
                            }
                        }
                        indexIni = trobat + 1;
                        index = trobat + 1;
                        break;
                    } while (true);


                case "S":
                    break;
                case "C":
                    break;
            }
            numCasos--;
        }

    }

}
*/