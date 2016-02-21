package homework2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer
{
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("Server is running...");
		
		ServerSocket serverSocket = new ServerSocket(12000);

		Socket socket = serverSocket.accept();

		DataOutputStream os = new DataOutputStream(socket.getOutputStream());

		String entityBody = null;

		entityBody = "<HTML><BODY><FONT SIZE=\"14\"><B>Hello CS374</B></FONT></BODY></HTML>";

		os.writeBytes(entityBody);
		
		os.close();
		socket.close();
		serverSocket.close();
		
	}

}
