
public class Oficial extends Empleado {
	private String nombre;

	public Oficial(String nombre) {
		super(nombre + " -> Operario -> Oficial");
	}
}
