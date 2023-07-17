package LesConditions4;

import java.util.Scanner;

public class App {
//
//		Cet algorithme est destiné à prédire l'avenir, et il doit être infaillible !
// 		Il lira au clavier l’heure et les minutes, et il affichera l’heure qu’il sera 
//		une minute plus tard. Par exemple, si 
//		l'utilisateur tape 21 puis 32, l'algorithme doit répondre :
// 		"Dans une minute, il sera 21 heures 33".
// 		NB : on suppose que l'utilisateur entre une heure valide. Pas besoin donc de la vérifier.

//	variable
//		Heure est un entier
//		Minute est un entier
//	Début programme
//		ecrire "Saisir les heures"
//		lire <-- Heure
//		ecrire "Saisire les Minutes"
//		lire <-- Minute
//	début Si
//			Si Heure = 60
//			alors 
//			Heure = Heure+1
//			Minute = 0
//			Si Heure = 24
//			alors
//			Heure = 0
//		Fin Si
//	fin programme
	
	public static void main(String[] args) {
//		Déclaration variable
		
		int Heure;
		int Minute;
		boolean HeureValide;
		
		Scanner sc = new Scanner(System.in);
		
		Minute = 0;
		Heure = 0;
		HeureValide =false;
//		Début programme
		
		
		while (HeureValide == false)
		
		{
		System.out.println("Saisir votre heure");
		Heure = sc.nextInt();
		
		System.out.println("Saisir vos minutes");
		Minute = sc.nextInt(); 
		
		if (Heure > 23 || Minute > 59 )
			{
			System.out.println("votre saisie est fausse");

			}
		if (Heure <= 23 && Minute <= 59)
			{
			HeureValide = true;
			}
		
		}
		
		Minute = Minute + 1;

			if (Minute == 60)
			{
				Heure = Heure+1 ;
				Minute = 0;
			}
			if (Heure == 24)
			{
				Heure = 0;
			}
				System.out.println(" Il sera "+ Heure +"H" +Minute+ " dans une minute");

		
	sc . close ();
	
		}
		
	}


