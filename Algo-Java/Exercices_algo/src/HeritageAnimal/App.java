package HeritageAnimal;

public class App {

	public static void main(String[] args) {

		
			Abeille abeille = new Abeille();
			Cheval cheval = new Cheval();
			Labrador labrador = new Labrador();
			
			Abeille abeille1 = new Abeille();
			System.out.print(" \n\t "+ abeille.getEspece()+ abeille.getNom()+ abeille.getMange()+ abeille.getCommunication()+ abeille.getDeplacement()+ abeille.getAnimal() );
			
			Cheval cheval1 = new Cheval();
			System.out.print(" \n\t "+ cheval1.getEspece()+ cheval1.getNom()+ cheval1.getMange()+ cheval1.getCommunication()+ cheval1.getDeplacement()+ cheval1.getAnimal() );
			
			Labrador labrador1 = new Labrador();
			System.out.print(" \n\t "+ labrador1.getEspece()+ labrador1.getNom()+ labrador1.getMange()+ labrador1.getCommunication()+ labrador1.getDeplacement()+ labrador1.getAnimal() );
	}	
}
