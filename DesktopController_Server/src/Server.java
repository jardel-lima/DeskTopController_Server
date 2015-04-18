import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server{
	static ServerSocket socket;
	static Socket server;
	static int port;
	
	public static void main(String []args){
		
		System.out.println("Server");
		try {
			//Create a socket
			System.out.println("Creating Socket");
			socket = new ServerSocket(0);
			socket.setSoTimeout(60000);
			
			System.out.println("Server Info:");
			System.out.println("address: "+socket.getInetAddress().getHostAddress());
			System.out.println("port: "+socket.getLocalPort());
			System.out.println("Waiting for Connection...");
			
			server = socket.accept();
			
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
