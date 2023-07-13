package ConditionExo5;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

//		Un magasin de reprographie facture 0,10 € les dix premières photocopies,
//		0,09 € les vingt suivantes et 0,08 
//		€ au-delà. Ecrivez un algorithme qui demande à l’utilisateur le nombre de photocopies effectuées et qui 
//		affiche la facture correspondante.


//		Exercice Condition 5
//		
//Variables
//	photocopie est un entier
//	prix1 est un decimal constant
//	Prix2 est un décimal constant
//	Prix3 est un decimal constant
//		
//Début programme
//	Ecrire "saisir le nombre de photocopie"
//	Lire photocopie
//		Prix1 = 0.10
//		Prix2 = 0.09
//		Prix3=0.08
//	Début Si
//	Si photocopie <= 10
//	Alors photocopie*0.10
//	si photocopie >10 && photocopie <=20
//	Alors prix = (photocopie-10 )* prix2
//	Si photocopie >20
//	Alors (prix1*10)+(prix2*10)+((photocopie-20)*prix3)
//	Fin Si
//Ecrire " Le prix total de vos photocopie est de " + photocopie+ " €"
//Fin programme		
		
		
		
	int photocopie;	
	double prix = 0;
	final double prix1 = 0.10; 
	final double prix2 = 0.09;
	final double prix3 = 0.08;
	/* final double = nombre constant qui ne change jamais */
	
	
	Scanner sc = new Scanner(System.in);	
		
	System.out.println("Sairir le nombre de photocopie");
	photocopie = sc.nextInt();
	
		if (photocopie<=10)
		{
			prix = photocopie* prix1;
		}
		
		if (photocopie > 10 && photocopie <= 20)
		{
			prix = 10*prix1 + (photocopie-10 )* prix2 ;
		}
		
		if (photocopie > 20)
		{
			prix = (prix1*10)+(prix2*10)+((photocopie-20)*prix3);
		}	
			
		System.out.println("Le prix de vos de photocopie est de "+prix+" €");	
	
		sc.close();	
		
	}

}
