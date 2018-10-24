import java.io.*;
import java.util.Scanner;

public class act05 {

	public static void main(String[] args) throws IOException {
		int cont = 0, lineas;

		Scanner lector = new Scanner(System.in);

		File fichero = new File(args[0]);

		FileReader reader = new FileReader(fichero);

		BufferedReader fic1 = new BufferedReader(reader);

		String linea;

		System.out.println("Numero de lineas:");
		lineas = lector.nextInt();

			while ((linea = fic1.readLine()) != null) {
				if (lineas == cont) {
					break;
				}
				cont++;
				System.out.println(linea);
			}

		fic1.close();

	}

}
