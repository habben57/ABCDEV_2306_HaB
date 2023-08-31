package fonctioExo3;

import java.util.Scanner;

public class App {

/**		FONCTION reel calculMoyenne(reel a, reel b)
 			moyenne est un reel
 			moyenne <-- (a+b)/2
 			retourne moyenne
 		FINFONCTION
 		VARIABLES
 			nombre1 est un reel
 			nombre2 est un reel
 		DEBUT DU PROGRAMME
 			Ecrire " Saisir le 1er nombre"
 			Lire nombre1
 			Ecrire "Saisir le 2eme nombre"
 			Lire nombre2
 			Ecrire " La moyenne des 2 nombres est : ",moyenne(nombre1,nombre2)
 		FIN DU PROGRAMME
 */
	
	public static double calculMoyenne(double a, double b)
	{
		double moyenne;
		moyenne = (a+b)/2;
		
		return moyenne;
	}
	
	public static void main(String[] args) {
	
//		-----variable----
		double nombre1;
		double nombre2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le premier nombre");
		nombre1 = sc.nextDouble();

		System.out.println("Saisir le deuxieme nombre");
		nombre2 = sc.nextDouble();
		
		System.out.println(" La moyenne des deux nombres est : "+calculMoyenne(nombre1,nombre2));
		
		
	 sc.close();
	 
	}

}
