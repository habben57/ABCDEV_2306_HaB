package ProduitNegatifPositif;

import java.util.Scanner;

public class App {

	
//Sujet : Ecrire un algotme qui demande deux nombres à un utilisateur 
//et l'informe si leur produit est negatif ou positif.
//	
//	-----------------------
//	Pseudo-code
//	  Variable 
//	  
//	  Nombre1 est un bouleen
//	  Nombre2 est un bouleen
//
//	Début du programme
//		 	ecrire " Votre premier nombre ?"
//		 	lire <-- Nombre1
//	  		ecrire " Votre second nombre ?"
//	 		lire <-- Nombre2
//	Debut Si
//			Si Nombre1<0 et Nombre2<0
//		 	ecrire " le produit des deux nombres est positif"
//			Si Nombre1 < 0 et Noubre2 > 0
//			ecrire " le produit est negatif"		
//			Sinon 
//			ecrire produit positif
//		
		
	
public static void main(String[] args) {
	
		
		int Nombre1;
		int Nombre2;
		 
	

	Scanner sc = new Scanner(System.in);

	
	System.out.println(" Saisir votre premier Nombre : ");
	Nombre1 = sc.nextInt();
	
	System.out.println(" Saisir votre premier Nombre : ");
	Nombre2 = sc.nextInt();
	
		if (Nombre1<0 && Nombre2<0)
		{
			System.out.println("Le produit de" +Nombre1+ " et " +Nombre2+ " est positif");	
		}
		else if ((Nombre1>0 && Nombre2<0) || (Nombre1<0 && Nombre2>0))
		{
			System.out.println("Le produit de " +Nombre1+ " et " +Nombre2+ " négatif");
		}
		
		else
		{
			System.out.println("Le produit de" +Nombre1+ " et " +Nombre2+ " est négatif");
		}
	
		sc.close();
	}
}