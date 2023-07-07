package Exercice2_5;

import java.util.Scanner;

/*
 * Nombre est un entier
 * 
 * Ecrire
 * 	"Saisir votre nombre pour verifier s'il est premier"
 * Lire <-- Nombre
 * 
 * Debut Si
 * 	Si 
 * 		(Nombre^2-n+41) = (Nombre(Nombre+1)+41)
 * 	alors
 * 		Ecrire
 * 		"Votre Nombre est un Nombre premier"
 * 	SiNon
 * 		Ecrire
 *		"Votre Nombre n'est pas un nombre premier"
 *
 *Fin Si
 * 		
 * 
 */
public class App {

	public static void main(String[] args) {
	
		int Nombre;
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Saisir votre nombre ");
		
		Nombre = sc.nextInt();
		
			
			if
				Nombre = (( (Math.pow(Nombre,2)+(Nombre+41)) = (Nombre*(Nombre+1)+41) ) )
				
				{
					System.out.println( "Votre nombre" + Nombre +" est premier ");
				}
		
			else
				{
					System.out.println( " Votre nombre "+ Nombre + " n'est pas premier ");
				}
		
		sc.close();
	}

}
