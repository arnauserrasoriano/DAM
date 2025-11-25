package exercicis_classe.Matrius;

public class matriu_problema2 {
    public static void main(String[] args) {
        int[][] num=new int[5][5];
        int suma = 1;
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                if(i == j){
                    num[i][j] = suma;


                }else if(i+j ==num.length -1){
                    num[i][j] = suma;

                }
                System.out.print(num[i][j] + "\t");

            }
            System.out.println();

        }
    }
}
