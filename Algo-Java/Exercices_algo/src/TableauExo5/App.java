package TableauExo5;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
//----------Variable---------------
	
		int i;	
//----------Debut programme---------
		Scanner sc = new Scanner(System.in);
			

			int tab1[] =  {4,8,7,9,1,5,4,6};
			int tab2[] =  {7,6,5,2,1,3,7,4};
			System.out.print(tab1[i] + tab2[i]);
			
			
			for(int i = 0; i < tab1.length; i++)
			{
				System.out.print(tab1[i] + tab2[i]+" ");		
			}	
		
	sc.close();	
		
	}
}
			
