package correction_jalon_algo_niveau1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Déclaration variables
		String prenom; 
	    String nom; 
	    int dept;
	    String mail1;
	    String mail2;
	   
		
	    Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Saisir votre Prénom : ");
		prenom = sc.nextLine();
		
		System.out.println("Saisir votre Nom : ");
		nom = sc.nextLine();
		
		System.out.println("Saisir votre Code Postal : ");
		dept = sc.nextInt();
		
		mail1 = prenom + "." + nom + dept + "@arfp.asso.fr";
		mail2 = nom + dept + prenom + "@arfp.asso.fr";
		
		
		
		System.out.println("Mail 1 : " + mail1 + " et Mail 2 : " + mail2);
				
		
		sc.close();

	}

}
