package Exercice2_6;

import java.util.Scanner;

public class App {
	
//Déterminer si un nombre et premier
		
		/*variable
		 *	 Nombre est un entier
		 * 	 i est un entier
		 *	 est_premier est un booleen
		 * Debut du programme
		 * 	est_premier <--vrai	
		 * 	ecrire "Saisir un nombre"
		 * 	lire nombre
		 * 		Debut boucle pour
		 * 			pour i allant de 2 à nombre - 1
		 * 			debut de Si
		 * 				Si nombre%i = 0
		 * 				Alors
		 * 				espremier <-- faux
		 * 			fin Si
		 * 		Fin pour
		 * 
		 * 		debut si
		 * 			si est_premier = vrai
		 * 			alors ecrire "nombre ",nombre" n'est pas un nombre premier"
		 * 		fin si
		 * Fin Programme
		 */
		
	public static void main(String[] args) {
//		Déclaration variable
		
		int Nombre;
		int i;
		boolean est_premier;	
		est_premier = true;
		
//	Début programme
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir un nombre: ");
		Nombre=sc.nextInt();
		
//		nombre = Math.abs(Nombre == 1)
		
		
		for(i=2; i<Nombre; i++)
		
		{
			if (Nombre%i == 0)
			{
				est_premier = false;
			}
		}
		
		
		if(est_premier)
		{
			System.out.println("Nombre est premier");
		}
		
		else
		{
			System.out.println("Nombre n'est pas premier");
		}
		
		sc . close();
	}

}
