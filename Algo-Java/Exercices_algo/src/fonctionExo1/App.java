package fonctionExo1;

import java.util.Scanner;

public class App {

//	inversion 2 valeurs
	
/*	PROCEDURE
		inversion(entier a, entier b)
		tmp est un entier						(tmp correspond a temporaire)
		tmp <-- a
		a <-- b
		b< -- tmp
		ecrire "Apres inversion : nombre a = ",a," nombre b = ",b
	FIN PROCEDURE
	VARIABLES
		nombre1 est un entier
		nombre2 est un entier
	DEBUT DU PROGRAMME
		Ecrire"saisir le 1er nombre"
		lire nombre
		Ecrire"Saisir le deuxieme nombre"
		Lire nombre 2
		Ecrire avant inversion : nombre a =" nombre1," nombre b = ",nombre2
		inversion(nombre1,nombre2)
	FIN DU PROGRAMME
	
*/
	public static void inversion(int a, int b)
	{					
		int tmp;
		tmp = a;											//	Fonction inversion			
		a = b;												//
		b = tmp;
		
		System.out.println( " Apres inversion le nombre a = "+ a+" et nombre b = "+ b);
	}
		
		public static void main(String[] args){
//		declaration variable	
		int nombre1;
		int nombre2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Saisir le premier chiffre :");
		nombre1 =sc.nextInt();
		
		System.out.println(" Saisir le deuxième chiffre :");
		nombre2 =sc.nextInt();
		
		System.out.println(" Avant inversion : nombre a = "+ nombre1+" nombre b = "+nombre2);
		inversion(nombre1, nombre2);
	
	
	sc.close();
		

	}

}
