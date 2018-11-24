import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Map;

public class JavaVersion {
	
	public static void main(String args[]) {

		String linea;

		try {

			Process p = Runtime.getRuntime().exec("java -version");
			BufferedReader Error = new BufferedReader(new InputStreamReader(p.getErrorStream()));

			while ((linea = Error.readLine()) != null) {
				System.out.println(linea);
			}

			System.exit(0);
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
}
