package Tableau2;

public class App {
	/*
-----------	TABLEAU 1 -----------------
	 Variables
	 tab1[7] est un tableau d'entier
	i est un entier
Debut du programme
	Debut pour
		pour i allant de 0 à 6
		tab1[i] <-- 0
		i suivant
	Fin pour
Fin du programme
	 

	public static void main(String[] args) {

		int tab1[] = new int[7];
		int i;
S
		for(i = 0;i < tab1.length;i++)
		{
		S	tab1[i] = 2; 
		}

	}S

 }
*/
	//		Variables
//			tab2[6] est un tableau de caractere
//		Debut du programme
//			tab2[0] <-- "a"
//			tab2[1] <-- "e"
//			tab2[2] <-- "i"
//			tab2[3] <-- "o"
//			tab2[4] <-- "u"
//			tab2[5] <-- "y"
//	
	public static void main(String[] args) {
	
		char[] tab2 = new char[6];
		
		tab2[0] = 'a';
		tab2[1] = 'e';
		tab2[2] = 'i';
		tab2[3] = 'o';
		tab2[4] = 'u';
		tab2[5] = 'y';
		
		for(int i = 0; i < tab2.length; i++)
		{
			System.out.println(tab2[i]);
		}
	}
}
