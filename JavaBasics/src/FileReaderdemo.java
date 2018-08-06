import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderdemo {
	
	public static void main(String args[]) throws IOException
	{
		String line=null;
				
		FileReader fr=new FileReader("E:\\Software\\Udemy material\\info.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		
		br.close();
		
	}

}
