package objetCompte;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

//			String nom;
//			int depot = 0;
//			int retrait = 0;
//			int affichage = 0;
//			int compte;
//			double nouveauSolde = 0;
//			int achat;
//			
//			
//		Compte Habib = new Compte("Habib", true, 10, 10, 10);
//		
//		
//		boolean test1 = compte.depot();
//		System.out.println(" Montant déposer ? ");
//		depot = sc.nextInt();
//		
//		boolean test2 = compte.retrait();
//		System.out.println(" Montant retirer ? ");
//		retrait = sc.nextInt();
//		
//		boolean test3 = compte.affichage();
		double solde;
		double s =0;
		double deposer =0;
		double retirer =0;
	//	double Compte ;
		Compte monCompte= new Compte(5000.0);
		monCompte.deposer(0.0);
		monCompte.retirer(0.0);
		monCompte.afficher();
		monCompte.retirer(0.0);
		monCompte.afficher();
		monCompte.deposer(0.0);

	
	
	}

}
