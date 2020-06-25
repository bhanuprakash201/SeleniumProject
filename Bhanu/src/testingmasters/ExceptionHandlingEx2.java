package testingmasters;

public class ExceptionHandlingEx2 {
	
	static void div(int b) 
	{
		int a = 50;
		try {
			double res = a/b;
			System.out.println("Result is: " + res);			
		}
		
		catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("array inded out of range ");
		}
		
		catch(Exception e) {			
			//e.printStackTrace(); // to print exception details in console
			String msg = e.getMessage();
			System.out.println("Some exeception occured: " + msg);
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] data = {2, 4, 5, 0, 7};
		
		for(int i=0; i<data.length; i++)
		{
			div(data[i]);
		}
		
	}	


}
