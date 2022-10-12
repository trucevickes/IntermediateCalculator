package otherprojects;

import java.util.Scanner;

public class OlympicSwimmers {
	
	public static void main( String[] args ) throws Exception
    {
		
		Scanner keyboard = new Scanner(System.in);
		
		double minTemperature = 90.0; 
        double curTemperature;
        
        double savedTemperature;
        int swimTime;
        
        
       

        String swimmer1 = "SWIMBOICE";
        String swimmer2 = "ZOOKOOIE";
        String swimmer3 = "PHELPS"; //RESERVED
        String swimmer4 = "LOCHTE"; //RESERVED
        


        System.out.print("Current water temperature? ");
        curTemperature = keyboard.nextDouble();
        savedTemperature = curTemperature; 

        System.out.println( "\nCurrent water temperature is " + curTemperature + "F." );
        System.out.println( swimmer1 + " approaches the lake...." );

        swimTime = 0;
        
        
        while ( curTemperature >= minTemperature )
        {
            System.out.print( "\t" + swimmer1 + " swims for some time." );
            swimTime++;
            System.out.println( " Swim time for current swimmer: " + swimTime + " min(s)." );
            Thread.sleep(600);
            curTemperature -= 0.5;
            System.out.println( "\tCurrent water temperature is now " + curTemperature + "F." );
        }

        System.out.println( swimmer1 + " stopped swimming. Their total swim time was: " + swimTime + " min(s)." );

        curTemperature = savedTemperature;

        System.out.println( "\nCurrent water temperature is " + curTemperature + "F." );
        System.out.println( swimmer2 + " approaches the lake...." );

        swimTime = 0;
        
        
        do
        {
            System.out.print( "\t" + swimmer2 + " swims for some time." );
            swimTime++;
            System.out.println( " Swim time for current swimmer: " + swimTime + " min." );
            Thread.sleep(600);
            curTemperature -= 0.5;
            System.out.println( "\tThe current water temperature is now " + curTemperature + "F." );

        } while ( curTemperature >= minTemperature );

        System.out.println( swimmer2 + " stopped swimming. Their total swim time was: " + swimTime + " min(s)." );
    }

}
