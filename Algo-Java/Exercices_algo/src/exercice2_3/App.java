package exercice2_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
	

	int Nombre1;
	int Nombre2;
	int Nombre3;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" Saisir votre premier Nombre : ");
	Nombre1 = sc.nextInt();
	
	System.out.println(" Saisir votre deuxieme Nombre : ");
	Nombre2 = sc.nextInt();
	
	System.out.println(" Saisir votre troisieme Nombre : ");
	Nombre3 = sc.nextInt();
	
		if(Nombre1 <= Nombre2 && Nombre2<= Nombre3)
		{
			System.out.println(Nombre1 +" <" +Nombre2 +" <" +Nombre3);
		}
		
			else if (Nombre1 <= Nombre3 && Nombre3<= Nombre2) 
			{
				System.out.println( Nombre1+ " " +Nombre3 +" "+ Nombre2);
			}
	
			else if (Nombre2 <= Nombre1 && Nombre2<= Nombre3)
			{
				System.out.println( Nombre2 +" " +Nombre1+ " "+ Nombre3);
			}
			
			else if (Nombre2 <= Nombre3 && Nombre3 <= Nombre1)
			{
				System.out.println( Nombre2+ " "+ Nombre3+ " " +Nombre1);
			}			
				
			else if (Nombre3 <= Nombre1 && Nombre1 <= Nombre2)
			{		
				System.out.println( Nombre3 +" "+ Nombre1+ " " +Nombre2);
			}	
						
			else if (Nombre3 <= Nombre2 && Nombre2 <= Nombre1)
			{
				System.out.println( Nombre3 +" " +Nombre2+ " " +Nombre1);
			}
				
	
	sc.close();
	
	}
	
	
}
