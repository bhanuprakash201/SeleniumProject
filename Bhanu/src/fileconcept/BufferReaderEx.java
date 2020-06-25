package fileconcept;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class BufferReaderEx {

	public static void main(String[] args) throws IOException {
		
		FileWriter writer=new FileWriter("C:\\Users\\Sandeep\\Desktop\\BHANU201.txt");
		BufferedWriter buffer=new BufferedWriter(writer);
		buffer.write("this is just Training from DevelopYou Technologies this new file");
		buffer.close();
		System.out.println("Completed Succesfully");
		FileReader fr= new FileReader("C:\\Users\\Sandeep\\Desktop\\BHANU202.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String s;
		while((s=br.readLine())!=null)
		{
		System.out.println(s);
		}
		
		br.close();
		fr.close();
		
		
	}

}
