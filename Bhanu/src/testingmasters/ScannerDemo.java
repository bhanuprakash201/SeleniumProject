package testingmasters;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		
	System.out.println("Enter the value of a:");
	int a=S.nextInt();
	System.out.println("Enter the value of b:");
	int b=S.nextInt();
	int c=a+b;
	System.out.println("The Resultant Value of a and b is "+c);

	}

}
