package ArthimeticCalc;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		double num1;
		double num2;
		double ans;
		char operation;
		
		Scanner reader = new Scanner(System.in);
		
	    System.out.print("Enter first number: ");
	    num1 = reader.nextDouble();
	    
	    System.out.print("Enter second  number: ");
	    num2 = reader.nextDouble();
	    
	    System.out.print("\nEnter an operator (+, -, *, /): ");
	    operation = reader.next().charAt(0);
	    
	    switch(operation) {
	    
	         case '+': ans = num1 + num2;
	            break;
	            
	         case '-': ans = num1 - num2;
	            break;
	            
	         case '*': ans = num1 * num2;
	            break;
	            
	         case '/': ans = num1 / num2;
	            break;
	            
	      default: System.out.printf("Error! Enter correct operator");
	         return;
	      }
	      System.out.print("\nThe result is given as follows:\n");
	      
	      System.out.printf(num1 + " " + operation + " " + num2 + " = " + ans);
		

	}

}
