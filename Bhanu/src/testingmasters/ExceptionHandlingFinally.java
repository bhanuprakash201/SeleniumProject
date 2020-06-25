package testingmasters;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingFinally {
public static void readContent(String filepath) throws IOException
{
	File file;
	FileReader fr=null;
	boolean bTag=false;
	
	try
	{
		file =new File(filepath);
			fr=new FileReader(file);
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char) i);
				Thread.sleep(1000);	
			}
			bTag=true;
		int [] arr=new int[2];
			arr[0]=10;
			arr[1]=20;
			System.out.println(arr[1]);
			
			System.out.println(15/0);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Something Not Divided by Zero");
	}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array index Out of Bound ");
	}
	catch(IOException e)
	{
		System.out.println("File not found or unable to read content");
	}
	catch(Exception e)
	{
		System.out.println("Some Exception Occured");
	}
	finally
	{
		if(bTag)
		{
			fr.close();
		}
	}
}
	
	public static void main(String[] args) throws IOException
	{
		readContent("C:\\Users\\Sandeep\\Desktop\\BHANU201.txt");	
	}
	
	
}
