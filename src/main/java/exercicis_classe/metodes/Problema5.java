import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Metodes{

    //Poseu els mètodes demanats dins el cos de la classe
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*...........................................*/

        int entrada_suma1 = sc.nextInt();
        int entrada_suma2 = sc.nextInt();
        System.out.println(sumaPositius(entrada_suma1,entrada_suma2));


        /*...........................................*/


        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int descompte = sc.nextInt();

        incrementaArray(arr, descompte);
        System.out.println(Arrays.toString(arr));
        /*...........................................*/


        System.out.println("Posa la concatenacio: ");
        sc.nextLine();

        String entrada1 = sc.nextLine();
        String entrada2  = sc.nextLine();
        char entrada = entrada1.charAt(0);
        char entrada22 = entrada2.charAt(0);

        char[] a = {entrada};
        char[] b = {entrada22};

        System.out.println(concatena(a,b));
        /*...........................................*/
        Producte preu = new Producte("Portatil",1000);

        double descompte2 = sc.nextInt();
        aplicaDescompte(preu,descompte2);
        System.out.println("Preu final: " + preu.getPreu());
        /*...........................................*/
        int na=sc.nextInt();
        int[] array2 = new int[na];

        System.out.println(Arrays.toString(copiaSenseNegatius(array2)));

    }


    public static int sumaPositius(int a, int b){

        if(a>0 && b>0){
            return a + b;
        }
        return 0;
    }

    public static void incrementaArray(int[] arr, int valor) {
        if(arr==null) return;
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=valor;
        }
    }

    public static char[] concatena(char[] a, char[] b){
        if(a==null || b==null) return null;
        char[] resultat = new char[a.length+b.length];
        System.arraycopy(a, 0, resultat, 0, a.length);
        System.arraycopy(b, 0, resultat, a.length, b.length);

        return resultat;

    }

    public static int[] copiaSenseNegatius(int[] arr) {
        if(arr==null) return null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static void aplicaDescompte(Producte p, double percent){
        if(p==null) return;
        double descompte = p.getPreu() * (percent/100);
        double preu = p.getPreu() - descompte;
        p.setPreu(preu);
    }

}

class Producte {
    private String nom;
    private double preu;

    public Producte(String nom, double preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }
}
