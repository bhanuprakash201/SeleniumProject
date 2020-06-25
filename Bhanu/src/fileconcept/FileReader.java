package fileconcept;

import java.io.File;

public class FileReader {

	public static void main(String[] args) {
		
		try
		{
			File file=new File ("C:\\Users\\Sandeep\\Desktop\\BHANU202.txt");
			if(file.exists())
				System.out.println("File Already Exists "+ file.getName());
			else
			{
				System.out.println("File not Avaiable Now it will Create");
				file.createNewFile();
				System.out.println("File Created "+ file.getName());
			}
				
			
		}
		catch(Exception e)
		{
			System.out.println("An Error Occured");
			e.printStackTrace();
			
		}

	}

}
