package objetBouteille;


	public class Bouteille {
		
		// attributs
		private final double capaciteEnL;
		private double contenanceEnL;
		private boolean estOuverte;
		private String nom;
		private boolean viderTout;
		private boolean completer;
		
		// constructeur par defaut	
		public Bouteille()
		{
			nom = "";
			contenanceEnL = 0.9;
			capaciteEnL = 1;
			estOuverte = true;
			viderTout = true;
			completer = true;
		}
		
		// constructeur avec parametre
		public Bouteille(String _nom, double _contenanceEnL, double _capaciteEnL, boolean  _estOuverte,boolean _completer)
		{
		this.nom = _nom;
		this.contenanceEnL = _contenanceEnL;
		this.capaciteEnL = _capaciteEnL;
		this.estOuverte = _estOuverte;
		this.completer = _completer;	
		}
	
		public boolean fermer()
		{
			if(!this.estOuverte)
				{
				estOuverte = false;
				return true;				
				}
			else
				{
				return false;
				}
		}
		
		public boolean ouvrir()
		{
			if(this.estOuverte)
				{
				this.estOuverte = true;
				return true;
				}
				
			else
				{
				return false;
				}	
		}
		
		public boolean viderTout()
		{
			if(this.estOuverte)
				{
				if(this.contenanceEnL < capaciteEnL)
					{
					this.contenanceEnL = 0 ;
					return  true;
					}
				else
					{
					return 	false;
					}	
				}
			return false;
		}
		
		public boolean remplirTout()
		{
			if(this.estOuverte)
				{
				if(this.contenanceEnL < capaciteEnL)
					{
					this.contenanceEnL = 1.25;
					return true;
					}
				else
					{
					return false;
					}
				}
			return false;
		}
		public boolean completer()
		{
			if(this.estOuverte)
				{
				if(this.contenanceEnL < capaciteEnL)
					{
					this.contenanceEnL = 1.45;
					return true;
					}
				else
					{
					return false;
					}
				}
			return false;
		}
}

