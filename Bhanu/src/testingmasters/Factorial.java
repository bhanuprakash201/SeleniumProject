package testingmasters;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		long Factorial=1;
		
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();

int i=1;
while(i<=n)
{
Factorial *=i;
i++;
}
System.out.println(Factorial);
	}

}
