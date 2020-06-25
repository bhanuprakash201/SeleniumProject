package testingmasters;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
	   
	     int count=0;
	        for(int i = 2; i <= n/2; ++i)
	        {
	  
	            if(n % i == 0)
	       
	               count++;
	            
	        }
	        System.out.println(count);

	        if(count==0)
	            System.out.println(n + " is a prime number.");
	        else
	            System.out.println(n + " is not a prime number.");
	    }
}

