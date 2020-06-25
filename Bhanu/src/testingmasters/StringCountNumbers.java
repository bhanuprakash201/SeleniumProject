package testingmasters;

import java.util.Scanner;
	public class StringCountNumbers {

		public static void main(String[] args) {
		   
System.out.println("Enter String");
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char[] chars=str.toCharArray();
int count=0;
for(char c:chars)
{
	switch(c)
	{
	case '0':
	case '1':
	case '2':
	case '3':
	case '4':
	case '5':
	case '6':
	case '7':
	case '8':
	case '9':
		count++;
		break;
		
	}
	
}
System.out.println("No of digitals in String "+ count);
		}
	}

