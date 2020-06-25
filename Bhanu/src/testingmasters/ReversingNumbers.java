package testingmasters;

import java.util.Scanner;

public class ReversingNumbers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter array Size");
	
int n=sc.nextInt();

int[] a=new int[n];

System.out.println("Enter the Numbers in array");

for(int i=0;i<a.length;i++)
{

	a[i]=sc.nextInt();

	}
System.out.println("Now Numbers are printing Reverse order");
for(int i=a.length-1;i>=0;i-- )
{
System.out.println(a[i]);
}
}
}