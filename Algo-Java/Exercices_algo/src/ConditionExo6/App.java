package ConditionExo6;

import java.util.Scanner;

public class App {

	private static final int M = 0;

	public static void main(String[] args) {

//		Exercice Condition 6
//		Les habitants de Zorglub paient l’impôt selon les règles suivantes :
//			• les hommes de plus de 20 ans paient l’impôt
//			• les femmes paient l’impôt si elles ont entre 18 et 35 ans
//			• les autres ne paient pas d’impôt
//			Le programme demandera donc l’âge et le sexe du Zorglubien, 
//			et se prononcera donc ensuite sur le fait 
//			que l’habitant est imposable.


/*	Variables
		genre est une chaine de caractaire
		Age est un entier
		condition1 est un boolean
		condition2 est un boolean
	Debut programme
		Ecrire "saisir votre genre M/F :"
		Lire <-- genre
		Ecrire "saisire votre age :"
		Lire <-- age
		condition1 <-- genre = "m" ET age > 20
		condition2 <-- genre = " F" ET (age > 18 ET age < 35)
	Debut Si
		Si condition1 = vrai OU condition2 = vrai
		Alors Ecrire " vous etes impôsable "
		SiNon Ecrire " Vous n'etes pas impôsable "
	Fin si
Fin programme
*/		
		Scanner sc = new Scanner(System.in);
		
		String genre;
		int Age;
		boolean condition1;
		boolean condition2;
		
		Age = 0;
		genre = "M";
		boolean M = true;
		
		

		
		
		
		
		
		System.out.println("saisir votre genre (M) pour masculin ou (F) pour feminin : ");
		genre = sc.next();
		if(genre.equals("M")) {
			M = true;
		}else {
			M = false;
		}
		
		
		
		System.out.println("saisir votre Age : ");
		Age = sc.nextInt();
		condition1 =  (M == true && Age>20);
		condition2 =  (M == false && Age>18 && Age<35);
		
//	if ((genre.equals("M") || genre.equals("m")) && Age > 20 )
//		{
//			System.out.println(" Vous êtes impôsable ");
//		}
		
		/*if (condition1 = M && Age>20);
			{
			condition1 =true;
			}*/
		if (condition1 || condition2)
//		else if ((genre.equals("F") || genre.equals("f")) && (Age > 18 && Age < 35 ))
		{
			System.out.println(" Vous êtes impôsable ");
		}
		
		else
		{
			System.out.println(" Vous n'êtes pas impôsable ");
		}
		
		
		
		sc . close ();
		
		
	}

}
