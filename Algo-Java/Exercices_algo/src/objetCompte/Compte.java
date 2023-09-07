package objetCompte;

import java.util.Scanner;

public class Compte {
	
//	//attributs
//	private String nom;
//	public double solde;
//	private boolean depot;
//	private int retrait;
//	private int affichage;
//	private double nouveauSolde;
//	//constructeur
////
//	public Compte(String _nom, boolean _depot, int _retrait, int _affichage,double _nouveauSolde)
//	{
//		this.nom = _nom;
//		this.depot = _depot;
//		this.retrait = _retrait;
//		this.affichage = _affichage;
//		this.nouveauSolde = _nouveauSolde;
//	}
//	
//	
//	{
//		if( this.depot)
//		{
//			System.out.print(" Votre depot st de : "+ depot);
//			depot = true;
//		}
//		else
//		{
//			return false;
//		}
//	}
		
		Scanner sc =new Scanner(System.in);
		
		double solde;

		
		public Compte(Double s)
		{
			this.solde = s;
		}
	
		public void deposer(Double d)
		{
			
			System.out.println("Montant a déposer ? ");
			d = sc.nextDouble();
			this.solde+=d;
		}
	
		public void retirer(Double r)
		{
			System.out.println("Montant a retirer ? ");
			r = sc.nextDouble();
			this.solde -= r;
		}
		public void afficher()
		{
			System.out.println(" Votre solde est de "+ this.solde +" Euros ");
		}

}
