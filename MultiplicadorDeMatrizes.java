import java.util.Scanner;

public class MultiplicadorDeMatrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de linhas da primeira matriz: ");
        int linhasMatriz1 = sc.nextInt();

        System.out.println("Digite o número de colunas da primeira matriz: ");
        int colunasMatriz1 = sc.nextInt();

        int[][] matriz1 = new int[linhasMatriz1][colunasMatriz1];

        System.out.println("Digite os elementos da primeira matriz: ");

        for (int i = 0; i < linhasMatriz1; i++) {
            for (int j = 0; j < colunasMatriz1; j++) {
                matriz1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite o número de linhas da segunda matriz: ");
        int linhasMatriz2 = sc.nextInt();

        System.out.println("Digite o número de colunas da segunda matriz: ");
        int colunasMatriz2 = sc.nextInt();

        int[][] matriz2 = new int[linhasMatriz2][colunasMatriz2];

        System.out.println("Digite os elementos da segunda matriz: ");

        for (int i = 0; i < linhasMatriz2; i++) {
            for (int j = 0; j < colunasMatriz2; j++) {
                matriz2[i][j] = sc.nextInt();
            }
        }

        if (colunasMatriz1 != linhasMatriz2) {
            System.out.println("Não é possível realizar a multiplicação das matrizes.");
            return;
        }

        int[][] resultado = new int[linhasMatriz1][colunasMatriz2];

        for (int i = 0; i < linhasMatriz1; i++) {
            for (int j = 0; j < colunasMatriz2; j++) {
                for (int k = 0; k < colunasMatriz1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("O resultado da multiplicação das matrizes é:");

        for (int i = 0; i < linhasMatriz1; i++) {
            for (int j = 0; j < colunasMatriz2; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
