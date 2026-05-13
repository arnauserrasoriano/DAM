package exercicis_classe.metodes;

import java.util.Arrays;

public class Problema4 {
    public static void main(String[] args) {
        char[] a = {'a'};
        char[] b = {'b'};

        System.out.println(concatena(a,b));
    }

    public static char[] concatena(char[] a, char[] b){
        char[] resultat = new char[a.length+b.length];
        System.arraycopy(a, 0, resultat, 0, a.length);
        System.arraycopy(b, 0, resultat, a.length, b.length);

        return resultat;

    }
}

/*
package exercicis_classe.metodes;

import java.io.IO;
import java.util.Arrays;

public class Problema4 {

    public static void main(String[] args) {

        char[] a = {'a'};
        char[] b = {'b'};

        IO.println(Arrays.toString(
                concatena(a, b)
        ));
    }

    public static char[] concatena(char[] a, char[] b) {

        char[] resultat = new char[a.length + b.length];

        System.arraycopy(a, 0, resultat, 0, a.length);

        System.arraycopy(b, 0, resultat, a.length, b.length);

        return resultat;
    }
}
 */
