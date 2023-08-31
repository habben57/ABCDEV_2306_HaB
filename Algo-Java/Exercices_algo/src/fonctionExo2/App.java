package fonctionExo2;

import java.util.Scanner;

public class App {

	//--PROCEDURE---------périmetre et Aire triangle---------
	
/**
 *  FONCTION Reel perimetreAire(reel a, reel b, reel c)
 * 	perimetre est reel
 * 	aire est un reel
 * 	pertimetre <-- a+b+c
 * 	aire <-- ((p/2-a)(p/2-b)(p/2-c))1/2
   FIN FONCTION
 *------VARIABLES-------------------
 * 	a est un entier
 * 	b est un entier
 * 	c est un entier
 *----- DEBUT PROGRAMME------------
 * 	Ecrire "Saisir le premier nombre"
 * 	lire a
 * Ecrire "Saisir le deuxiemme nombre"
 * 	Lire b
 * 	Ecrire "Saisir le troisiemme nombre"
 * 	Lire c
 *  Ecrire " calcule du perimetree: a+b+c = " perimetre ", camcule de l'aire = " Air "
   FIN PROGRAMME
 */
	
	public static void calculAire(double a, double b, double c) 
	{
		double perimetre;
		perimetre = (a+b+c);
		double aire;
		aire = (0.5) /(( ((perimetre/2) -a) * ((perimetre/2)-b) * ((perimetre/2)-c)) );
		
		System.out.println(" Le perimetre du triangle est : " + perimetre);
		System.out.println(" L'aire du triangle est : " + aire);
		
	}

	public static void main(String[] args) {
		
//	------variable---------
		double a;
		double b;
		double c;
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Saisir le premier nombre");
	a = sc.nextDouble();

	System.out.println("Saisir le deuxieme nombre");
	b = sc.nextDouble();
	
	System.out.println("Saisir le troisieme nombre");
	c = sc.nextDouble();
	
	calculAire(a, b, c);
	
	sc.close();
	}

}
