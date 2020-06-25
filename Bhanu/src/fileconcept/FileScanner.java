package fileconcept;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {

	public static void main(String[] args) {
		
		try
		{
			
	
		File file=new File("C:\\Users\\Sandeep\\Desktop\\BHANU201.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNext())
		{
		String data=sc.nextLine();
		System.out.println(data);
		}
		sc.close();
	}
		catch(FileNotFoundException e)
		{
			System.out.println("An Error Occurd due tp file not Avaliable");
			//e.printStackTrace();
		}
		

}
}
