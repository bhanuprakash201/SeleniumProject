package fileconcept;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class FilleReaderWriter {

	public static void main(String[] args) throws IOException {
		
		FileReader fr=null;
		FileWriter fw=null;
		try
		{
			fr=new FileReader("C:\\Users\\Sandeep\\Desktop\\BHANU202.txt");
			fw=new FileWriter("C:\\Users\\Sandeep\\Desktop\\BHANU201.txt");
			
			int c;
			while((c=fr.read())!=-1)
			{
				fw.write(c);
			}
			
		}
		catch(IOException e)
		{
			System.out.println("IO Exception Occured");
		}
		
		finally
		{
			if(fr!=null)
			{
				fr.close();
			}
			if(fw!=null)
			{
				fw.close();
			}
		}
		
	}

}
