package consolep;


import java.io.*;
import java.util.Scanner;

public class Eofwhile {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int num ;
				int sum = 0;
		
		while(console.hasNext()) {
			
			num = console.nextInt();
			sum =sum+num;
			System.out.println(sum);
			
		}
		
		try {
			Scanner InFile = new Scanner(new FileReader("E:\\2020\\mozy\\java practice\\consolep\\src\\consolep\\Read.txt"));
			PrintWriter outFile = new PrintWriter("E:\\2020\\mozy\\java practice\\consolep\\src\\consolep\\write.txt");
			
			String firstName,lastName;
			double testScore ,classAverage,summ = 0;
			char grade = ' ';
			int count = 0;
			
			while(InFile.hasNext()) {
				
				firstName= InFile.next();
				lastName = InFile.next();
				testScore=InFile.nextDouble();
				
				summ = summ+testScore;
				count++;
				
				switch((int)testScore/10) {
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
					grade='F';
					break;
				case 6:
					grade='D';
					break;
				case 7:
					grade='C';
					break;
				case 8:
					grade = 'B';
					break;
				case 9:
				case 10:
					grade = 'A';
				break;
				
				default:
					System.out.println("Invalid Score");
				
				}
				
				outFile.printf("%-12s %-12s %4.2f %c %n",firstName,lastName,testScore,grade);
				System.out.println(firstName);
				System.out.println(lastName);
				System.out.println(testScore);
				System.out.println(grade);
			}
			
			
			
			outFile.println();
			if(count!=0)
				outFile.printf("class average: %.2f %n",summ/count);
			else 
				outFile.println("No Data");
			outFile.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
