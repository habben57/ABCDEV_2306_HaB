package TableauExo3;

import java.util.Scanner;

public class App {

/*		Déclaration variables
 * int est un tableau d entier
 * int Nbr est un entier
 * int positif est un entier
 * int negatif est un entier
 * 		
 *-------	debut programme ---------
 * 
 * debut pour
 * 	Pour i allant de 0 a Nbr
 * 	tableau[i] <-- 0
 * 	i suivant
 * fin pour
 * 
 * Ecrire "Saisir le nombre de chiffre dans votre tableau"
 * Lire <-- Nbr
 * i = Nbr
 * 
 * Pour 
 * Si Nbr > 0
 * 	Alors positif = positif ++
 * 	SiNon negatif = negatif ++
 * Fin si
 * Ecrire " le nombre de positif est " +positif+" et le nombre de negatif est "+negatif )
 * 
 */
	
	
	
	public static void main(String[] args) {
	
		int Nbr;
		int positif =0;
		int i =0;
		int negatif =0;
		
		Scanner sc = new Scanner(System.in);
		
//		debut programme
		System.out.println(" Saisir le nombre de chiffre que vous voulez stocker dans le tableau : ");
		Nbr = sc.nextInt();

		
		int []tab3 = new int[ Nbr];
		for( i = 0; i< Nbr; i++)
		{
			System.out.println("Saisur un nombre "+(i+1)+" :");
			tab3[i] = sc.nextInt();
		
			if (tab3[i] < 0)
			{
			negatif ++;
			}
			else  
			{
			positif ++;
			}
		
		}
		
		System.out.println(" "+negatif+" nombre(s) negatif et "+positif+ " nombre(s) positif");
	
		sc.close();
	}	

}
