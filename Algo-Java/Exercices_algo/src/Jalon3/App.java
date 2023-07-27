package Jalon3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	/*
	 * variable
	 * nombre est un entier
	 * i est un entier
	 * debut programme
	 * nombre<-- 0
	 * ecrire"saisir votre nombre"
	 *  si nombre true
	 *  lire nombre
	 * tant que nombre < 10
	 * debut tant que 
	 * alors (i=0, i=10, i*)
	 * fin tant que
	 * ecrire "avez vous un autre nombre ,)
	 * alors 
	 * 
	 * 
	 * 
	*/
		
		
//		int nombre = 0;
//		int i ;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		
//		System.out.println(" Saisir un nombre : ");
//		nombre= sc.nextInt();
//		
//		System.out.println(" table de multiplication :");
//		for(i=0; i<=10; i++);
//		{
//			nombre = nombre*i;
//			System.out.println (i +"nombre    );
//		
		int nombre = 0;
		int i ;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" Saisir un nombre : ");
		nombre= sc.nextInt();
		
		System.out.println(" table de multiplication :");
		for(i=0; i<=10; i++);
		{ 
			System.out.println (i + " X "+nombre +" = "  + i*nombre  );
		
		}
		
	sc . close();
		
		
	}

}
