package testingmasters;

public class StringBufferEx1 {
	

		public static void main(String[] args) {
			
			String s = "DevelopYou Technologies";
			StringBuffer sb = new StringBuffer(s);
			
			
			String s1 = "Develop";
			System.out.println(s1);
			System.out.println(s1.concat("You"));
			System.out.println(s1);                      //s1 is Develop only
			
			System.out.println("StringBuffer Results: ");
			
			StringBuffer sb1 = new StringBuffer(s1);
			System.out.println(sb1);
			System.out.println(sb1.append("You"));             //sb1 value stored "DevelopYou" Permanent
			System.out.println(sb1);
		
			
			String s2 = "Develop Technologies";
			StringBuffer sb2 = new StringBuffer(s2);
			sb1.insert(7, "You");                        //After 7th Digit You will Print
			System.out.println(sb2);	
			
			
			/* Out puts
			 
		    Develop
			DevelopYou
			Develop
			StringBuffer Results: 
			Develop
			DevelopYou
			DevelopYou
			Develop Technologies           */
			
		}

		}

