package exercicis_classe.format;
import java.util.Scanner;

public class format3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix la nota (0-10): ");
        double nota = sc.nextDouble();

        String qualificacio;

        if (nota < 5) {
            qualificacio = "Suspès";
        } else if (nota < 7) {
            qualificacio = "Aprovat";
        } else if (nota < 9) {
            qualificacio = "Notable";
        } else {
            qualificacio = "Excel·lent";
        }

        System.out.println(
                String.format("Nota: %.1f -> Qualificació: %s", nota, qualificacio)
        );
    }
}
