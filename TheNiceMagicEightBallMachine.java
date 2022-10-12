package otherprojects;

import java.util.Random;

public class TheNiceMagicEightBallMachine {
	
	public static void main ( String[] args )
	{
		Random r = new Random();

		int choice = 1 + r.nextInt(30);
		String userresponse = "";

		if ( choice == 1 )
			userresponse = "Yes";
		
		
		else if ( choice == 2 )
			userresponse = "No";
		else if ( choice == 3 )
			userresponse = "Maybe";
		else if ( choice == 4 )
			userresponse = "It seems that way...";
		
		else if ( choice == 5 )
			userresponse = "Uh";
		else if ( choice == 6 )
			userresponse = "As I see it, yes";
		else if ( choice == 7 )
			userresponse = "Don't get your hopes up...";
		
		else if ( choice == 8 )
			userresponse = "The odds are for you.";
		else if ( choice == 9 )
			userresponse = "Double YES";
		else if ( choice == 10 )
			userresponse = "If you think";
		
		else if ( choice == 11 )
			userresponse = "Not sure, not unsure";
		else if ( choice == 12 )
			userresponse = "Try again later...";
		else if ( choice == 13 )
			userresponse = "Its a maybe for now!";
		
		else if ( choice == 14 )
			userresponse = "Unable to respond...try again";
		else if ( choice == 15 )
			userresponse = "Tripe YES";
		else 
			userresponse = "Re-do!";

		System.out.println( "THIS MAGIC 8-BALL SAYS: " + userresponse );
	}

}
