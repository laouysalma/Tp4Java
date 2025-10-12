package ex1pack;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double somme = 0.0;
		System.out.println("donner le nomble d'elements");
		int n = sc.nextInt();
		for (int i = 1; i < n; i++) {

			somme = somme + (1.0 /i);

		}
		System.out.println("le resultat final de la somme est : " + somme);
	}
}
