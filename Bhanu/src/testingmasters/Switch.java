package testingmasters;

import java.util.Scanner;

public class Switch {

		public static void main(String[] args) {
			System.out.println("Enter the numbers between 1 to 7");

		Scanner S=new Scanner(System.in);
			int A=S.nextInt();
			
			switch(A)
			{
				case 1:System.out.println("Sunday");
				break;
				case 2:System.out.println("Monday");
				break;
				case 3:System.out.println("Thusday");
				break;
				case 4:System.out.println("Wednesday");
				break;
				case 5:System.out.println("Thursday");
				break;
				case 6:System.out.println("Friday");
				break;
				case 7:System.out.println("Saturday");
				break;
				default: System.out.println("Given data is incorrect");
				break;	
			}
			System.out.println(A);


	}

}
