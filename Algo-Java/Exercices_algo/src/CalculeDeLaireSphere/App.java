package CalculeDeLaireSphere;

import java.util.Scanner;

public class App {

	

	public static void main(String[] args) {
	
		
		/*
		 Lire le rayon R d'une sphère puis calculer et afficher :
		 son Aire = 4*Pi*Rcarré
		
		Déclarer variable
		  rayon est un entier
		  Aire est un double
		  Volume est un double
		constantes
		  pi est un reel double
	
	Début programme
	
	Ecrire " saisir le Rayon"
	Lire <--Rayon
	pi -- 3.1415
	Aire<-- 4*pi*rayon^2
	Volume<--4/3*pi*rayon^3 
	Fin programme
	
	aire
		  
		*/
//		déclaration variable
		int rayon;

		double aire;
		double volume ;
		//		déclaration constante
		final double pi = Math.PI;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Saisir le rayon : ");
		rayon = sc.nextInt();
		
		aire = 4*pi *Math.pow(rayon,2 );
		aire = Math.round(aire*100.0)/100.0;  // pour avoir 2 chiffres apres la virgule
		volume = 4/3d*pi*Math.pow(rayon,3);
		aire = Math.round(aire*100.0)/100.0;  // pour avoir 2 chiffres apres la virgule
		
		System.out.println( "L'aire est de : " + aire);  
		System.out.println("Le volume est de : " + volume );
		
		
	sc . close();
		
		
	}

}
