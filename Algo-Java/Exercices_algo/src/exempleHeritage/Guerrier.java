package exempleHeritage;

public class Guerrier extends Personnage {

	private String arme;

	public Guerrier(String _nom, int _pointDeVie, String _arme)
	{
		super(_nom, _pointDeVie);
		this.arme = _arme;
	}

	public boolean seBattre()
	{
		if(this.pointDeVie > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
