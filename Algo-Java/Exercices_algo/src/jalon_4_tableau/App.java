package jalon_4_tableau;

import java.util.Scanner;

public class App {

	

	public static void main(String[] args) {
		
//-----------Variables-------

  int position;
  int nb;
  String resultat;
  long nbPrecedent;
  long nbCourant;
  long nbSuivant;

//  -------Debut programme-------
  	Scanner sc = new Scanner(System.in);
  
  	System.out.println("Combien de nombre de Fibonacci souhaitez-vous affiché  ?: ");
  	nb = sc.nextInt();
  	
//  	---------initialisation variable----------
  	position = 2;
  	resultat ="\t0\n\t1"; //( \t 0\n\t1 pour la case 0 , 1 et la suivante)    et (\t retour ligne  et \n pour retrait ligne)
  	nbPrecedent = 0;
  	nbCourant =1;
  		
  	if (nb > 2)
  	{
  	while(position < nb)
  			
  		{ nbSuivant = nbPrecedent + nbCourant;
 		 resultat = resultat+" - "+nbSuivant;      //    "\t0\n\t1"   si on veut un nombre en dessous de l autre
  		 nbPrecedent = nbCourant;
  		 nbCourant = nbSuivant;
  		 position =  position + 1;	
  		
  		}
  		
  	}
  	else
  	{
  		nb = 2;
  	}
  	
 		System.out.print("les "+ nb+" premiers de la suite de Fibonacci sont\n"+ resultat);			
  		

  	sc.close();
  	
  					
	}

}
