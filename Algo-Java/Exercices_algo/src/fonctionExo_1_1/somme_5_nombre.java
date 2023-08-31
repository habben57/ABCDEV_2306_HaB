package fonctionExo_1_1;

import java.util.Scanner;

public class somme_5_nombre {
	
	public static int calculSomme(int nombre1, int nombre2, int nombre3, int nombre4, int nombre5)
	{
		int somme;
		somme = (nombre1 +nombre2+nombre3+nombre4+nombre5);
		
		return somme;
	}


	public static void main(String[] args) {
		
		int nombre1 ;
		int nombre2;
		int nombre3;
		int nombre4;
		int nombre5;
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println(" Saisir nombre1 : ");
		nombre1 = clavier.nextInt();
		System.out.println(" Saisir nombre2 : ");
		nombre2 = clavier.nextInt();
		System.out.println(" Saisir nombre3 : ");
		nombre3 = clavier.nextInt();
		System.out.println(" Saisir nombre4 : ");
		nombre4 = clavier.nextInt();
		System.out.println(" Saisir nombre5 : ");
		nombre5 = clavier.nextInt();
		
		System.out.println(" La somme des nombre est  : "+calculSomme( nombre1,  nombre2,  nombre3,  nombre4,  nombre5));
		
		
		clavier.close();
	}

}
