package testingmasters;

public class Arrays {

	public static void main(String[] args) {
		String[] S1= {"BHANU","GOWtham","sandeep"};
		//String count Start from 0,1,2 so we are Writing code Length-1
		for(int i=0;i<=S1.length-1;i++)
		System.out.println(S1[i]);
		
		String test="Bhanu is going to Testing Masters institute for Coaching";
		System.out.println(test.toUpperCase());
		System.out.println(test.toLowerCase());
		System.out.println(test.indexOf("Masters"));


	}

}
