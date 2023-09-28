package exempleHeritage;

public class Personnage {
	
	
		protected String nom;
		protected int pointDeVie;

		public Personnage(String _nom, int _pointDeVie)
		{
			this.nom = _nom;
			this.pointDeVie = _pointDeVie;
		}

		public boolean seDeplace()
		{
			return true;
		}

		public void seBlesser()
		{
			this.pointDeVie -= 1;
		}
	
}
