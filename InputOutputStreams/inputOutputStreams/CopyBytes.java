package inputOutputStreams;

/*
 * We'll explore FileInputStream and FileOutputStream by
 * examining an example program named CopyBytes,
 * which uses byte streams to copy xanadu.txt,
 * one byte at a time.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes
{
	public static void main(String[] sgra) throws IOException
	{
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try
		{
			in = new FileInputStream("xanadu.txt");
			out = new FileOutputStream("kopiaXanadu.txt");
			int c;
			
//			NAWIASY s¹ WA¯NE, ta linijka powoduje bl¹d
//			while( c = in.read() != -1)
			
//			poprawnie:
			while( (c = in.read()) != -1)
			{
//				System.out.println(c);
				out.write(c);
			}	
		}
		finally
		{
			if(in != null)
				in.close();
			
			if(out != null)
				out.close();

		}
	}
}
