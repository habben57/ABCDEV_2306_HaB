package ObjetVoiture;

public class App {

	public static void main(String[] args) 

//		{
//			Voiture maVoiture = new Voiture();
//			maVoiture.setMarque(" Renault Laguna");
//			maVoiture.setPrix(  24000.0);
//			maVoiture.Afficher();
//		}
	{
		Voiture maVoiture1 = new Voiture();
		Voiture maVoiture2 = new Voiture();
		maVoiture1.setMarque(" Renault Laguna");
		maVoiture1.setPrix(  24000.0);
		maVoiture1.Afficher();
		maVoiture2.setPrix(  21000.0);
		maVoiture2.setMarque( " Peugeot 205 ");
		maVoiture2.Afficher();
	}

}
