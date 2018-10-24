import java.io.*;

public class act01 {
	public static void main (String[] args) throws IOException 
	{
		File fichero = new File(args[0]);
		
		if (fichero.exists()) {
			FileReader fic = new FileReader(fichero);
			
			BufferedReader br = new BufferedReader(fic);
			
			String linea;
			
			while ((linea = br.readLine()) != null) {
				for(int i = linea.length() - 1; i > 0; i--)
				System.out.print(linea.charAt(i));
				System.out.println();
			}
			
			br.close();
		}
	}
}
