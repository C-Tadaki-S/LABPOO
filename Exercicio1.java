import java.util.Scanner;

class Exercicio1 {
    /**
     * 
     * @param numLin
     * @param numCol
     * @param scanner
     * @return
     */

     

    static double[][] leMatriz(int numLin, int numCol, Scanner scanner){
        double[][] matriz = new double[numLin][numCol];
        for (int i = 0; i < numLin; i++){
            for (int j=0; j < numCol; j++){
                matriz[i][j] = scanner.nextDouble();
            }
        }
        return matriz;
    }
    static void exibeMatriz(double[][] matriz){
        int numLin = matriz.length;
        int numCol = matriz[0].length;
        //exibe valores da matriz A
        for(int i = 0; i < numLin; i++){
            for(int j = 0; j < numCol; j++){
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");

    }
    static double [][] multiplicaMatriz(double [][]MatrizA, double [][]MatrizB, int numLinA, int numColA, int numLinB, int numColB){
        double [][]MatrizM = new double[numLinA][numColB];
        if(numLinA != numColB){
            System.out.println("Não é possível fazer essa multiplicação");
            return null;
        }
        else{
            for (int i = 0; i < numLinA; i++) {
                for (int j = 0; j < numLinB; j++) {
                    for (int k = 0; k < numColA; k++) {
                        MatrizM[i][j] += MatrizA[i][k] * MatrizB[k][j];
                    }
                }
            }
        }
        return MatrizM;
    }

    public static void main(String[] args) {
        
        if(args.length != 4){
            System.out.println("Use: programa num_linhasA num_colunas_matrizA num_linha_matriz2 num_coluna_matriz2");
            return;
        }
        Scanner scanner = new Scanner(System.in);

        int numLinA = Integer.parseInt(args[0]);
        int numColA = Integer.parseInt(args[1]);
        int numLinB = Integer.parseInt(args[2]);
        int numColB = Integer.parseInt(args[3]);

        double[][] matrizA = leMatriz(numLinA, numColA, scanner);
        double[][] matrizB = leMatriz(numLinB, numColB, scanner);

        exibeMatriz(matrizA);
        exibeMatriz(matrizB);
        
        double[][] matrizC = multiplicaMatriz(matrizA, matrizB,numLinA,numColA,numLinB,numColB);

        exibeMatriz(matrizC);
        scanner.close();
    }   
}
