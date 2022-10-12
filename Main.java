package intermediatecalculator1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

	    char setfunction;
	    Double firstnumber, secondnumber, result;


	    System.out.println("Add +, subtract -, multiply *, or divide /");
	    setfunction = input.next().charAt(0);

	    System.out.println("Number I: ");
	    firstnumber = input.nextDouble();

	    System.out.println("Number II: ");
	    secondnumber = input.nextDouble();

	    switch (setfunction) {

	      case '+':
	        result = firstnumber + secondnumber;
	        System.out.println(firstnumber + " + " + secondnumber + " = " + result);
	        break;

	      case '-':
	        result = firstnumber - secondnumber;
	        System.out.println(firstnumber + " - " + secondnumber + " = " + result);
	        break;

	      case '*':
	        result = firstnumber * secondnumber;
	        System.out.println(firstnumber + " * " + secondnumber + " = " + result);
	        break;

	      case '/':
	        result = firstnumber / secondnumber;
	        System.out.println(firstnumber + " / " + secondnumber + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    input.close();
	  }

}
