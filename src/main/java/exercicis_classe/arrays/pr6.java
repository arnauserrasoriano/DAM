package exercicis_classe.arrays;

import java.util.Scanner;

public class pr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos = Integer.parseInt(sc.nextLine());

        String[] vec = new String[numCasos];
        boolean[][] vec2 = new boolean[numCasos][numCasos];
        String entrada;

        for (int i = 0; i < vec.length; i++) {
            entrada = sc.nextLine();
            vec[i] = entrada;
        }
        for (int x = 0; x < vec.length; x++) {
            for (int z = 0; z < vec.length; z++) {

                if (vec[x].contains(vec[z])) {
                    vec2[x][z] = true;
                } else {
                    vec2[x][z] = false;
                }
                System.out.println(vec2[x][z]);

            }

            }


        }
    }

