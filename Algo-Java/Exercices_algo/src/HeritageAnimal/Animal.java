package HeritageAnimal;

import java.util.Scanner;

public abstract class Animal {
	
	protected String espece;
	protected String nom;
	protected String mange;
	protected String communication;
	protected String deplacement;
	protected String categorie;
	
	Scanner sc = new Scanner(System.in);
		//-----constructeur par defaut-------
	
	public Animal()
	{
		espece = "inconnu";
		nom = " inconnu";
		mange = "inconnu";
		communication = "inconnu";
		deplacement = "inconnu";
		categorie = "inconu";
	}
	
		//-----Constructeur avec parametre-------
	
	public Animal(String _espece, String _nom, String _mange, String _communication, String _deplacement, String _categorie)
	
	{
		this.espece = _espece;
		this.nom = _nom;
		this.mange = _mange;
		this.communication = _communication;
		this.deplacement = _deplacement;
		this.categorie = _categorie;
	}
	
	//---------Getter---------------------
	
	public abstract String getEspece();
	
	public abstract String getNom();
	
	public abstract String getMange();
	
	public abstract String getCommunication();
		
	public abstract String getDeplacement();
	
	public abstract String getAnimal();
	
	//----------setter---------------------------
	
	public void setEspece(String _espece)
	{
		this.espece = _espece;
	}
	public void setNom(String _nom)
	{
		this.nom = _nom;
	}
	public void setMange(String _mange)
	{
		this.mange = _mange;
	}
	public void setMoyenDeCommunication(String _Communication)
	{
		this.communication = _Communication;
	}
	public void setDeplacement(String _deplacement)
	{
		this.deplacement = _deplacement;
	}
	public void setAnimal(String _animal)
	{
		this.categorie = _animal;
	}
		
	
	//--------------Affichage----------------
	public abstract String getAffichage();
	public void Affichage()
	{
		
		System.out.println(getNom()+getEspece()+getAnimal()+getMange()+getDeplacement()+getCommunication());
	}
		

}
