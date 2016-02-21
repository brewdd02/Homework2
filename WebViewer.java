package homework2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class WebViewer
{

	public static void main(String[] args) throws Exception
	{
		if(args.length != 1)
		{
			System.err.println("Usage: java Client [url]");
			return;
		}
		
		URL url = new URL(args[0]);
		
		InputStreamReader isr = new InputStreamReader(url.openStream());
		BufferedReader br = new BufferedReader(isr);
		
		String input = null;
		
		while((input = br.readLine()) != null)
		{
			System.out.println(input);
		}
		
		br.close();
		isr.close();
	}

}
