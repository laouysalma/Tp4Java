import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau (n) : ");
        int n = sc.nextInt();

        System.out.print("Entrez la taille de la fenêtre (k) : ");
        int k = sc.nextInt();

        int[] T = new int[n];
        int maxVal = 0;

        System.out.println("Entrez les " + n + " entiers du tableau :");
        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
            if (T[i] > maxVal) maxVal = T[i];
        }

        int[] freq = new int[maxVal + 1];
        int distinct = 0;

        for (int i = 0; i < k; i++) {
            if (freq[T[i]] == 0) distinct++;
            freq[T[i]]++;
        }

        System.out.print("Résultat : " + distinct);

        for (int i = k; i < n; i++) {
            int out = T[i - k];
            freq[out]--;
            if (freq[out] == 0) distinct--;

            int in = T[i];
            if (freq[in] == 0) distinct++;
            freq[in]++;

            System.out.print(" " + distinct);
        }

        System.out.println();
        sc.close();
    }
}
