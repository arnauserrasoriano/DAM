package joel;

import java.util.Scanner;

public class HolaUser {
    public static void main(String[] args) {
        String nomAlumne;
        Scanner ent=new Scanner(System.in);
        System.out.println("Posa el teu nom: ");
        nomAlumne = ent.nextLine();
        System.out.println("Hola, " + nomAlumne);
    }
}
