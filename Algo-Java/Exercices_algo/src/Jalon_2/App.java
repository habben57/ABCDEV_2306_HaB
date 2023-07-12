package Jalon_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int Prix;
		String EstIlEtudiant;
		Boolean Etudiant;
		String SommeNousMercredi;
		Boolean Mercredi;
		String SommeNousJeudi;
		Boolean Jeudi;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Est il etudiant? \nOui= O ou o \tNon=N ou n");
		EstIlEtudiant = sc . next();
		 
		System.out.println ("Somme nous Mercredi? \nOui = O ou o \tNon=N ou n");
		SommeNousMercredi = sc . next();
		
		System.out.println ("Somme nous Jeudi? \nOui = O ou o \tNon=N ou n");
		SommeNousJeudi = sc . next();
		
		/*if (Etudiant == true %%  Mercredi == true; 
		{
			
			System.out.println ("Vous avez drois à 50% de reduction");
		}
		else 
		{
			Mercredi = true;
		}
				
		System.out.println("Vous avez drois à 25% de réduction");
			*/
		
		 sc . close();
	
	}
	
		
		
	}


