public class Aeropuerto {

	private String numero, nombre, ciudad, pais, siglas;

	

	public Aeropuerto() {}

	

	public Aeropuerto(String numero, String nombre, String ciudad, String pais, String siglas) {

		this.numero = numero;

		this.nombre = nombre;

		this.ciudad = ciudad;

		this.pais = pais;

		this.siglas = siglas;

	}



	public String getNombre() {

		return nombre;

	}



	public String getCiudad() {

		return ciudad;

	}



	public String getPais() {

		return pais;

	}



	public String getSiglas() {

		return siglas;

	}



	public String toString() {

		return this.numero + " - " + this.nombre + " / " + this.ciudad + " / " + this.pais + " / " + this.siglas;

	}

	

}