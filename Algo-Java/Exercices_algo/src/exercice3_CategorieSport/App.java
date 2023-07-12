package exercice3_CategorieSport;

import java.util.Scanner;
public class App {

	public static void main(String[] args) {
	

//		
//		Ecrire un algorithme qui demande l’âge d’un enfant à l’utilisateur. Ensuite, il l’informe de sa catégorie :
//		• "Poussin" de 6 à 7 ans
//		• "Pupille" de 8 à 9 ans
//		• "Minime" de 10 à 11 ans
//		• "Cadet" après 12 ans
//
//	-------------------------------------------
//	Pseudo-code		
//	------------
//		Variable
//		Age est un entier
//		Poussin est une entier
//		Pupille est un entier
//		Minime est un  entier
//		Cadet est un entier
//	Début programme	
//	----------------	
//		Ecrire "Donner votre age"	
//		Lire <-- Age
//	Début SI	
//	---------	
//		Si Age = (6 || 7)
//		ecrire " Votre catégorie est Poussin"
//		SiNonSi Age = (8 || 9)
//		ecrire " votre catégorie est Pupille"
//		SiNonSi Age = (10 || 11)
//		écrire " Votre catégorie est Minime"
//		SiNon Age = >11
//		écrire " Votre catégorie est Cadet"
//			
		
	int Age;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" Saisir votre age ");
	Age = sc.nextInt();
	
		if (Age ==  6 || Age == 7)
		{
			System.out.println(" Votre catégorie est poussin");
		}
			else if (Age == 8 ||Age == 9)
			{
				System.out.println(" Votre catégorie est pupille");	
			}
			else if (Age == 10 ||Age ==11)
			{
				System.out.println(" Votre catégorie est minime");	
			}
			else if (Age == 12)
			{
				System.out.println(" Votre catégorie est cadet");	
			}
			else if (Age < 6 || Age >12)
			{
				System.out.println(" Vous ètes d'une autre catégorie :)");	
			}
	
		
		sc.close();
		
	}

}
