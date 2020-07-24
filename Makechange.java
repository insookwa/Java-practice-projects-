/* 
 * Write a program that takes as input any change expressed in cents. It should then
compute the number of half-dollars, quarters, dimes, nickels, and pennies to be
returned, using as many half-dollars as possible, then quarters, dimes, nickels, and
pennies, in that order. For example, 483 cents would be returned as 9 half-dollars, 1
quarter, 1 nickel, and 3 pennies.*/

//By Nsookwa Ivan K

/*PSUDO CODE FOR THE PROGRAM 
1. Get the change in cents.
2. Find the number of half-dollars.
3. Calculate the remaining change.
4. Find the number of quarters.
5. Calculate the remaining change.
6. Find the number of dimes.
7. Calculate the remaining change.
8. Find the number of nickels.
9. Calculate the remaining change.
10. The remaining change is the number of pennies.
 * */


package consolep;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Makechange {
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int  half_dollars,change,quarters,dimes,nickles,pennies;
		String cents ;

		
		
		
		cents = JOptionPane.showInputDialog("Enter the Change in cents: ");
		int cts= Integer.parseInt(cents);
		half_dollars= cts/50;
		change = cts%50;
		quarters = change/25;
		change= half_dollars%25;
		dimes = change/10;
		change = quarters%10;
		nickles= change/5;
		change = dimes%5;
		pennies = change;
		
		JOptionPane.showMessageDialog(null, "Cents: "+cents+"\nhalf Dollars: "+half_dollars+"\nquarters: "+quarters+"\nDimes: "+dimes+"\nnickles: "+nickles+"\npennies "+pennies);
		System.out.println("cents :"+cents );
		System.out.println("half Dollars :" + half_dollars);
		System.out.println("quarters :" + quarters);
		System.out.println("dimes :" + dimes);
		System.out.println("nickles :" + nickles);
		System.out.println("pennies :" + pennies);
		
		
		
				
		
		
	}

	

}
