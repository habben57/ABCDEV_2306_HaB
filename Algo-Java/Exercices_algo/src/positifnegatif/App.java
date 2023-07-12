package positifnegatif;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		

	
// Sujet : Ecrire un algorithme qui demand un nombre à l'utilisateur, et l'informe ensuite si ce nombre est positif ou negatif
//         (on l'aisse de cote le cas ou le nombre est zéro).
//	
//	-----------------------
//Pseudo-code
//	  Variable
//	  Entree votre nombre est une chaine de caractaire
//	  Nombre est un bouleen
//	  
//	  Début du programme
//		 	ecrire " Votre nombre ?"
//		 	lire <-- Nombre
//	  Debut Si
//			ecrire "votreNombre"
//			lire Nombre <-- Nombre
//		
//
	int Nombre;
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" Saisir votre  Nombre : ");
	Nombre = sc.nextInt();
	
	
	
	
	if(Nombre < 0)
	{
		System.out.println("  Le nombre "+ Nombre + " est Negatif " );
	}
	else if ( Nombre > 0)
	{
		System.out.println("  Le nombre "+ Nombre + " est positif ");
	}
	else
	{
		System.out.println("  Le nombre "+ Nombre + " est nul ");
	}
	
	
	sc.close();
	}
}
