package exemple;


import java.util.Scanner;

// grace au double slach commentaire non visible

/*
 * ceci est un commentaire
 * sur plusieur lignes
 */

/* Test */


public class App {

	public static void main(String[] args) {
		// declaration des variables
		int nombre1;
		int nombre2;
		int resultat;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le 1er nombre ");
		nombre1 = sc.nextInt();
		System.out.println("Saisir le 2eme nombre ");
		nombre2 = sc.nextInt();
		resultat = nombre1 + nombre2;
		
		System.out.println("Le resultat de l'addition de "+
					nombre1 +" est "+ nombre2 + " est " +
							resultat);
							
		sc.close();
	}

}
