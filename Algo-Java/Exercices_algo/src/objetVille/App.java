package objetVille;

public class App {

	public static void main(String[] args) {
//
//		Ville ville = new Ville();
//		Ville ville1 = new Ville("Marseille", 870321, "France");
//		Ville ville2 = new Ville("Mulhouse", 108038, "France");
//		
//		System.out.println(" ville = "+ville.setNomVille()+" ville de "+ville.getNbHabitants()+" habitant(s) se situant en "+ville.getNomPays());
//		System.out.println(" ville1 = "+ville1.setNomVille()+" ville de "+ville1.getNbHabitants()+" habitant(s) se situant en "+ville1.getNomPays());
//		System.out.println(" ville2 = "+ville2.setNomVille()+" ville de "+ville2.getNbHabitants()+" habitant(s) se situant en "+ville2.getNomPays());
//		System.out.println(" ");
//		/*
//		 Nous allons interchanger les villes 1 et 2
//		 par l' intermédiaire d'un autre objet ville
//		  */
//		Ville temp = new Ville();
//		temp = ville1;
//		ville1 = ville2;
//		ville2 = temp;
//		System.out.println("ville1 = "+ville1.setNomVille()+"ville de "+ville1.getNbHabitants()+" habitant(s)se situant en "+ville1.getNomPays());
//		System.out.println("ville2 = "+ville2.setNomVille()+"ville de "+ville2.getNbHabitants()+" habitant(s)se situant en "+ville2.getNomPays());
//		System.out.println(" ");
//		/*
//		 Nous allons maintenant interchanger leur noms par le biais de leurs mutateurs
//		 */
//		ville1.setNomVille("Hong kong");
//		ville2.setNomVille("New York");
//		System.out.println(" ville1 = "+ville1.setNomVille()+" ville de "+ville1.getNbHabitants()+" habitant(s) se situant en "+ ville1.getNomPays());
//		System.out.println(" ville2 = "+ville2.setNomVille()+" ville de "+ville2.getNbHabitants()+" habitant(s) se situant en "+ ville2.getNomPays());
//		

		Capitale capitale = new Capitale();
		System.out.println(capitale.decrisToi());
		Capitale capitale1 = new Capitale();
		System.out.println(capitale1.decrisToi());
		capitale1.setMonument("le sacré coeur");
		System.out.println(capitale1.getMonument());
		System.out.println(capitale1.decrisToi());

	}

	

}
 