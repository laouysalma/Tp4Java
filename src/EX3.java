
import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("donner le nombre de valeurs");
		int n = sc.nextInt();
		int[] carre = new int[n];
		int nbrImpair = 1;
		for (int i = 0; i < n; i++) {

			carre[i] = nbrImpair * nbrImpair;
			System.out.println(carre[i] + "est lecarrre de " + nbrImpair);
			nbrImpair += 2;

		}
	}
}
