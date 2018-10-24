import java.io.*;

public class act02 {
	public static void main(String[] args) throws IOException {
		File fichero1 = new File(args[0]);
		File fichero2 = new File(args[1]);
		
		FileReader reader = new FileReader(fichero1);
		FileWriter writer = new FileWriter(fichero2);
		
		BufferedReader fic1 = new BufferedReader(reader);
		BufferedWriter fic2 = new BufferedWriter(writer);
		
		int i = 0;
		
		while (i != -1) {
			i = fic1.read();
			
			if (i != -1) {
				fic2.write((char)i);
			}
		}
		
		fic1.close();
		fic2.close();
	}
}
