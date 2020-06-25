package testingmasters;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingEx3 {
	
	public static void readContent(String filepath) throws IOException, InterruptedException
	{		
		//try {			                                       //If we Write Throws try Catch Not Required
			File file = new File(filepath);	
			FileReader fr = new FileReader(file);			
			int i;
			while((i = fr.read()) != -1)
			{
				System.out.print((char) i);	
				Thread.sleep(1000);
			}	
			System.out.print("\n");
		}
		
	/*	catch(Exception e) {
			System.out.println(e.getMessage());			
		}		
	}*/

	public static void main(String[] args) throws IOException, InterruptedException {	
		
		readContent("C:\\Users\\Sandeep\\Desktop\\BHANU201.txt");	
	}
}

