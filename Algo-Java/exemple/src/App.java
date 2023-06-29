
public class App {
	
	public static void main(String[] args) {
		
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
		    Ecrire "le résultat de Ladresse Mail pour ",Prenom, Nom, Code Postal, @arfp.asso.fr, Resultat
		Fin programme
		 */
	
	public class App {

			public static void main(String[] args) {
				
				// declaration des variables
				
				Prénom est un entier
			    Nom est un entier
			    CodePostal est un entier
			    AdresseMail est un In
				Scanner sc;
				sc = new Scanner(System.in);
				
				//Scanner sc = new Scanner(System.in);
				
				System.out.println("Saisir votre Prénom ");
				Prénom = sc.nextInt();
				
				System.out.println("Saisir votre Nom ");
				Nom = sc.nextInt();
				
				System.out.println("Saisir votre Code Postal ");
				CodePostal = sc.println();
				
				resultat1 = Prenom + Nom + CodePostal + @arfp.asso.fr ;
				resultat2 = Prenom + CodePostal + Nom +  + @arfp.asso.fr ;
				
				System.out.println("Votre adresse Mail est "+
						Prenom + Nom + CodePostal + @arfp.asso.fr + " ou " Prenom + CodePostal + Nom +  @arfp.asso.fr + 
									 
									resultat);
				
				System.out.println("Le resultat de l'addition de "+
						nombre1 +" et "+ nombre2 + " est "+
						resultat);
				
				
				sc.close();
	}

}
