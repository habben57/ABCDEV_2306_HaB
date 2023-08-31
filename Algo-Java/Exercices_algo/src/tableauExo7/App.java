package tableauExo7;

import java.util.Scanner;

public class App {

//	Ecrivez un algorithme permettant à l’utilisateur de saisir un nombre quelconque de valeurs, qui devront 
//	être stockées dans un tableau. L’utilisateur doit donc commencer par entrer le nombre de valeurs qu’il 
//	compte saisir.
//	Toutes les valeurs doivent être ensuite augmentées de 1, et le nouveau tableau sera affiché à l’écran.
	
	public static void main(String[] args) {
	
// -----------declaration variable-----------		
	int Nbr;
	int i;
	Scanner sc = new Scanner(System.in);

	
//	------------debut programme---------------
	System.out.println(" Saisir le nombre de chiffre que vous voulez stocker dans le tableau : ");
		Nbr = sc.nextInt();
	
		int []tab1 = new int[Nbr];
		int []tab2 = new int [Nbr];
	
	
	for( i = 0; i< Nbr; i++)
	
		{	
			System.out.println(" Saisir un nombre " +(i+1)+" :");
			tab1[i]= sc.nextInt();
		}
	
	for( i = 0;i< tab2.length; i++)
		
		{
			tab2[i] = tab1[i]+1;
			System.out.print(tab2[i]+" - " );
		}
				
			
	
	
	
	sc.close();
	}

}
