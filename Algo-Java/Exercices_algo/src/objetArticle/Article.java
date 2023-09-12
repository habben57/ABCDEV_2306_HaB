package objetArticle;

public class Article {
	
		String nom;
		double referencement;
		String designation;
		double prixHT;
		double prixTTC;
		double tva = 18.6;
		String chemise;
		
//-------------constructeur avec parametre---------
	public Article()
	{
		nom = "";
		referencement = 001;
		designation = "";
		prixHT = prixHT;
		prixTTC =prixTTC;
		
	}
		
//-------------constructeur sans parametre---------
	public Article (String _nom, double _referencement, String _designation, double _prixHT, double _prixTTC)
	
		{
		this.nom = _nom;
		this.referencement = _referencement;
		this.designation = _designation;
		this.prixHT = _prixHT;
		this.prixTTC = _prixTTC;	
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
			this.prixTTC = (prixHT*tva)/100;
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
		
//----------Affichage----------------
		public  void Affichage()
		{
		
			 
			System.out.println(" Le prix HT de la chemise est de "+((this.prixHT*this.tva)/100+this.prixHT));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
