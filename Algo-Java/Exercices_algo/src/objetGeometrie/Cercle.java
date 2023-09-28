package objetGeometrie;



public class Cercle {
	
		public double centre;
		public double radius;
		public double perimetre;
		public double surface;
		
//--------constructeur sans parametre----------		
		
//--------constructeur--------------------------
	public Cercle (double centre, double _r, double _perimetre, double _surface)
	{
		this.centre = centre;
		this.radius = _r;
		this.perimetre = _perimetre;
		this.surface = _surface;
	}
	
	
	public double getperimetre()
	{
		
		return this.perimetre;
	}
	
	public double getsurface()
	{
		double pi = Math.PI;
		return surface;
	}
	
	public void setperimetre(double _perimetre)
	{
		double perimetre = _perimetre;
	}
	
	private void setsurface(double _surface) 
	{
	    double surface = radius * radius * Math.PI;
	    System.out.println("L aire du cercle est de :"+surface);
	}
	
	public void Affichage()
	{
		System.out.println(" Le perimetre du cercle est de :"+this.perimetre+" et son Aire est de :" + this.surface);
	}
}
