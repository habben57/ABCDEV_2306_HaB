package correctionJavaObjet;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Article article1 = new Article();
		Article article2 = new Article("12A45E","PS5",499.99,0.0);
		Article article3 = new Article("36B56D", "XBOX Serie X",399.99,0.0);

		double tauxTVA;

		System.out.println("Saisir le taux de TVA pour tous les articles :");
		tauxTVA = sc.nextDouble();

		Article.setTauxTVA(tauxTVA);

		System.out.println(article1.afficherArticle());
		System.out.println(article2.afficherArticle());
		System.out.println(article3.afficherArticle());

		sc.close();
	}

}
