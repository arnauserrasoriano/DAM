package exercicis_classe.metodes;

public class Problema1 {

    public static int sumaPositius(int a, int b){
        if(a>0 && b>0){
            return a + b;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sumaPositius(2,4));
    }
}
