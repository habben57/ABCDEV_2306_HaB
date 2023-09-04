package objetPorteGarage;

public class PorteLeroyMerlin {

		// attributs
	private final String marque;
	private boolean estOuverte; 
	private boolean estVerouiller;
	private int degresOuverture;
	private int degresMax;
	private final int degresMin;
	private int degresFermeture;
		// constructeur
		
		
		
	
		public PorteLeroyMerlin(String _marque, boolean _estOuverte, int _degresFermeture, boolean _estVerouiller, int _degresOuverture, int _degresMax, int _degresMin)
		{
			this.marque = _marque;
			this.estOuverte = _estOuverte;
			this.estVerouiller = _estVerouiller;
			this.degresOuverture = _degresOuverture;
			this.degresMax = _degresMax;
			this.degresMin = _degresMin;
			this.degresFermeture = _degresFermeture;
		}
//		public PorteBricoDepot(String _marque, boolean _estOuverte, int _degresFermeture, boolean _estVerouiller, int _degresOuverture, int _degresMax, int _degresMin)
//		{
//			this.marque = _marque;
//			this.estOuverte = _estOuverte;
//			this.estVerouiller = _estVerouiller;
//			this.degresOuverture = _degresOuverture;
//			this.degresMax = _degresMax;
//			this.degresMin = _degresMin;
//			this.degresFermeture = _degresFermeture;
//		}
		
		
		
		public boolean ouvrir()
		{
			if(this.estOuverte && !this.estVerouiller)
				{
				System.out.println("porte ouverte de "+ degresOuverture);

				estOuverte = true;
				return true;				
				}
			else
				{				
				System.out.println("porte fermer");
				return false;
				}
		}
		
		public boolean fermer()
		{
			if(this.estOuverte && !this.estVerouiller )
				{
				System.out.println("porte fermer");

				estOuverte = false;
				return true;
				}
			else
				{
				return false;
				}
		}	
		
		public boolean verouiller()
		{
			if(!this.estOuverte && !this.estVerouiller)
				{
				System.out.println("porte verouiller");

				estVerouiller = true;
				return true;				
				}
			else
				{
				return false;
				}
		}
		
		public boolean deverouiller()
		{
			if(this.estVerouiller)
				{
				System.out.println("porte déverouiller");

				estVerouiller = false;
				return true;				
				}
			else
				{
				return false;
				}
		}
	
		public boolean degresOuverture(int degresOuvrable)
		{ 
			int poucentageOuverture = 0;
			if(!this.estVerouiller && this.degresOuverture+degresOuvrable <= this.degresMax 
					&& degresOuvrable > this.degresMin)
			{
				System.out.println("porte ouverte de : "+degresOuvrable +"°");
 
				degresOuverture = this.degresOuverture + degresOuvrable ;
				return true;
			}
			return estOuverte;
		}
		
		public boolean degresFermeture(int degresFermable)
		
	//	degresFermable = degresOuverture - degresFermable;
		{	
			int poucentageFermeture = 0;
			if(!this.estVerouiller && this.degresFermeture + degresFermable >= this.degresMin
					&& degresFermable < this.degresMax)
			{
				if( degresOuverture< degresFermeture)
					
					degresFermeture = this.degresFermeture + degresFermable;

				System.out.println("porte refermer de : "+ degresFermable+"°");
				
				return true;
			}
		return fermer();
		}
	
}
