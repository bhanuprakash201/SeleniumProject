package testingmasters;

import java.util.Scanner;

public class Leapyearornot {

	public static void main(String[] args) {
		
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		
		if(n%4==0)
			System.out.println("Given year is leap year");
		else
			System.out.println("Given year is not leap year");


	}

}
