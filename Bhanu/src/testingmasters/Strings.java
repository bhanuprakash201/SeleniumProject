package testingmasters;

public class Strings {

	public static void main(String[] args) {
		
		//Length
		
		String str1="Bhanu Prakash Chintha DevelopYou Technologies";
		int n=str1.length();
		System.out.println(n);
		
		//Replace
		
		String str2="Bhanu Prakash Chintha DevelopYou Technologies";
		str2=str2.replace("DevelopYou Technologies","Testing Masters");
		System.out.println(str2);

		//contains
		String str3="Bhanu Prakash Chintha DevelopYou Technologies";
		boolean b=str3.contains("DevelopYou");
		
		if(b)
			System.out.println("exist");
		else
			System.out.println("not exist");
		//split
		String str4="Bhanu Prakash Chintha DevelopYou Technologies";
        String[] arr1 = str4.split("Bhanu");
		
		for(String s : arr1)
		System.out.println(s);
		
		//It will Print pwd inside xxxxx
		String str5 = "New Password is: xxxxx";
		String[] arr2 = str5.split(":");
		String pwd = arr2[1].trim();
		System.out.println(pwd);

		//Substring
				String str6= "Bhanu Prakash Chintha DevelopYou Technologies";
				String s1 = str6.substring(0, 7);
				String s2 = str6.substring(8);
				System.out.println(s1);
				System.out.println(s2);
				
				//ContentEqual
				String s3 = "Bhanu";
				String s4 = "bhanu";
				
				if(s3.equalsIgnoreCase(s4))//if(s1.contentEquals(s2))//if (s1.equals(s2))
					System.out.println("both are same");
				else
					System.out.println("both are not same");
				// Note: contentEquals is used to compare plain text. equals is used to compare text, collections, objects..
				// both are case sensitive(exact match)
				// where as equalsIgnoreCase is case insensitive
				
				String str7= "Bhanu Prakash Chintha DevelopYou Technologies";
				System.out.println(str7.toLowerCase());
				System.out.println(str7.toUpperCase());
				
				// trim is used to remove spaces at beginning and end of the text		
				String str8= "      Bhanu Prakash Chintha DevelopYou Technologies       ";
				System.out.println(str8);
				System.out.println(str8.trim());
				
				//charAt		
				String s = "Bhanu Prakash Chintha DevelopYou Technologies";
				char c = s.charAt(4);               //Start From Zero
				System.out.println(c);
				
				

	}

}
