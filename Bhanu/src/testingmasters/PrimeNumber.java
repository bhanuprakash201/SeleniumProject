package testingmasters;

public class PrimeNumber {

	public static void main(String[] args) {
	        for(int i = 2; i <=50; i++)
	        {
         int count=0;
				for(int j=2;j<=i/2;j++)
	        	{
	        		if(i%j==0)
	        		{
	        			count++;
	        			break;
	        			
	        	}
	        		
	        	}
		
	        	if(count==0)
	        		System.out.println(i+ "this is prime number");
	        	else
	        		System.out.println(i+"Not Prime Number");
	        }
}
}

			
		

	
