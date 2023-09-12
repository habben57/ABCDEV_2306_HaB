package objetArticle;

public class App {

	public static void main(String[] args) {

		Article Article001 = new Article("chemise",001, "manche courte",25.5,0.0);
		Article Article002 = new Article("pull",002, "manche courte",36.0,0.0);
		
		Article001.Affichage();
		Article002.Affichage();
	}

}
