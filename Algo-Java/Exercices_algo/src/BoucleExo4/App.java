package BoucleExo4;

import java.util.Scanner;

public class App {

	/*
	 Variables
	nombre est un entier
	somme est un entier
	i est un entier
Debut du programme
	Ecrire "Saisir un nombre"
	Lire nombre
	somme <-- 0
Debut pour
	Pour i allant de 1 à nombre
	somme <-- somme + i
	i suivant
Fin pour
	Ecrire "La somme est :",somme
Fin du programme
	 */


	public static void main(String[] args) {
	
		int nombre ;
		int i ;
		int Somme = 0;
		
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Saisir votre nombre");
		nombre = sc.nextInt();
		
		
		
		
		for(i = 1; i<=nombre; i++)       //i=1 depart  i=<=10  jusqu a nombre   i++ (i plus nomùbre precedent a chaque fois)
		
			{
		Somme = Somme + i;
//		System.out.println(nombre +i++ );
			}
		System.out.println(" La somme des nombres de 1 à "+nombre+" est : "+ Somme);
	sc.close ();

	}

}
