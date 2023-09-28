package objetVille;

public class Ville { 
	
//	private String nomVille;
//	private String nomPays;
//	private int nbHabitants;
//	
//	// constructeur par default
//	public Ville()
//	{
//		System.out.println(" Création d'une ville par defaut");
//		nomVille ="inconnu";
//		nomPays = "inconnu";
//		nbHabitants = 0;
//	}
//	
////	constructeur avec parametres
////	j'ai ajouté un << p >> en 1 ere lettre des parametres
////	ce n'est pas une convention, mais ca peut etre un bon moyen de les reperer.
//	public Ville(String pNom, int nbre, String pNomPays)
//	{
//		System.out.println(" Création d'une ville avec des parametres");
//		nomVille = pNom;
//		nomPays = pNomPays;
//		nbHabitants = nbre;
//	}
//
////-----------ACCESSEURS---------------
//
////Retourne le nom de la ville 
//	public String getNom()
//	{
//		return nomVille;
//	}
//// Retourne le nom du Pays
//	public String getNomPays()
//	{
//		return nomPays;
//	}
////Retourne le nombre d'Habitant
//	public int getNbHabitants()
//	{
//		return nbHabitants;
//	}
//	
////----------MUTATEURS----------------
//	
////Défini le nom de la ville	
//	public void setNom(String pNom)
//	{
//		nomVille = pNom;
//	}
//	
////Défini le nom du pays
//	public void setNomPays(String pNomPays)
//	{
//		nomPays = pNomPays;
//	}
////Définit le nombre d'habitants
//	public void setNbHabitants(int nbre)
//	{
//		nbHabitants = nbre;
//	}
//	
	
	protected String nomVille;
	protected int nbHabitants;
	protected String nomPays;
	protected char categories;
	// variable publique qui compte les instances
	public static int nbInstances = 0;
	// variable privee qui compte les instances
	protected static int nbInstancesBis = 0;

	// Constructeur par defaut
	public Ville()
	{
		System.out.println("Creation d'un objet ville avec le constructeur par defaut");
		nomVille = "inconnu";
		nomPays = "inconnu";
		nbHabitants = 0;
		this.setCategorie();
		nbInstances++;
		nbInstancesBis++;
	}
	// Constructeur avec parametre
	public Ville(String pNomVille, int pNbre, String pNomPays)
	{
		System.out.println("Creation d'un objet ville avec le constructeur avec paramétre");
		nomVille = pNomVille;
		nomPays = pNomPays;
		nbHabitants = pNbre;
		this.setCategorie();
		nbInstances++;
		nbInstancesBis++;
	}

	/**********************
	 **** Getters *********
	 **********************/

	// retourne le nom de la ville
	public String getNomVille()
	{
		return this.nomVille;
	}
	// retourne le nom du pays
	public String getNomPays()
	{
		return nomPays;
	}
	// retourne le nombre d'habitant
	public int getNbHabitants()
	{
		return nbHabitants;
	}

	public char getCategorie()
	{
		return this.categories;
	}

	public static int getNbInstances()
	{
		return nbInstancesBis;
	}

	/**********************
	 *****Setters********** 
	 **********************/
	public void setNomVille(String pNomVille)
	{
		nomVille = pNomVille;
	}

	public void setNomPays(String pNomPays)
	{
		nomPays = pNomPays;
	}

	public void setNbHabitants(int pNbHabitants)
	{
		nbHabitants = pNbHabitants;
		this.setCategorie();
	}

	private void setCategorie()
	{
		int bornesSuperieurs[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		char categories [] = {'?','A','B','C','D','E','F','G','H'};

		int i = 0;

		while(i < bornesSuperieurs.length && this.nbHabitants > bornesSuperieurs[i])
		{
			i++;
		}
		this.categories = categories[i];
	}

	public String decrisToi()
	{
		return "\n ville = "+this.getNomVille()+" ville de "+this.getNbHabitants()
		+" habitants se situant en "+this.getNomPays()
		+" et est de categorie : "+this.getCategorie();
	}

	public String comparerVille(Ville uneVille)
	{
		String str;

		if(uneVille.getNbHabitants() > this.nbHabitants)
		{
			str = uneVille.getNomVille()+" est plus peuplee que "+this.nomVille;
		}
		else
		{
			str = this.nomVille+" est plus peuplee que "+uneVille.getNomVille();
		}
		return str;
	}	
	
	
	
	
	
	
	
	
}
