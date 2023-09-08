package ObjetVoiture;


public class Voiture {
	
	// classe Voiture
		public String marque;		
		public double prix;			
	
	// constructeur sans parametre
		public Voiture()
	{
		
	}
		
	// Creation des setters
		public void setMarque(String marque )
		{
			this.marque = marque;
		}
		public void setPrix(double prix)
		{
			this.prix = prix;
		}
	// Creation des getters
		public String getMarque()
		{
			return marque;
		}
		public double getPrix()
		{
			return prix;
		}
	// Creation methode void afficher
		public void Afficher()
		{
		System.out.println("La marque de votre voiture est : "+this.marque);
		System.out.println(" Le prix est de : "+this.prix+ " Euros");
		}
		
}
