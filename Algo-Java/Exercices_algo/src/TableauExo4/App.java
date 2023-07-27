package TableauExo4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
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
		 * Ecrire " le nombre de positif est " +positif+" et le nombre de negatif est "+negatif 
		 * 
		 * ----------SOMME DES NOMBRES DANS TABLEAU--------------------------
		 * Pour j allant de 0 a Nbr
		 * tableau[j] <-- 0
		 * j suivant
		 * fin pour
		 * 
		 * Ecrire " La somme des entiers du tableau est : "+Somme
		 */
			
			
			
//	---------Variables----------------	
				int nombre =0;
				int positif =0;
				int i =0;
				int negatif =0;
				int somme =0;
//				int j =0;
				
				Scanner sc = new Scanner(System.in);
				
//	----------Debut programme---------
				System.out.println(" Saisir le nombre de chiffre que vous voulez stocker dans le tableau : ");
				nombre = sc.nextInt();
			
				
				
				int []tab4 = new int[ nombre];
				for( i = 0; i< nombre; i++)
				{
					System.out.println("Saisir le nombre "+(i+1)+" :");
					tab4[i] = sc.nextInt();
				
					if (tab4[i] < 0)
					{
					negatif ++;
					}
					else  
					{
					positif ++;
					}
				}

				for(int j =0; j<tab4.length; j++)
				{
					somme += tab4[j];
				}
				
				 
				
				
				System.out.println(" "+negatif+" nombre(s) negatif et "+positif+ " nombre(s) positif");
				System.out.println(" La somme des entiers du tableau est : "+somme);
				sc.close();

	}

}
