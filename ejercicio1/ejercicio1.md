Crear documento en github desarrollando los siguientes puntos, poner ejemplos y código básico:
Clase
Objeto
Sobrecarga de métodos
Herencia
Polimorfismo
Interface

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
