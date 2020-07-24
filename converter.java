package consolep;

import java.util.*;

import javax.swing.JOptionPane;

public class converter {
	static Scanner console = new Scanner(System.in);
	public static void main(String args[]) {
		
		
		
		
		String feet= JOptionPane.showInputDialog("Enter Feet Value ");
		Integer.parseInt(feet);
		String inches= JOptionPane.showInputDialog("Enter inches Value ");
		Integer.parseInt(inches);
		
		JOptionPane.showMessageDialog(null, "feet = " + feet + " inhes = "+inches);
		System.out.println("Feet = " + feet);
		System.out.println("Inches = "+ inches);
				
	}

}
