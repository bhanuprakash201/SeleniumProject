package testingmasters;

import java.util.Scanner;

public class FORLOOPTABLE {

	public static void main(String[] args) {
		
		Scanner S=new Scanner(System.in);
		
		System.out.println("Enter the value of n");
		

		int a=S.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int n=a*i;
	
			System.out.println(a+"X"+i+"="+n);
		}


		

	}

}
