package tableauExo8;

import java.util.Scanner;

public class App {

//		Ecrivez un algorithme permettant, toujours sur le même principe, à l’utilisateur de saisir un nombre 
//		déterminé de valeurs. Le programme, une fois la saisie terminée, renvoie la plus grande valeur en précisant 
//		quelle position elle occupe dans le tableau. On prendra soin d’effectuer la saisie dans un premier temps, et 
//		la recherche de la plus grande valeur du tableau dans un second temps.

	public static void main(String[] args) {

//-------------------Pseudo code----------------
/**	
 * 		Variables
 NB est un entier
	i est un entier
	plusGrand est un entier
 tab[] est un tableau d’entier
Debut du programme
 Ecrire « Saisir le nombre de valeur du tableau : »
	Lire nb
 tab[] <-- onglet[nb]
Debut pour
	Pour i allant de 0 à nb - 1
 Ecrire « Saisir le nombre n° « ,i+1
		Lire tab[i]
	i Suivant
Fin pour
	posMax <-- 0
Debut pour
	pour i allant de 0 à nb-1
 Débuts Si
		Si tab[i] > tab[posMax]
		Alors posMax <-- i
	Fin Si
	i suivant
Fin pour
 Ecrire « Le nombre le plus grand : « ,tab[posMax]
 Ecrire « il est à l’index : « ,posMax
Fin du programme
 */
		
		
		
//	--------------declaration variable----------------
		int Nbr = -   1 ;
		int i;
		int plusGrand=0 ;
		int position = 0;
	
		Scanner sc = new Scanner(System.in);
		
//-----------Debut programme-------------
		
		System.out.println( " Saisir le nombre de chiffre dans votre tableau : ");
		Nbr = sc.nextInt();
		
		int tab[] = new int[ Nbr];
		
		for( i=0 ; i <Nbr; i++)
		{
			System.out.println(" Saisir le nombre   " +(i+1)+" : ");
			tab[i] = sc.nextInt();
			
			for (i=0; i<Nbr-1; i++)
			{
				if (plusGrand < tab[i]);
			}
			
			plusGrand = tab[i];
			i = position;
			position++;
			
		}
			
		
		System.out.println(" Le nombre le plus grand est :  "+plusGrand);
		
		System.out.println(" Il se trouve a l'index : " + position);
		
		
	sc.close();	
		
	}

}
