package objetPorteGarage;

import java.util.Scanner;

public class PorteDeGarage {

	public static void main(String[] args) {
		
		int degresOuverture;
		int degresFermeture;
		int difference;
		
		Scanner sc = new Scanner(System.in);
		
		
		PorteLeroyMerlin porteGarage = new PorteLeroyMerlin("PorteLeroyMerlin" ,true, 0,false, 0, 180, 0); 
		//PorteBricoDepot porteGarage  = new PorteBricoDepot("PorteBricoDepot" ,true, 0,false, 0, 100, 0);
		int degresFermable = 0;
		
		boolean test1 = porteGarage.ouvrir();
		boolean test2 = porteGarage.fermer();
		boolean test3 = porteGarage.verouiller();
		boolean test4 = porteGarage.deverouiller();
		boolean test7 = porteGarage.ouvrir();
		System.out.println(" Entrer le degre d'ouverture : ");
		degresOuverture = sc.nextInt();
		boolean test5 = porteGarage.degresOuverture(degresOuverture);
		System.out.println(" Entrer le degre de fermeture : ");
		degresFermeture = sc.nextInt();
		
		boolean test6 = porteGarage.degresFermeture(degresFermeture);
		difference =  degresOuverture - degresFermeture;
		System.out.println(" Porte ouverte de : "+difference+ " degres");
		//degresOuverture = sc.nextInt();
		
		
		
//		boolean test1 = BricoDepot.ouvrir();
//		boolean test2 = portedeGarage.fermer();
//		boolean test3 = portedeGarage.verouiller();
//		boolean test4 = portedeGarage.deverouiller();
//		boolean test5 = portedeGarage.degresOuverture(45);
//		boolean test6 = portedeGarage.degresFermeture(30);System.out.println(" Entrer le degre d'ouverture : ");
		
//	
	
	sc.close();
	}

}
