import java.io.IOException;
import java.net.ServerSocket;

public class SinglePortScanner {
	public static void main(String[] args) {
		for (int i = 0; i < 65535; i++) {
			try {
				ServerSocket server = new ServerSocket(i);
				System.out.println(i);
			} catch (IOException e) {
				System.out.println("Occupied port");
			}

		}
	}
}