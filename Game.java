package consolep;

import javax.swing.JOptionPane;

public class Game {

	public static void main(String[] args) {
	int counter = 0;
		boolean done = false;
		
		JOptionPane.showMessageDialog(null, "Gues the Magic number. its between 1 and 100"+"\n If you win I send you mobile money"+"\n To quit the game enter #"+"\n you have 6 chances");
		
		
			
		int comp_no = (int)(Math.random()*100);
		String prompt= JOptionPane.showInputDialog("To continue enter y\n"+"To quit enter #");

				
		while(counter<=6 && prompt.equals("y")) {
			counter++;
	
			
			String usr_no = JOptionPane.showInputDialog("Guess the magic number ");
			int usr=Integer.parseInt(usr_no);
					
			
			if(usr==comp_no) {
				JOptionPane.showMessageDialog(null, "WOOOHOOOO"+"\nBINGO"+"\nYOU WIN");
				JOptionPane.showMessageDialog(null, "NEW GAME");
				
			}
			else if(usr>comp_no) {
				JOptionPane.showMessageDialog(null, "Thats Alittle Higher"+"\nTry Again",6-counter +" times remaining",JOptionPane.INFORMATION_MESSAGE);
			}
			else if(usr<comp_no) {
				JOptionPane.showMessageDialog(null, "Thats Alittle Lower"+"\nTry Again",6-counter +" times remaining",JOptionPane.INFORMATION_MESSAGE);
			}
			
			if(counter==6) {
				JOptionPane.showMessageDialog(null, "THE NUMBER WAS\n"+comp_no);
				JOptionPane.showMessageDialog(null, "NEW GAME");
				
			}
			
		}
		
		
		}
		}

		// TODO Auto-generated method stub

	


