import java.io.IOException;



public class Uno {

	public static void main(String[] args) throws IOException, InterruptedException {

		try {

			ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe", "");

			pb.start();

		} catch (Exception e) {

			System.out.println("Exception " + e);

		}

	}

}