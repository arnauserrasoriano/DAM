package joel;

import java.util.Arrays;
import java.util.Scanner;

public class joc_cadires {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos = Integer.parseInt(sc.nextLine());
        while (numCasos-- > 0) {
            int numPersones = Integer.parseInt(sc.nextLine());
            String[] original = sc.nextLine().trim().split("\\s+");

            String[] temp = original.clone();

            int numCasosLlevar = Integer.parseInt(sc.nextLine());

            while (numCasosLlevar-- > 0) {
                String[] entrada = sc.nextLine().split(" ");
                String nom = entrada[1];
                if (entrada[0].equals("OUT")) {
                    int pos = -1;
                    for (int i = 0; i < temp.length; i++) {
                        if ((temp[i] != null && temp[i].equals(nom))) {
                            pos = i;
                            break;
                        }
                    }
                    int x = 0;
                    if (pos != -1) {
                        String[] nou = new String[temp.length - 1];
                        for (int j = 0; j < temp.length; j++) {
                            if (j != pos) {

                                nou[x++] = temp[j];
                            }
                        }
                        temp = nou;

                    }


                } else if (entrada[0].equals("IN")) {
                    int posOrig = -1;
                    boolean esta = false;
                    for (String s : temp) {
                        if (s.equals(nom)) {
                            esta = true;
                            break;
                        }
                    }
                    if (esta) continue;

                    for (int i = 0; i < temp.length; i++) {
                        if (original[i].equals(nom)) {
                            posOrig = i;
                            break;
                        }
                    }
                    int posInsert = temp.length;

                    for (int i = 0; i < temp.length; i++) {
                        int posTempOrig = -1;

                        for (int j = 0; j < original.length; j++) {
                            if (original[j].equals(temp[i])) {
                                posTempOrig = j;
                                break;
                            }
                        }
                        if (posTempOrig > posOrig) {
                            posInsert = i;
                            break;
                        }
                    }

                    String[] nou = new String[temp.length + 1];
                    int x = 0;
                    for (int i = 0; i < nou.length; i++) {
                        if (i == posInsert) {
                            nou[i] = nom;
                        } else {
                            nou[i] = temp[x++];
                        }
                    }

                    temp = nou;
                }
            }
            System.out.println(Arrays.toString(temp));

        }
    }
}





