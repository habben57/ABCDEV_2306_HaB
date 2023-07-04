
package exercice2_2;

import java.util.Scanner;

/*	nombre1 est un entier
		nombre2 est un entier

	Ecrire "Saisir le 1er nombre"
	    	Lire <-- Nombre1

	Ecrire "Saisir le 2ème nombre"
	    	Lire <-- Nombre2
	Début Si 
		Si
		Lire <-- nombre1<nombre2

		Alors
			Ecrire " Le nombre1 est inferieur au nombre2 "
		SiNnon 
			Ecrire " Le nombre2 est inferieur au nombre1"
	*/


public class App {

	public static void main(String[] args) {

	int Nombre1;
	int Nombre2;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" Saisir votre premier Nombre : ");
	Nombre1 = sc.nextInt();
	
	System.out.println(" Saisir votre deuxieme Nombre : ");
	Nombre2 = sc.nextInt();
	
	if(Nombre1 < Nombre2)
	{
		System.out.println(Nombre1 + "  " + Nombre2);
	}
	else if ( Nombre1 > Nombre2)
	{
		System.out.println( Nombre2 + "  " + Nombre1);
	}
	sc.close();
	}

}
