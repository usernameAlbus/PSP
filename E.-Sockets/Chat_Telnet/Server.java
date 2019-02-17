import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Server {
	
    static void run() {
        try {
            int i = 1;
            ServerSocket serverSocket = new ServerSocket(9090);
            while (true) {
                Date date = new Date(); // DECORACION
                Socket clientSocket = serverSocket.accept();
                System.out.println("Numero de clientes: " + i + ". --Fecha y hora de entrada: " + new Timestamp(date.getTime()));
                new Client(clientSocket);
                i++;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static void enviarAll(String message){
        for (Client c : handlers) {
            c.getOut().println(message);
        }
    }

    static List<Client> getHandlers() {
        return handlers;
    }

    private static List<Client> handlers = new ArrayList<Client>();
}