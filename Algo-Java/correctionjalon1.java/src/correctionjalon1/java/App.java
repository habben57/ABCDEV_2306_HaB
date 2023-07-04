package correctionjalon1.java;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaration des variables		
					String Prenom; 
				    String Nom; 
				    int dept;
				    String mail1;
				    String mail2;
				   
					
				    Scanner sc = new Scanner(System.in);
					
					
					
					System.out.println("Saisir votre Prénom : ");
					Prenom = sc.nextLine();
					
					System.out.println("Saisir votre Nom : ");
					Nom = sc.nextLine();
					
					System.out.println("Saisir votre Code Postal : ");
					dept = sc.nextint();
					
					mail1 = prenom + "." + nom + dept + "@arfp.asso.fr";
					mail2 = nom + dept + prenom + "@arfp.asso.fr";
					
					
					
					System.out.println("Mail 1 : " + mail + " et Mail 2 : " + mail2;
							
					
					sc.close();

		
	}

}


	/*
	 VARIABLE
	    Prénom est un entier
	    Nom est un entier
	    CodePostal est un entier
	    AdresseMail est un In
	Debut programme
	    Ecrire "Saisir votre Prénom"
	    Lire <-- Prénom
	    Ecrire "Saisir votre Nom"
	    Lire <-- Nom
	    Ecrire "Saisir Code Postal"
	    Lire <-- Code Postal
	    Resultat <-- Prénom + Nom + Code Postal + @arfp.asso.fr
	    Ecrire "le résultat de L adresse Mail pour ",Prenom, Nom, Code Postal, @arfp.asso.fr, " ou " Resultat
	Fin programme
	 */



