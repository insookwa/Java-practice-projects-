package consolep;

import javax.swing.JOptionPane;

public class Cablecompanybilling {
	static String noPchannels;
	static String Ccode;
	public static void main(String args[]) {
		 
		Ccode = JOptionPane.showInputDialog("Enter your customer code ");
		char Ctype = Ccode.charAt(0);
		 noPchannels = JOptionPane.showInputDialog("Enter number of Premium channels subscribed ");
		
		
		switch(Ctype) {
		
		case 'R':
		case 'r':
			residential();
			break;
		case 'B':
		case 'b':
			business();
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "WRONG ACOUNT NUMBER ");
			
			
			
		}
		
		
		

		
	}
	
	static void residential(){
		
		final double bil_processingFee = 4.50;
		final double bservice_fee = 20.50;
		final double pChannelCost=7.50;
		
		double amount_due = bil_processingFee + bservice_fee+(pChannelCost*Double.parseDouble(noPchannels)); 
	JOptionPane.showMessageDialog(null, "Account Number: "+Ccode + "\n Amount Due: "+"$"+ amount_due);
	
		
		
	}
	
	static void business() {
		final double bil_processingFee = 15.00;
		final double bservice_fee = 75.00;
		final double pChannelCost=50.00;
		String noBasiccons = JOptionPane.showInputDialog("Enter number of basic service connections ");
		double amount_due;
		
		if(Integer.parseInt(noBasiccons)>10) {
			amount_due= bil_processingFee +bservice_fee+ bservice_fee*(Integer.parseInt(noBasiccons)-10)+(pChannelCost*Double.parseDouble(noPchannels));
			JOptionPane.showMessageDialog(null, "Account Number: "+Ccode + "\n Amount Due: "+"$"+ amount_due);
			
		}
		else {
			amount_due = bil_processingFee + bservice_fee+(pChannelCost*Double.parseDouble(noPchannels));
			JOptionPane.showMessageDialog(null, "Account Number: "+Ccode + "\n Amount Due: "+"$"+ amount_due);
		}

		
	}
}
