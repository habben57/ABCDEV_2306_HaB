package Taux_interet;

import java.util.Scanner;

		
	//calcule de taux inetret	
		/*
		 * Declaration des variables
		 * Variable
		 
		S est le capital
		i est l'interet 
		N est année
		Interet simple est un float "nombre a virgule"
		Interet composé est float "un nombre a virgule"   
		   debut du programme
		ecrire "saisir votre capital"
		lire <-- S
		ecrire "saisir votre votre taux d'interet"
		lire <-- i
		ecrire "saisir le nombre d année"
		lire <-- N
		Interet simple <-- S(1+N*i)
		Interet composé<-- S(1+i)^N
		ecrire "Interet simple : ",Interet simple,"Interet composé :"",Interet composé
		 Fin du programme
		*/

		

public class exercice5 {

		public static void main(String[] args) {
		Float S;
		Float i;
		int N;
		Float InteretSimple;
		Float InteretCompose;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Saisir le montant de votre capital : ");
		S = sc.nextFloat();
		System.out.println("Saisir le taux d'interet : ");
		i = sc.nextFloat();
		System.out.println("Saisir le nombres d'années : ");
		N = sc.nextInt();
		
		InteretSimple = S*(1+N*i/100);
		System.out.println("le taux d interet simple est : ");
		InteretCompose = S*Math.pow(1+(i/100),N);
		System.out.println("le taux d interet composé est : ");
		
		sc.close();
		
		}

		

}
