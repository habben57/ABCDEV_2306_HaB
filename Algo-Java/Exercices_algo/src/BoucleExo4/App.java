package BoucleExo4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombre ;
		int i ;
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Saisir votre nombre");
		nombre = sc.nextInt();
		
		System.out.println(" Somme des nombre : ");
		for(i=1; i<=nombre; i++)       //i=1 depart  i=<=10  nombre de fois   i++ (i plus 1 a chaque fois)
		
			{
		nombre =1;
		System.out.println(nombre +(nombre +1) );
			}
		
	sc.close ();

	}

}
