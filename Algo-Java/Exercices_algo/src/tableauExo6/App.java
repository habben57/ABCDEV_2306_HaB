package tableauExo6;

public class App {

	public static void main(String[] args) {
		
//		...............variable....................
		
		int tab1[] = {4,8,7,12};			//variable j pour tab1
		int tab2[] = {3,6};					//variable i pour tab2
		int temporaire;
		int  somme = 0;
		int signe = 0;
		
//		..............debut programme...............		
		for(int i = 0; i < tab2.length; i++)
			{
				for(int j = 0; j < tab1.length; j++)				
				
				{
					System.out.print("("+tab2[i]+" * "+tab1[j]+")");
					 if(signe < (tab1.length * tab2.length) - 1)	// -1 pour arreter le signe + au dernier passage des deux boucles
					 {												// comme ici avant le chiffre 12 du tab1
						 System.out.print(" + ");
					 }
					 else
					 {
						 System.out.print(" = ");
					 }
					 signe++;									// pour incrementer signe a chaque passage de la boucle ligne 23
					 temporaire = tab2[i]*tab1[j];
					 somme += temporaire;						// le signe += permet d'ajouter la somme 
					 											// du temporaire a chaque passage
				}
	
			}
		
		System.out.println(somme);								// resultat de tous les calcule effectuer
	}

}