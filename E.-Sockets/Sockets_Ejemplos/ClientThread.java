import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientThread extends Thread{

	private Socket socket = null;
	
	public ClientThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			PrintWriter out = null;
			out = new PrintWriter(socket.getOutputStream(), true);
			out.println("Hola desde el otro lado");

			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String clientInput = input.readLine();
			System.out.println(clientInput);

			input.close();
			out.close();
			socket.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
}
