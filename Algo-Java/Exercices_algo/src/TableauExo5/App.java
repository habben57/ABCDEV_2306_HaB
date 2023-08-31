package TableauExo5;

//import java.util.Scanner;

public class App {

	public static void main(String[] args) {
//----------Variable---------------
	
			
//----------Debut programme---------
//		Scanner sc = new Scanner(System.in);
			

			int tab1[] =  {4,8,7,9,1,5,4,6};		
			//										
			int tab2[] =  {7,6,5,2,1,3,7,4};

			int tab3 [] = new int[8];				//	Tableau vierge avec 8 entree
													//	pour accueillir le resultat de chaque colonne
			for(int i =0; i < tab1.length; i++)		//	tab1.length = la longueur du tableau1
			{										
				tab3[i] = tab1[i] + tab2[i] ;		
					
			}
			
			for(int i = 0;i < tab1.length;i++)
			{
				System.out.print(tab1[i]+" ");
			}
													//	boucle "for"  pour chaque tableau 
			System.out.println("");					//
			
			for(int i = 0;i < tab2.length;i++)
			{
				System.out.print(tab2[i]+" ");
			}
			System.out.println("");
			
			for(int i = 0;i < tab3.length;i++)
			{
				System.out.print(tab3[i]+" ");
			}
		
//	sc.close();	
		
	}
}
			
