package ObjetRectangle;

public class Rectangle {
	
		double Longueur;
		double largeur;
		double perimetre;
		double surface;
	
		//-----------constructeur avec parametre-----------
	public Rectangle (double Longueur, double largeur, double perimetre, double surface)
	
		{	
		this.Longueur = Longueur;
		this.largeur = largeur;
		this.perimetre = perimetre;
		this.surface = surface;
		}
	
	//-------------Setters-----------------
		public void setLongueur(double Longueur)
			{
				this.Longueur = Longueur;
			}
		public void setlargeur(double largeur)
			{
				this.largeur = largeur;
			}
		public void setperimetre(double perimetre)
			{
				this.perimetre = perimetre;
			}
		public void setsurface(double largeur)
			{
				this.largeur = largeur;
			}
	
	// -------------Guetters-----------------
		public double getLongueur()
			{
				return Longueur;
			}
		public double getlargeur()
			{
				return largeur;
			}
		public double getperimetre()
			{
				return perimetre;
			}
		public double getsurface()
			{
				return surface;
			}	
	//------methode affichages--------------------
		public void Affichage()
		{
				System.out.println(" Le perimetre du rectangle est de : "+2*(this.Longueur+this.largeur));
				System.out.println(" La surface du rectangle est de :"+this.Longueur*this.largeur);
		}
		
	
}
