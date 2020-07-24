/*Write a program that takes as input given lengths expressed in feet and inches. The
program should then convert and output the lengths in centimeters. Assume that the
lengths given in feet and inches are integers.
Program By Nsookwa Ivan K
*
* PSUDO CODE FOR THE PROGRAM 
* 
*1. Prompt the user for the input. (Without a prompt line, the user will
stare at a blank screen and not know what to do.)
2. Get feet.
3. Prompt the user to enter a value for inches.
4. Get inches.
5. Echo the input by outputting what the program read as input.
(Without this step, after the program has executed, you will not
know what the input was.)
6. Find the length in inches.
7. Output the length in inches.
8. Convert the length to centimeters.
9. Output the length in centimeters.
*
*
*
*/

package consolep;

// import scanner method to get input from the user 
import java.util.Scanner;

public class Convertlength {
	static Scanner console  = new Scanner (System.in);
	
	public static void main(String[] args) {
		// declare the variables 
		int inches;
		int feet; 
		double centimeters;
		int total_inches;
		
		//get the inputs from the user 
		System.out.println("Please Enter  feet: " );
		feet = console.nextInt();
		System.out.println("Please Enter  Inches: ");
		inches = console.nextInt();
		
		System.out.println("The Numbers you have enetered are  "+ " \nFeet: "+ feet + "\nInches: "+inches +" ");
		
		// covert everything to inches and get the toatal number of inches 
		
		 total_inches = (feet * 12)+ inches;     //the feet*12 coverts feet to inches 
		
		//now convert the inches to centimenters by multiplying by 2.54
		centimeters = total_inches * 2.54;
		
		System.out.println("Total Number of Inches: " + total_inches);
		System.out.println("Centmeters : "+ centimeters);
			
		
	}

}
