import java.io.*;
import java.util.*;

public class act07 {

	public static void main(String[] args) throws IOException {
		/*
		 * Realizar un programa que cuente el número de líneas, caracteres y palabras
		 * que tiene un fichero pasado como parámetro.
		 */
		File fic = new File(args[0]);
		FileReader reader = new FileReader(fic);
		BufferedReader fic1 = new BufferedReader(reader);
		
		int letras = 0, cont = 0, palabras = 0;
		String linea;

		if (fic.exists()) {

			while ((linea = fic1.readLine()) != null) {
				palabras += fic1.toString().split(" ").length;
				letras += fic1.toString().length();
				cont++;
			}
		}
		
		fic1.close();
	}

}
