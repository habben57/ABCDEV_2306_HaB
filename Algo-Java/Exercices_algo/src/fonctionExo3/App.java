package fonctionExo3;

import java.util.Scanner;

public class App {

//	Ecrire et utiliser une fonction calculant la moyenne de 2 nombres
	
	
	
	public static void moyenne(double a, double b) 
	{
		double calculMoyenne;
		calculMoyenne = (a+b)/2;
	
		System.out.println(" La moyenne des deux nombres est : " +calculMoyenne);
		
	}
	
	public static void main(String[] args) {
		
		double a;
		double b;

	Scanner sc = new Scanner(System.in);
	
	System.out.println(" Saisir le premier chiffre :");
	a =sc.nextInt();
	
	System.out.println(" Saisir le deuxieme chiffre :");
	b =sc.nextInt();
	
	moyenne(a,b);
	
	
	sc.close();
	
	}

}
