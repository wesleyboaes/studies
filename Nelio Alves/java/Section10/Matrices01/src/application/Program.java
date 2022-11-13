package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the matrix size: ");
        int n = sc.nextInt();

        /*Instanciando a matriz tamanho nxn*/
        int[][] mat = new int[n][n];

        /*Percorrendo as linhas e colunas da matriz*/
        for (int i = 0; i < mat.length; i++) {/*mat.length tamamnho das linhas (quantidade)*/
            for (int j = 0; j < mat[i].length; j++) {/*mat[i].length tamanho das colunas (quantidade)*/
                System.out.printf("Type the value in position [%d][%d]: ", i, j);
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Negative numbers: " + count);

        sc.close();
    }
}
