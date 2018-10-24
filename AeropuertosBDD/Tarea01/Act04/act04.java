import java.io.*;
import java.util.*;

public class act04 {
	public static void main(String[] args) throws IOException{
		
			Scanner fic = new Scanner(new File(args[0]));
			
			int cont = 0;
			
			while (fic.hasNextLine()) {
				  cont++;
				  fic.nextLine();
				}
			
			System.out.println(cont);
	}
}
