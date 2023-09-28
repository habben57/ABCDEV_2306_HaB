package objetArticle;

//import java.util.Scanner;



public class Article {
	
		//private static final String Article001 = null;
		public String nom;
		public double referencement;
		public String designation;
		public double prixHT;
		public double prixTTC;
		public static double tauxTVA ;
		
		
//-------------constructeur sans parametre---------
	public Article()
	{
		nom = "";
		referencement = 000;
		designation = "";
		prixHT = 0;
		prixTTC =0;
		tauxTVA = 0;
		
	}
		
//-------------constructeur avec parametre---------
	public Article (String _nom, double _referencement, String _designation, double _prixHT, double _prixTTC, double _tauxTVA)

	
		{
		this.nom = _nom;
		this.referencement = _referencement;
		this.designation = _designation;
		this.prixHT = _prixHT;
		this.prixTTC = _prixTTC;
		this.tauxTVA = _tauxTVA;
		}
//------------Setters---------------
		public void setNom(String nom)
		{
			this.nom = nom;
		}
		public void setReference(double reference)
		{
			this.referencement = reference;
		}
		public void setDesignation(String designation)
		{
			this.designation = designation;
		}
		public void setPrixHT(double prixHT)
		{
			this.prixHT = prixHT;
		}
		public void setPrixTTC(double prixHT)
		{
			this.prixTTC = (prixHT*tauxTVA)/100;
		}
		public static void setTauxTVA(double tauxTVA)
		{
			tauxTVA = tauxTVA;
		}
		
//-----------Getters-------------------
		public String getNom()
		{
			return nom;
		}
		public double getreferencement()
		{
			return referencement;
		}
		public String getdesignation()
		{
			return designation;
		}
		public double getPrixHT()
		{
			return prixHT;
		}
		public double getPrixTTC()
		{
			return prixTTC;
		}
		private double getTauxTVA()
		{
			return tauxTVA;
		}
		
//----------Affichage----------------
		public  String Affichage()
		{
		
		
//			
//			System.out.println("votre taux de tva : "+this.tauxTVA);
//			this.tauxTVA= sc.nextDouble();
//			System.out.println(" Le prix hors taxe du(de la) "+nom+" : "+this.prixHT); 
//			
//			//System.out.println(" Le prix TTC du(de la)"+" : "+this.nom+" est de "+((this.prixHT)+(this.prixHT*this.tauxTVA/100)));
//
//			System.out.println(" Le prix TTC du(de la)"+" : "+this.nom+" est de "+(prixHT+(this.prixHT*this.tauxTVA/100)));

			return "Reference : "+this.getreferencement()
								+"\nDesignation : "+nom+" "+this.getdesignation()
								+"\nPrix HT : "+this.getPrixHT()
								+"\nTaux TVA : "+this.getTauxTVA()
								+"\nPrix TTC : "+this.getPrixTTC();
			
			
		}

		
		
		
}
