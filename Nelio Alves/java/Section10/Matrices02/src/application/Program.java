package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the number of rows: ");
        int m = sc.nextInt();
        System.out.println("Type the number of columns: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("Type the number in position [%d][%d]: ", i, j);
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

        System.out.println("Type the number to know who is around it: ");
        int x = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.printf("Position %d,%d%n", i, j);
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (j < mat[i].length - 1) {/*4 - 1 = 3 (que é o valor de j na última coluna)*/
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (i < mat.length - 1) {/*3 - 1 = 2 (que é o valor de i na última linha)*/
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                    System.out.println();
                }
            }
        }

        sc.close();
    }
}
