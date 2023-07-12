package exercuceDiviseurDunNombre;

import java.util.Scanner;

public class App {

	
		
//	Variable
//	
//		nombre est un entier
//	Debut du programme
//		ecrire "saisir un nombre entier"
//		lire nombre
//		Debut boucle pour
//			Pour i allant de 2 à nombre- 1
//				Debut Si
//						Si nombre%i = 0
//						Alors
//						ecrire "Diviseur :", i
//				Fin Si
//		Fin boucle pour
//	Fin du programme
	
	public static void main(String[] args) {
//		Variable
		int Nb;
		int i;	
		
		
		Scanner sc = new Scanner(System.in);		
		
//		Début programme
		System.out.println(" saisir un nombre entier:");
		Nb = sc.nextInt();
		
		for(i = 2; i< Nb; i++)
			
			{
			if(Nb %i == 0)		
			{
			System.out.println(i + " ");
			}
			
		}

		sc . close();	
		
		
	}

}


