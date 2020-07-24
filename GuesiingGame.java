package consolep;

import javax.swing.JOptionPane;

public class GuesiingGame {
	
 public static void main() {
		int counter = 0;
		
		int comp_no = (int)(Math.random()*100);
		JOptionPane.showMessageDialog(null, "Gues the Magic number. its between 1 and 100"+"\n If you win I send you mobile money"+"\n To quit the game enter #"+"\n you have 6 chances");
		
		while(counter<6) {
			counter++;
			String usr_no = JOptionPane.showInputDialog("Guess the magic number ");
			int usr=Integer.parseInt(usr_no);
					
			
			if(usr==comp_no) {
				JOptionPane.showMessageDialog(null, "WOOOHOOOO"+"\nBINGO"+"\nYOU WIN");
				counter = 10;
			}
			else if(usr>comp_no) {
				JOptionPane.showMessageDialog(null, "Thats Alittle Higher"+"\nTry Again");
			}
			else if(usr<comp_no) {
				JOptionPane.showMessageDialog(null, "Thats Alittle Lower"+"\nTry Again");
			}
		}
		
		
		
		
		
		
	}

}
