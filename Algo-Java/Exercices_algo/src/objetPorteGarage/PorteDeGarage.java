package objetPorteGarage;

public class PorteDeGarage {

	public static void main(String[] args) {

		PorteLeroyMerlin portedeGarage = new PorteLeroyMerlin("LeroyMerlin",true, false, 25, 100, 0); 
//		PorteGarage BricotDepot = new PorteGarage("BricoDepot", 170, 90, 45, true, false);
	
		boolean test1 = portedeGarage.ouvrir();
		boolean test2 = portedeGarage.fermer();
		boolean test3 = portedeGarage.verouiller();
		boolean test4 = portedeGarage.deverouiller();
		boolean test5 = portedeGarage.degresOuverture(45);
	
	
	
	
	
	
	}

}
