package BoucleExo_5;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
//		 Variables
//			nombre est un entier
//			factorielle est un entier
//			i est un entier
//		Debut du programme
//			Ecrire "Saisir un nombre"
//			Lire nombre
//			factorielle <-- 1
//		Debut pour
//			Pour i allant de 2 à nombre
//			factorielle <-- factorielle * i
//			i suivant
//		Fin pour
//			Ecrire "La factorielle de ",nombre" est :",factorielle
//		Fin du programme
		 

			
				int nombre;
				int factorielle;
				int i;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Saisir un nombre");
				nombre = sc.nextInt();
				factorielle = 1;
				
				for(i = 2; i <= nombre; i++)   //  1*2=2   depart à 2 (2x3x4x5x6x7x8....autant de fois nombre
				{
					factorielle = factorielle * i; // facteur de, facteur de, facteur de.......autant de fois nombre
				}
				
				System.out.println("La factorielle de "+nombre+" est : "+factorielle);
				
				sc.close();
	}

}
