package objetPorteGarage;

public class PorteLeroyMerlin {

		// attributs
	private final String marque;
	private boolean estOuverte; 
	private boolean estVerouiller;
	private int degresOuverture;
	private int degresMax;
	private final int degresMin;
	
		// constructeur
		
		public PorteLeroyMerlin(String _marque, boolean _estOuverte, boolean _estVerouiller, int _degresOuverture, int _degresMax, int _degresMin)
		{
			this.marque = _marque;
			this.estOuverte = _estOuverte;
			this.estVerouiller = _estVerouiller;
			this.degresOuverture = _degresOuverture;
			this.degresMax = _degresMax;
			this.degresMin = _degresMin;			
		}
		
		
		public boolean ouvrir()
		{
			if(this.estOuverte && !this.estVerouiller)
				{
				estOuverte = true;
				return true;				
				}
			else
				{
				return false;
				}
		}
		
		public boolean fermer()
		{
			if(this.estOuverte && !this.estVerouiller )
				{
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
			if(!this.estVerouiller && this.degresOuverture+degresOuvrable <= this.degresMax 
					&& degresOuvrable > this.degresMin)
			{
				degresOuverture = this.degresOuverture + degresOuvrable ;
				return true;
			}
			return estOuverte;
		}
		
	
	
}
