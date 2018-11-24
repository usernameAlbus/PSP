## ATAJOS (ETA para acabar todas las tareas, 25/11/2018)
* [Aplicacion](#definición-de-una-aplicación)  
* [Servicio](#definición-de-un-servicio)  
* [Proceso](#definición-de-un-proceso)  
* [Hilo](#definición-de-un-hilo)  
* [Programacion Concurrente](#definición-de-la-programación-concurrente)  
* [Programacion Paralela](#definición-de-la-programación-paralela)  
* [Programacion Distribuida](#definición-de-la-programación-distribuida)  

## Definición de una aplicación  

**Es un tipo de software o conjuntos de softwares** (ej: Microsoft Office, Ninite) que permite al usuario realizar uno a más tipos de trabajo. Existen infinidades tipos de aplicaciónes, por ejemplo los procesadores de texto, las hojas de calculo, los que cumplen tareas de mantenimiento entre muchas.  
  
  Realizan trabajos especificos para el beneficio del usuario final, las aplicaciónes mas conocidas pueden ser junto con las de arriba, las bases de datos, agendas, programas gráficos...  
  
  **Ejemplo de un programa gráfico**:
  
  ![Paint](https://upload.wikimedia.org/wikipedia/commons/f/f8/Paint.NET_3.35_screenshot.png)

## Definición de un servicio  

Un servicio es un proceso que **no es grafico(no tiene interfaz) y esta ejecutandose en segundo plano**, por que  no está pensado para que el usuario lo maneje directamente. Estos servicios buscan responder a las necesidades de un cliente por medio de un cambio de condición en los bienes informaticos, potenciando el valor de estos y reduciendo el riesgo inherente del sistema.  

**Ejemplo de los servicios corriendo en Windows**:

![Services](https://www.howtogeek.com/wp-content/uploads/2014/05/clip_image0024.png)


## Definición de un proceso  
Un proceso de manera informal puede entenderse como un programa en ejecución, **es una unidad de actividad que se caracteriza por la ejecución de una secuencia de instrucciones.**  Puede tener varios estados, Ejecución, Bloqueado y Listo.  
Un proceso esta compuesto por un hilo como mínimo, ocupa un espacio de memoria y esta formado por el código del programa, datos y los ficheros que utiliza.  

## Definición de un hilo  

**Un hilo es una tarea que puede ser ejecutada al mismo tiempo que otra tarea**. Lo que es propio de cada hilo es el contador de programa, la pila de ejecución y el estado de la CPU(incluyendo el valor de los registros).
Cuando se ejecutan varios hilos, estos ocupan la misma memoria virtual, de esa forma comparten código, datos y ficheros, pero ejecutan diferentes lineas de codigo y accederán a diferentes porciones de la memoria y diferentes entradas.

## Definición de la programación concurrente  
Es la ejecuccion de múltiples tareas interactivas, estos pueden ser un conjunto de procesos o hilos de ejecución creados por un único programa, **se denomina programación concurrente la capacidad de un núcleo de ejecutar dos o más tareas a la vez**, normalmente **repartiendo el tiempo de proceso entre las tareas**. El SO se ocupa de repartir el tiempo de la CPU para simular que varios procesos se ejecutan simultaneamente.

## Definición de la programación paralela  

La programación paralela consta de un solo ordenador que puede ejecutar varias tareas a la vez(tiene que tener 2 o más núcleos). Hay varias formas de programación paralela, el paralelismo de datos y el paralellismo de tareas.  

## Definición de la programación distribuida  
  Es un paradigma enfocado en desarrollar sistemas distribuidos, abiertos, escalables, transparentes y tolerantes a fallos, cualquier lenguaje de programacion que tenga acceso al máximo hardware del sistema puede manejar este tipo de programación.
