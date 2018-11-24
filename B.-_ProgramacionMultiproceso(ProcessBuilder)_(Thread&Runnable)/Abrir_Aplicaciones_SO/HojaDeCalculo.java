import java.io.IOException;

public class HojaDeCalculo {
	public static void main(String args[]) throws IOException {
		String ruta = "C:\\Users\\Albus\\Desktop\\HojaDeCalculo.xlsx";
		String[] commands = { "cmd", "/c", "start", "\"HojaDeCalculo\"", ruta};
		Runtime.getRuntime().exec(commands);
		
		System.out.println("Se ha abierto la aplicación predeterminada para abrir archivos xlsx, \ny he indicado el Documento.pdf que esta en la ruta absoluta indicada.");
	}
}
