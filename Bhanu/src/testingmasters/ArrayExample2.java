package testingmasters;

import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

System.out.println("Enter Array Size");
int n=sc.nextInt();
String[] cities=new String[n];


System.out.println("Enter city Names");
for(int i=0;i<cities.length;i++)
{
cities[i]=sc.next();
	}
System.out.println("Diplay Names");
for(String city:cities )
{
		
	System.out.println(city);
}
	}
}
