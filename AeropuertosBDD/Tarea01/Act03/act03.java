import java.io.*;

public class act03 {
	public static void main(String[] args) throws IOException {
		File fichero1 = new File(args[0]);
		File fichero2 = new File(args[1]);
		
		BufferedReader fic1 = new BufferedReader(new FileReader(fichero1));
		BufferedWriter fic2 = new BufferedWriter(new FileWriter(fichero2));
		
		String lineas;
		
		while ((lineas = fic1.readLine()) != null) 
		{
			
			if (fic2 != null) {
				fic2.write(lineas);
			}
		}
		
		fic1.close();
		fic2.close();
		
		/*try {
			File fic = new File("FichTexto.txt");
			
			BufferedReader fichero = new BufferedReader(new FileReader(fic));
			
			String linea;
			
			while ((linea = fichero.readLine()) != null)
				System.out.println(linea);
			fichero.close();
		} catch (FileNotFoundException fn) {
			System.out.println("No se encuentra el fichero");
		} catch (IOException io) {
			System.out.println("Error de E/S ");
		}*/
	}
}
