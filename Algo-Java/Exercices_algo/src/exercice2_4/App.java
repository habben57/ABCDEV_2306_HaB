package exercice2_4;

/*
 *Condition
 *A est un entier
 *début Si
 *	Ecrire "Saisir votre Année"
 *	Lire <-- Année
 *début Si
 *	Si 
 *		Année est divisible par 4 et Année n'est pas divible par 100 ou Année est divible par 400
 *	Alors
 *		Ecrire " Votre année est une année bissextile"
 *	SiNon
 *		Ecrire " Votre année n'est pas bissextile"
 */
 
 
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		int A;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Saisir votre Année : ");
		A = sc.nextInt();

		if (((A%4==0)&&(A%100 !=0)) || (A%400==0))
			
		{	
			System.out.println(" L'année "+ A +" est bissextile ");
		}	
		
		else
		{
			System.out.println(" L'année " + A + " n'est pas bissextile");
		}
		
		sc.close();
	}

}
