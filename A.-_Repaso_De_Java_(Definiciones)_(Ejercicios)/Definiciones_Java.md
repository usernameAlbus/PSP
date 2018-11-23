[click on this link](#definición-de-una-herencia)



##Definición de una Clase Java
--------------

Una clase en Java es como una plantilla donde pueden ser utilizadas por el usuario para llevar acabo tareas de programación, el usuario también tiene la posibilidad de modelar o crear sus propias clases según el proyecto de programación.  
**Las características de una clase Java son:**  
**-Nombre**  
**-Propiedades**   
**-Constructor**
**-Métodos**  
Tenemos dos tipos principales public y private, public pudiendo ser invocada/llamada por cualquier entidad dentro o fuera de la clase y private not.

Tenemos public static void MAIN, que indica que al darle al play será la primera en ejecutarse. También las clases tienen que ir la primera letra de en mayuscula como norma general, un ejemplo podría ser Clase, y si son varias palabras ClasesPrueba.

**EJEMPLO:**  
```java
//package nombre;
public class Ejemplo{
    public static void main(String[] args){
        int uno = 1;
        
        uno += 1;
        
        System.out.println("Uno equivale a " + uno);
        
        //EJEMPLO DE UNA SIMPLE SUMA EN UNA CLASE
    }
}
```  
  
    
##Definición de un Objeto Java
--------------  
Un objeto es una entided existente en la memoria del orenador que tiene propiedades como atributos o datlos sobre si mismo almacenados por el mismo objeto y operaciones especificas.  
Los objetos puede interactuar unos con otros, son capaces de recibir mensajes, procesar datos y enviar mensajes a otros objetos de manera similar a un servicio.  

Incluimos private para que no sea publico para las otras clases.

Tienen constructores, metodos, getters y setters...  En el ejemplo podemos llamar al humano con un constructor vacio:  
Humano h1 = new Humano();  
O con datos:  
Humano h2 = new Humano("Lola", 8, "Hombre", "Irlanda");
  
**Ejemplo de un Objeto:**  
```java
public class Humano {
	private String nombre;
	private int edad;
	private String sexo;
	private String nacionalidad;
	
	public Humano() {
		
	}
	
	public Humano(String nombre, int edad, String sexo, String nacionalidad) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.nacionalidad = nacionalidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
}

```  

##Definición de una sobrecarga de metodos en Java  
--------------
En Java la sobrecarga permite definir más de un constructor o método con el mismo nombre pero con diferentes parametros.  

**EJEMPLO:**  
  
```java

public class Sobrecarga {
	private String nombre, apellido;
	
		public void modificar(String nombre){
			this.nombre = nombre;
		}
		public void modificar(String apellido){
			this.apellido = apellido;
		}
		public void modificar(String nombre, String apellido){
			this.nombre = nombre;
			this.apellido = apellido;
		}
}

```

##Definición de una Herencia  
--------------  
Herencia en Java hace que la clase que se hereda se denomina superclase, y la clase que hereda de esa superclase subclase.
De la superclase heredan todas las variables y metodos definidos por ella y agrega sus propios elementos unicos.  
En la clase principal se utiliza abstract, esta no puede ser utilizada como objeto, la subclase utiliza extends, **EJEMPLO**:  

La llamada de Super(); en la subclase llama al constructor del padre, metodos y propiedades.

Humano h1 = new Mejicano(); De esta manera creamos un objeto "Mejicano". ~~Humano h1 = new Humano h1();~~ <- Daria error.
  
```java
package test;

public abstract class Humano {
	private String nombre;
	
	public Humano() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract void experiencia();
	
	public class Mejicano extends Humano{
		
		private int edad;
		
		public Mejicano() {
			super();
		}
		
		public Mejicano(int edad) {
			super();
			this.edad = edad;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		@Override
		public void experiencia() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}
```
##Definición de el Poliformismo en Java
--------------  
El Polimorfismo es la habilidad de una función, método, variable y objeto de poseer varias formas distintas, como el mismo significado de la palabra, su proposito es implementar un estilo de programación llamado envío de mensajes en el que los objetos interactúan entre ellos mediante estos mensjaes, que no son más que llamadas a distintas funciones.  
  
**EJEMPLO:**  
```java
abstract class Semaforo
{
	abstract public void iniciar();
}

class Color extends Semaforo
{
	@Override
	public void iniciar()
	{
	
	}
}
```

##Definición de Interface en Java
--------------  
Interface en Java es una colección de métodos abstractos y propiedades constantes, no encapsula datos, sólo define cuáles son los métodos que han de implementar los objetos de aquellas clases que implementen la inferfaz.  
  
**EJEMPLO:**  
```java
	public class Cuadrado implements Arte
	{
	
		private double lado;
		
		public Cuadrado (double lado)
		{
			this.lado = lado;
		}
		
		public double area ()
		{
			return lado * lado;
		}
		
	}
	
	public class Circulo implements Arte 
	{
		private double radio;
		
		public Circulo(double radio)
		{
			this.radio = radio;
		}
		
		public double area () 
		{
			return Math.PI * radio * radio;
		}
	}
```

### Hello Moto
