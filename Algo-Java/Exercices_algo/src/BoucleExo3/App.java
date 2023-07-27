package BoucleExo3;

import java.util.Scanner;

public class App {

	
	public static void main(String[] args) {
	
/*    boucle " Tant que "
 Ecrire un algorithme qui demande un nombre de départ, et qui ensuite affiche
 les dix nombres suivants. 
Par exemple, si l'utilisateur entre le nombre 17, le programme affichera les nombres de 18 à 27.
Ecrire cet algorithme dans un premier temps avec une boucle tant que, puis avec une boucle pour.
		
	variables
	nombre est un entier
	i est un entier
debut programme
nombre <-- 0
	Ecrire " Saisir un nombre "
	Lire nombre 
	Debut tant que
		tant que nombre < 10
		Alors  (i=0; i<10; i++)
	fin tant que
fin programme

//*/	
////		EXERCICE AVEC   "   FOR   "
//		
		int nombre ;
		int i ;
		
		
	Scanner sc = new Scanner(System.in);
	

		System.out.println("Saisir votre nombre");
		nombre = sc.nextInt();
		
		
		System.out.println("nombre suivant");
		for(i=1; i<=10; i++)       //i=1 depart  i=<=10  nombre de fois   i++ (i plus 1 a chaque fois)
	
		{
		nombre = nombre+1;
		System.out.print(nombre+" - ");   // println = sur plusieurs lignes
		}								  // print = sur une seul ligne
	
		sc.close ();



//	
//	  	 EXERCICE AVEC  "  WHILE  "
		
//		int nombre = 0  ;
//		int i = 0;
//
//	Scanner sc = new Scanner(System.in);
//		
//		i=1;
//		System.out.println("Saisir votre nombre :");
//		nombre = sc.nextInt();
//		
//		while (i <= 10)
//				
//			{
//		nombre = nombre + 1;
//		System.out.println(nombre+i);
//		i=i+1; 
//			}
//			
//		
////		
	sc.close ();
////
		
	}

}
