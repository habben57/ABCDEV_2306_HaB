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
		}	
	while(nombre < 1 || nombre > 3);
	
	sc.close();
		
	
		
	}

}
