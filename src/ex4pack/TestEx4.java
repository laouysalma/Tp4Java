package ex4pack;

public class TestEx4 {
    public static void main(String[] args) {

        double[][] t1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        double[][] t2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };

        System.out.println("Tableau t1 :");
        Ex4.affiche(t1);

        System.out.println("\nTableau t2 :");
        Ex4.affiche(t2);

        System.out.println("\nLe tableau t1 est régulier ? " + Ex4.regulier(t1));
        System.out.println("Le tableau t2 est régulier ? " + Ex4.regulier(t2));

        double[] sLignes = Ex4.sommeLignes(t1);
        System.out.println("\nSomme des lignes de t1 :");
        for (double s : sLignes) {
            System.out.println(s);
        }

        double[][] sTables = Ex4.somme(t1, t2);
        System.out.println("\nSomme de t1 et t2 :");
        if (sTables != null) {
            Ex4.affiche(sTables);
        } else {
            System.out.println("Les tableaux ne sont pas réguliers ou de mêmes dimensions !");
        }
    }
}
