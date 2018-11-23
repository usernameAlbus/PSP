public class Empleado {

	private String nombre;

	

	public Empleado() {}

	

	public Empleado(String nombre) {

		this.nombre = nombre;

	}



	public String getNombre() {

		return nombre;

	}

	

	public String toString() {

		return "Empleado: " + nombre;

	}

}