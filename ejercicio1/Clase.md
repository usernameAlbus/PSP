##Definición de una clase
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
