COLAS EN JAVA 
Este repositorio contiene un programa en java que permite trabajar la estructura  y funcionalidades de las colas, en este se encontrara un programa y dos ejemplos.

INTEGRANTES:
Angie Katherine Robayo Angel 
Jhon Sebastian Murcia Romero

PROGRAMA DE COLAS 
Este programa implementa una estructura de datos tipo Cola (Queue) utilizando el lenguaje de programación Java. A través de una interfaz de consola, el usuario puede interactuar con la estructura, realizar operaciones de encolado y desencolado, y observar el estado actual de la cola. 

1.Estructura del proyecto:
* Cola.java: En esta clase se implementa la estructura de la cola, esta clase define una estructura de datos tipo cola (FIFO: First-In,     First-Out), implementada con un arreglo (int[]) de tamaño fijo. 
En esta los atributos que se usaron son:
  -queue: que almacena los elementos.
  -front: indica el primer elemento que se va a eliminar con dequeue.
  -rear: indica donde se insertará el siguiente elemento.
  -max: Indica el tamaño máximo de la cola.
Se implementan los metodos isFull() el cual verifica si la cola está llena cuando rear llega al final del arreglo,isEmpty() el cual verifica si la cola está vacía cuando no hay elementos entre front y rear,enqueue(int valor) el cual agrega un nuevo valor al final de la cola si no está llena aumentando el rear en 1, dequeue() el cual elimina el elemento que está al frente de la cola y aumenta front y mostrarCola() el cual muestra todos los elementos actualmente en la cola.
    
* Main.java: Esta clase contiene el método main, donde el usuario puede interactuar con la cola por medio de un menú en consola.


2.Funcionalidades:
Este programa permite realizar operaciones fundamentales de una cola:
    - enqueue: Agregar un nuevo elemento al final de la cola.
    - dequeue: Eliminar el primer elemento de la cola.
    - isEmpty: Verificar si la cola está vacía.
    - isFull: Verificar si la cola esta llena.
    - ver: Mostrar los elementos de la cola.

3. Interacción: 
  El usuario interactúa con el programa a través de un menú por consola, donde puede realizar operaciones básicas sobre una estructura de    datos tipo cola (FIFO). Al iniciar la aplicación, se le solicita al usuario que defina el tamaño máximo de la cola. A partir de allí,      puede realizar las siguientes acciones en tiempo real:

- Encolar (enqueue): Permite ingresar un número que será añadido al final de la cola si no está llena.

- Desencolar (dequeue):Elimina el primer elemento de la cola si no está vacía.

- Mostrar cola: Imprime todos los elementos actuales en la cola, en orden de llegada.

- ¿Está llena?: Verifica si la cola alcanzó su capacidad máxima.

- ¿Está vacía?: Verifica si no hay elementos en la cola.

- Salir
  Finaliza el programa.

EJEMPLO 1 SISTEMA DE COLA-SOPORTE TÉCNICO 
Este proyecto simula un sistema de atención por orden de llegada (FIFO) en un centro de soporte técnico. Utiliza una estructura de cola para gestionar a los clientes que solicitan ayuda, limitando la capacidad máxima a 5 personas en espera.


