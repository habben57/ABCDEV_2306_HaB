package objetArticle;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Article Article = new Article();
		Article Article001 = new Article("chemise",001, "manche courte",25.5,0,0);
		Article Article002 = new Article("pull",002, "manche longue ",36.0,0,0);
	
		
		double  tauxTVA;

		System.out.println("Saisir le taux de TVA pour tout les articles :");
		tauxTVA = sc.nextDouble();

		Article.setTauxTVA(tauxTVA);

		System.out.println(Article001.Affichage());
		System.out.println(Article002.Affichage());
		
	}

}
