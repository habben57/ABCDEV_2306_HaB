package essai1;

import java.util.Date;

public class essai1 {

	public static void main(String[] args) {
		
		System.out.println("hello Habib!");
		
		//get the current system date
		 
		Date currentDate = new Date();
		
		System.out.println("current day is -> " + currentDate.getDay());
		System.out.println("current Month is -> " + currentDate.getMonth() );
		System.out.println("current Year is -> " + currentDate.getYear() );
	}

}
