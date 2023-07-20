package exercice2_1;

import java.util.Scanner;

/*
 * -----Conditions----
 * 
 * variable
 * 		Age est un entier
 *Début programme
 * 		Ecrire "Saisir votre age"
 * 		Lire <-- Age
 *	Début Si
 * 		Si 
 * 			Age < 0
 * 		Alors
 * 			Ecrire " Vous n'etes pas encore né"
 * 	Si non Si
 * 			Age < 18
 * 		Alors
 * 			Ecrire " Vous etes mineurr"
 *  Si non 
 * 			Ecrire " Vous etes Majeur"
 * 
 * */
public class App {	
	
	public static void main(String[] args) {
		

		int age;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Saisir votre Age : ");
		age = sc.nextInt();
		
		if (age < 0)
		{
			System.out.println(" Vous n'êtes pas encore né ");
		}
			else if (age < 18)
			{
			System.out.println(" Vous êtes mineur ");
			}
		else
		{
			System.out.println(" Vous êtes majeur ");
		}
		sc.close();
	}

}
