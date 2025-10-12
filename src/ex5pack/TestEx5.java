package ex5pack;

import java.util.Scanner;

public class TestEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille N de la matrice : ");
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];

        System.out.println("Entrez les éléments de la matrice :");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }


        Ex5.rotation(matrix);
        Ex5.printMatrix(matrix);

        sc.close();
    }
}
