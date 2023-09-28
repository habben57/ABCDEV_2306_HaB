package correctionJavaObjet;



public class Article {
	// les attributs

	private String reference;
	private String designation;
	private double prixHT;
	private static double tauxTVA;      // static ( pour variable qui ne change pas)

	// le constructeur par defaut

	public Article()
	{
		this.reference = "inconnu";
		this.designation = "inconnu";
		this.prixHT = 0.0;
		this.tauxTVA=0.0;
	}

	// le constructeur avec parametre

	public Article(String _reference, String _designation, double _prixHT, double _tauxTVA)
	{
		this.reference = _reference;
		this.designation = _designation;
		this.prixHT = _prixHT;
		this.tauxTVA = _tauxTVA;
	}

	/******************
	 *****Getter*******
	 ******************/

	public String getReference()
	{
		return this.reference;
	}

	public String getDesignation()
	{
		return this.designation;
	}

	public double getPrixHT()
	{
		return this.prixHT;
	}

	public static double getTauxTVA()
	{
		return tauxTVA;
	}

	/*****************
	 *****Setters*****
	 *****************/

	public void setReference(String _reference)
	{
		this.reference = _reference;
	}

	public void setDesignation(String _designation)
	{
		this.designation = _designation;
	}

	public void setPrixHT(double _prixHT)
	{
		this.prixHT = _prixHT;
	}

	public static void setTauxTVA(double _tauxTVA)
	{
		tauxTVA = _tauxTVA;
	}

	public double calculPrixTTC()
	{
		return this.prixHT + (this.prixHT * tauxTVA/100d);
	}

	public String afficherArticle()
	{
		return "Reference : "+this.getReference()
		+"\nDesignation : "+this.getDesignation()
		+"\nPrix HT : "+this.getPrixHT()
		+"\nTaux TVA : "+this.getTauxTVA()
		+"\nPrix TTC : "+this.calculPrixTTC();
	}
}