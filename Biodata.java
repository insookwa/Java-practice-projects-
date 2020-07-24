package consolep;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;

import javax.swing.JOptionPane;


public class Biodata {
	static Scanner console = new Scanner(System.in);
	public static void main(String args[]) throws FileNotFoundException
	{
		
		
		
		String firstname , secondname;
		String age;
		String weight;
		char inl , in2;
		
		
//		System.out.println("Please Eneter the first name , second name," + " age amd weight separated"+" by a space ");
//		
//		firstname = JOptionPane.showInputDialog("Enter Your first name ");
//		secondname=JOptionPane.showInputDialog("Enter Your Second name ");
//		age = JOptionPane.showInputDialog("Enter your Age ");
//		weight = JOptionPane.showInputDialog("Enter Your Weight ");
//		inl = firstname.charAt(0);
//		in2 = secondname.charAt(0);
//		
//		JOptionPane.showMessageDialog(null, "First Name: "+firstname + "\nSecond Name: "+secondname+"\nAge: "+age+"\nWeight: "+ weight+"\nInitials: "+inl+in2);
//		
//		//write what you have registered from the dialog boxes
//		
//	
//		try {
//			PrintWriter outFile = new PrintWriter("E:\\2020\\mozy\\java practice\\consolep\\src\\consolep\\write.txt");
//			outFile.println("First Name: "+firstname + "\nSecond Name: "+secondname+"\nAge: "+age+"\nWeight: "+ weight+"\nInitials");
//			System.out.println("file written");
//			outFile.close();
//
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		
//		
//		
//		System.out.println("First Name: "+ firstname);
//		System.out.println("Second Name: "+ secondname);
//		System.out.println("Age: "+ age);
//		System.out.println("weight: "+ weight);
//		System.out.println("Initials: " + inl + in2 );
		
		//File reader code that reads from the text and outputs by a dialog message 
		
		try {
			Scanner inFile = new Scanner(new FileReader("E:\\2020\\mozy\\java practice\\consolep\\src\\consolep\\Read.txt"));
			String fname = inFile.next();
			String sname = inFile.next();
					int ag = inFile.nextInt();
					int workhours = inFile.nextInt();
					double rate = inFile.nextDouble();
					double wages = inFile.nextDouble();
					
					System.out.println(fname);
					
					JOptionPane.showMessageDialog(null, "First name: "+fname+"\nSecond name: "+sname+ "\nage: "+ag+"\nworkhours: "+ workhours+"\nrate: "+rate+ "\nwages "+wages );
					inFile.close();
					
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
