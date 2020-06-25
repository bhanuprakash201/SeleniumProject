package testingmasters;

public class ExceptionHandlingArithimatic {
	
public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		
		try {
			double res = a/b;
			System.out.println("Result: " + res);
		}
		
		catch(Exception e)
		{
			System.out.println("Cannot divide by zero");
		}



}
}
