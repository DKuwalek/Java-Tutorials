package experimento;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams{

	public static void main(String[] tucan) throws IOException
	{

		FileInputStream in = null;
		FileOutputStream out = null;

		try
		{
			in = new FileInputStream("losoweLiczby.txt");
			out = new FileOutputStream("kopiaLosoweLiczby.txt");
			int c;
			boolean endOfFile = false;

			//	gdy read() zwróci -1 mamy koniec pliku
			
			while(endOfFile == false)
			{
				c = in.read();

				if(c != -1)
				{
					out.write(c);
				}
				else
				{
					endOfFile = true;
				}	

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