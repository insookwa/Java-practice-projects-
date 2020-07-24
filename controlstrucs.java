package consolep;

import javax.swing.JOptionPane;

public class controlstrucs {
	
	public static void main(String args[]) {
		
		String pymtd = JOptionPane.showInputDialog("Enter Payment method");
		if(pymtd.equals("blink"))
			JOptionPane.showMessageDialog(null, "Youve entered blink pay system ");
		else
			JOptionPane.showMessageDialog(null,pymtd + " Not in the system ");
		
		
		
	}

}
