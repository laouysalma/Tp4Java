package ex5pack;
import java.util.Scanner;

public class Ex5{

    public static void printMatrix(int[][] A) {
        int N = A.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotation(int[][] A) {
        int N = A.length;

 
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

     
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][N - 1 - j];
                A[i][N - 1 - j] = temp;
            }
        }
    }


}
