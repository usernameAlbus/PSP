
public class PDF {
	public static void main(String[] args) throws Exception {
		
		Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler C:\\Users\\Albus\\Desktop\\Documento.pdf");		
		p.waitFor();
		
		System.out.println("Se ha abierto en la aplicación predeterminada para abrir pdf's, \ny he indicado el Documento.pdf que esta en la ruta absoluta indicada.");
	}
}
