import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Client extends Thread {
	private Socket incoming;
	private PrintWriter out;

	Client(Socket incoming) {
		this.incoming = incoming;
		this.start();
	}

	@Override
	public void run() {
		try {
			try {
				Server.getHandlers().add(this);

				InputStream inputStream = incoming.getInputStream();
				OutputStream outputStream = incoming.getOutputStream();

				Scanner in = new Scanner(inputStream);
				out = new PrintWriter(outputStream, true /* autoFlush */);

				out.println("<<< CHAT SECRETO TELNET - 2 DAM >>>");

				out.println("Elige tu nombre de usuario:");
				String nombre = in.nextLine();

				out.println("Bienvenido, para salir del chat utiliza QUIT || EXIT.");

				boolean stop = false;
				while (!stop && in.hasNextLine()) {
					String line = in.nextLine();
					
					Date date = new Date(); // DECORACION
					
					Server.enviarAll(nombre + ": " + line + "\t\t\t\t --" + date);
					
					if (line.trim().equalsIgnoreCase("QUIT") || line.trim().equalsIgnoreCase("EXIT"))
						stop = true;
				}

			} finally {
				incoming.close();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	PrintWriter getOut() {
		return out;
	}
}