package objetBouteille;

public class App {

	public static void main(String[] args) {
		
		Bouteille cristaline = new Bouteille("Cristaline",1.25,1.5,true, false);
		
		boolean test1 = cristaline.fermer();
		boolean test2 = cristaline.ouvrir();
		boolean test3 = cristaline.viderTout();
		boolean test4 = cristaline.completer();
		boolean test5 = cristaline.fermer();
		
		
		
	} 

}
