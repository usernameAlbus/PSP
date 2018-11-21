import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Dos {

	public static void main(String[] args) throws IOException {
		final String commands[] = {"cmd", "/c", "tasklist"};
		Process pb = new ProcessBuilder(commands).start();
		
		InputStream is = pb.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String line;

		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		try {
			int exitValue = pb.waitFor();
			System.out.println("\nCodigo de salida: " + exitValue);
		} catch (InterruptedException e) {
			e.printStackTrace(System.err);
		}
	}

}
