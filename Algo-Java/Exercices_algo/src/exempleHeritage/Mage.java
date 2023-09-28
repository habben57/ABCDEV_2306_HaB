package exempleHeritage;

public class Mage extends Personnage {

	private int mana;

	public Mage(String _nom, int _pointDeVie, int _mana)
	{
		super(_nom, _pointDeVie);
		this.mana = _mana;
	}

	public String lancerUnSort()
	{
		String unSort;
		if(this.mana > 0)
		{
			unSort = "Le mage a lancer un sort";
		}
		else
		{
			unSort = "Le mage est à cours de mana desolé";
		}

		return unSort;
	}

}
