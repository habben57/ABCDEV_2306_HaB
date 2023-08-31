package objetVille;

public class Ville {
	
	private String nomVille;
	private String nomPays;
	private int nbHabitants;
	
	// constructeur par default
	public Ville()
	{
		System.out.println(" Création d'une ville par defaut");
		nomVille ="inconnu";
		nomPays = "inconnu";
		nbHabitants = 0;
	}
	
//	constructeur avec parametres
//	j'ai ajouté un << p >> en 1 ere lettre des parametres
//	ce n'est pas une convention, mais ca peut etre un bon moyen de les reperer.
	public Ville(String pNom, int nbre, String pNomPays)
	{
		System.out.println(" Création d'une ville avec des parametres");
		nomVille = pNom;
		nomPays = pNomPays;
		nbHabitants = nbre;
	}

//-----------ACCESSEURS---------------

//Retourne le nom de la ville 
	public String getNom()
	{
		return nomVille;
	}
// Retourne le nom du Pays
	public String getNomPays()
	{
		return nomPays;
	}
//Retourne le nombre d'Habitant
	public int getNbHabitants()
	{
		return nbHabitants;
	}
	
//----------MUTATEURS----------------
	
//Défini le nom de la ville	
	public void setNom(String pNom)
	{
		nomVille = pNom;
	}
	
//Défini le nom du pays
	public void setNomPays(String pNomPays)
	{
		nomPays = pNomPays;
	}
//Définit le nombre d'habitants
	public void setNbHabitants(int nbre)
	{
		nbHabitants = nbre;
	}
	
	
	
	
	
	
	
	
	
	
	
}
