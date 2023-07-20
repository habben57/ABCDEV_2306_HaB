package Essai;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
/*		
	nombreA est une variable
	nombreB est une variable
	
	-----debut programme----
	Ecrire nombre1
	lire nombre1
	Ecrire nombre2
	lire nombre2
	
	debut SI
		Si nompbreA et nombreB sont egaux
		alors
		ecrire " les deux nombres sont egaux"
		Si nombreA > nombreB
		alors
		ecrire " nombreA supieur ànombreB"
		Sinon
		ecrire " nombreB superieur à nombreA"
	fin si
	----fin programme-------
*/	
		
	int nombreA = 0;
	int nombreB = 0;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" saisire votre premier chiffre :");
	nombreA = sc.nextInt();
	System.out.println(" saisire votre deuxiemme chiffre :");
	nombreB = sc.nextInt();
	
	if ( nombreA == nombreB)
	{
		System.out.println(" les nombre sont égaux");
	}
	else if (nombreA > nombreB)
	{
		System.out.println("chiffre par ordre croissant : "+nombreB+" , "+ nombreA );
	}
	else
	{
		System.out.println("chiffres par ordre croissant : "+nombreA+" , "+nombreB);
	}
		
	sc . close();	
	}

}
