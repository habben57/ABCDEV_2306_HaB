package tableauExo9;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		/*
		 * 
 Toujours et encore sur le même principe, écrivez un algorithme permettant, à l’utilisateur de saisir les 
notes d'une classe. Le programme, une fois la saisie terminée, renvoie le nombre de ces notes supérieures 
à la moyenne de la classe.

-----------------Variables----------
	 	Nbr est un entier
		i est un entier
		nbrSupMoyenne est un entier
		somme est un entier
		moyenne est un entier
	 	tab[] est un tableau d’entier
--------------Debut du programme-------------
	 Ecrire « Saisir le nombre de notes à saisir : »
		Lire nbr
	 tab[] <-- onglet[nbr]
	Debut pour
		Pour i allant de 0 à nbr - 1
	 Ecrire « Saisir la note n° « ,i+1
			Lire tab[i]
		i Suivant
	Fin pour
		somme <-- 0
	Debut pour
		pour i allant de 0 à nbr - 1
		somme <-- somme + tab[i]
		i suivant
	Fin pour
		moyenne <-- somme/nb
		nbrSupMoyenne <-- 0
	Debut pour
		pour i allant de 0 à nbr - 1
	 Débuts Si
			Si tab[i] > moyenne
			Alors nbrSupMoyenne <-- nbrSupMoyenne + 1
		Fin Si
		i suivant
	Fin pour
	 Ecrire nbrSupMoyenne, " eleves depassent la moyenne de la classe »
	Fin du programme 
		 */
//---------------Declaration des variables----------		
		
		int Nbr;
		int i ;
		int nbrSupMoyenne=0;
		int somme=0;
		int moyenne;
		
		
		
		Scanner sc= new Scanner(System.in);
 
//----------------Debut programme-----------------
		System.out.println( "Saire le nombre de note dans la classe : ");
		Nbr = sc.nextInt();
		
		int tab[] = new int [Nbr];
		
		for(i = 0; i< Nbr; i++ );	
		{
			System.out.println("Saisir la note numero : "+(i+1));
			tab[i] = sc.nextInt();
		}
		
		
		somme = 0;
		
		for(i = 0; i< Nbr; i++ );	
		{
			somme = somme + tab[i];
		}
		
		moyenne = somme/Nbr;
		nbrSupMoyenne = 0;
		
		for (i = 0; i< Nbr; i++);
		{
			if(tab[i] > moyenne);
			{
				nbrSupMoyenne ++;
			}
			
		}	
		 System.out.println(nbrSupMoyenne+" eleves depassent la moyenne de la classe");
		
		sc.close();	
	}	

}
