package fileconcept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream {

	public static void main(String[] args) throws IOException {
		FileInputStream in=null;
		FileOutputStream out=null;
		try
		{
			in=new FileInputStream("C:\\Users\\Sandeep\\Desktop\\BHANU201.txt");
			out=new FileOutputStream("C:\\Users\\Sandeep\\Desktop\\BHANU202.txt");
			
			int c;
			while((c=in.read()) !=-1)
			{
				out.write(c);
				
			}
		}
catch(IOException e)
		{
	
		}
		finally
		{
			if(in!=null)
			{
				in.close();
			}
			if(out!=null)
			{
				out.close();
			}
		}
	}

}
