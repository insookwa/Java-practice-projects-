package consolep;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Readfile {
	
	
	public static void main() {
		
		try {
			Scanner inFile = new Scanner(new FileReader("Employees.txt"));
			
			String firstname = inFile.next();
			String secondname = inFile.next();
					int age = inFile.nextInt();
					int workhours = inFile.nextInt();
					double rate = inFile.nextDouble();
					double wages = inFile.nextDouble();
					
					JOptionPane.showMessageDialog(null, "First name: "+firstname+"\nSecond name: "+secondname+ "\nage"+age+"\nworkhours: "+ workhours+"\nrate: "+rate+ "\nwages "+wages );
					
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
