package exo3_2_Bernabe_Fait_Ses_courses;

import java.util.Scanner;

//		variables
//	
//	somme est un entier
//	moitier est un entier
//	magasin est un boolean
//	reste est un entier
//		
//	debut boucle
//	faire
//	Ecrire "Saisir la somme de depart"
//	Lire somme
//		debut si
//			si reste est superieur a reste plus 1
//			reste = some/2+1 et reste > 1
//			
//			
//	magasin <-- magasin+1	
//	Tant que reste = faux
//	
public class App {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
	
	int NbrMagasin =0;
	Double somme ;
//	Double i;
//	i = somme++;
	
		
		
		if(somme >= 1)			
			{
			while (somme > 0)
				{
					if (somme -((somme / 2)+ 1) >= 0)
					{ 
						System.out.println( somme);
						somme -= (somme/ 2)+1;
					}
					else 
					{
						somme = (double) 0 ;	
					}			
					NbrMagasin ++;
					}
				
			}
		System.out.println("Bernabe est alle dans " +NbrMagasin+" magasins");
			 
		sc . close();

	}

}
