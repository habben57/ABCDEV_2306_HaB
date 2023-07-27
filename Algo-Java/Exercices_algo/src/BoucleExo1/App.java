package BoucleExo1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		

		
	int nombre;
	
	Scanner sc = new Scanner(System.in);
	
	
	do 
		{
		System.out.println("Saisir un nombre entre 1 et 3 :");
		nombre = sc.nextInt();
	//	System.out.println( "Votre nombre n'est pas entre ou egal : 1 et 3");
		}	
	while(nombre < 1 || nombre > 3);
	
	{
		System.out.println( "Votre nombre est entre ou egal : 1 et 3");	
	}
	sc.close();
		
	
		
	}

}
