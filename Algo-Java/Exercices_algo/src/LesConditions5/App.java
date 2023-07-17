package LesConditions5;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
//		EXERCICE 4.2
//		De même que le précédent, cet algorithme doit demander une heure 
//		et en afficher une autre. Mais cette 
//		fois, il doit gérer également les secondes, et afficher l'heure qu'il sera 
//		une seconde plus tard.
//		Par exemple, si l'utilisateur tape 21, puis 32, puis 8, l'algorithme doit 
//		répondre : "Dans une seconde, il sera 
//		21 heure(s), 32 minute(s) et 9 seconde(s)".
//		NB : là encore, on suppose que l'utilisateur entre une heure valide	
//		
//		 variable
		
		
//
	
	
//	EXERCICE Condition 4.2
//
//Variables
//	heures est un entier
//	minutes est un entier
//	secondes est un entier
//Debut du programme
//	Ecrire "Saisir les heures : "
//	Lire heures
//	Ecrire " Saisir les minutes : "
//	Lire minutes
//	Ecrire "Saisir les secondes : "
//	Lire secondes
//	secondes <-- secondes + 1
//Debut Si
//	Si secondes = 60
//	Alors 
//	secondes <-- 0
//	minutes <-- minutes + 1
//Fin Si
//Debut Si
//	Si minutes = 60
//	Alors
//	minutes <-- 0
//	heures <-- heures + 1
//Fin Si
//Debut Si
//	Si heures = 24
//	Alors
//	heures <-- 0
//Fin Si
//Ecrire "Dans une secondes il sera ",heures,"heure(s) ",minutes,"minute(s) et ",secondes,"seconde(s)"
//Fin du programme
//	
		
		int Heures;
		int minute;
		int seconde;
		boolean HeureValide;
		
		Scanner sc = new Scanner(System.in);
		
		Heures = 0;
		minute = 0;
		seconde = 0;
		HeureValide = false;
		
		while (HeureValide == false)
		
		{
		System.out.println("Saisir les heures");
		Heures = sc.nextInt();
		
		System.out.println("Saisir les minutes ");
		minute = sc.nextInt();
		
		System.out.println("Saisir les secondes");
		seconde = sc.nextInt();
		seconde = seconde+1;
		
		
		if (Heures > 23 || minute > 59 || seconde > 59)
			{
			System.out.println("votre saisie est fausse");
			}
		if (Heures <= 23 && minute <= 59 && seconde <= 59)
			{
			HeureValide = true;
			}
		
		}
		
			if (seconde == 60)
				{
				seconde = 0;
				minute = minute+1;
				}
		
			if (minute == 60)
				{
				minute = 0;
				Heures = Heures + 1;
				}
			
			if (Heures == 24)
				{
				Heures = 0;
				}

			System.out.println("Dans une secondes il sera "+Heures+"heure(s) "+minute+"minute(s) et "+seconde+"seconde(s)");
		
		sc.close();
	
	}

}
