import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadedServer {

	public static void main(String[] args){
		try {
			ServerSocket serverSocket = new ServerSocket(9090);
			boolean stop = false;

			while (!stop) {
				System.out.println("Esperando clientes...");
				Socket clientSocket = serverSocket.accept();
				System.out.println("El cliente se ha conectado");

				// USAMOS LA CLASE CLIENT.THREAD
				ClientThread clientThread = new ClientThread(clientSocket);
				clientThread.start();
			}
		} catch (Exception e) {
			System.out.println("ERROR: " + e);
		}

	}

}
