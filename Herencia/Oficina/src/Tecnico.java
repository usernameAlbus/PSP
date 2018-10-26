
public class Tecnico extends Empleado {
	private String nombre;

	public Tecnico(String nombre) {
		super(nombre + " -> Operario -> Tecnico");
	}
}
