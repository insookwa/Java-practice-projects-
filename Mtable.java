package consolep;
import java.util.Scanner;

public class Mtable {

	public static void main() 
	{
		bankaccount obj1 = new bankaccount("Nsookwa Ivan","NIK0938484");
		obj1.showMenue();
		
	}
}



	
	class bankaccount
	{
		
		int balance;
		int previousTransaction;
		String customersName;
		String CustomerID;
		char option;
		Scanner console = new Scanner(System.in);        
		
		bankaccount(String cname, String cid)// constructor 
		{
			customersName = cname;
			CustomerID = cid;
			
		}
		
		void deposit(int amount)
		{
			if(amount !=0) {
			balance = amount + balance ;
			previousTransaction =  amount;
			}
						
		}
		
		void withdraw(int amount) 
		{
			if(amount != 0)
			{
			
				balance = balance - amount;
				previousTransaction = amount;
			}
			
		}
		
		void getPreviousTransaction() 
		{
			if (previousTransaction>0) 
			{
				System.out.println("Deposited "+ previousTransaction);
			}
			else if(previousTransaction<0) 
			{
				System.out.println("Withdrew "+ Math.abs(previousTransaction) );
			}
			else 
			{
				System.out.println("No transaction Occurres");
			}
		}
		
		void showMenue() 
		{
			System.out.println("Welcome " + customersName +" to iSuzie Bank Uganda ");
			System.out.println("Your Customers ID is  " + CustomerID);
			System.out.println("***********************************");
			System.out.println("Enter D to deposit");
			System.out.println("Enter W to withdraw");
			System.out.println("Enter B to Check Balance");
			System.out.println("Enter p to see previous transactions");
			System.out.println("Enter E to Exit ");
			
			
			do
			{
				System.out.println("------------------------------------");
				System.out.println("Enter an option ");
				System.out.println("************************************");
				option = console.next().charAt(0);
				System.out.println("\n");
				
				switch(option) 
				{
				case 'D':
					System.out.println("************************************");
					System.out.println("Enter Amount to deposit");
					int amount = console.nextInt();
					deposit(amount);
					System.out.println("************************************");
					System.out.println("\n");
					break;
					
				case 'W':
					System.out.println("************************************");
					System.out.println("Enter amount to withdraw");
					amount = console.nextInt();
					withdraw(amount);
					System.out.println("************************************");
					System.out.println("\n");
					break;
				case 'B':
					System.out.println("************************************");
					System.out.println("Your  current balance is "+balance);
					System.out.println("************************************");
					System.out.println("\n");
					break;
				case 'P':
					System.out.println("************************************");
					getPreviousTransaction();
					System.out.println("************************************");	
					break;
				case 'E':
					System.out.println("************************************");
					break;
					
					default:
					System.out.println("Invalid option  .Please  Try again!!");
					break;
				}
				
				
				
			}
			while(option != 'T');
			
			System.out.println("Thank you for banking with us ");
			
		}
		
			
	}

	
	

