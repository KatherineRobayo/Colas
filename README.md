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

1.Estructura del proyecto:

* SoporteTecnico:Contiene la lógica de la cola.
Importa el Queue que es la interfaz que define una estructura de datos tipo cola (FIFO), LinkedList que es la implementación de Queue que permite añadir y eliminar elementos fácilmente.
Se declara una cola de tipo String, que guarda los clientes (en este caso, una cadena que puede ser nombre y problema) y se inicializa con LinkedList, que permite operar como una cola con las operaciones offer(), poll(), peek(), etc.
Se implementan los metodos solicitarSoporte(String cliente) que añade un cliente a la cola si no se ha alcanzado el límite de 5, se usa cola.offer(cliente) el cual añade el cliente al final de la cola y Si la cola está llena, muestra un mensaje diciendo que debe intentarlo más tarde,atenderCliente() Este método atiende al primer cliente en la cola.Si hay clientes, poll() elimina y devuelve el primer elemento y Si no hay nadie esperando, lo informa,verSiguiente()Muestra quién es el próximo en ser atendido sin sacarlo de la cola, usa peek() devuelve el primer elemento sin eliminarlo y Si la cola está vacía, informa al usuario, mostrarCola() Muestra todos los clientes que están en espera y si la cola está vacía, lo indica,estadoCola() Este informa cuántos clientes hay en la cola actualmente y usa cola.size() que devuelve el número actual de elementos.

* Main: Tiene el menú y la interacción con el usuario.
Se importa el scanner  que se usa para leer entradas del usuario desde la consola.
Se inicializan dos variables sc: Permite leer entradas del usuario (opciones y datos) y soporteque es una instancia de la clase SoporteTecnico que administra la cola de clientes.
Se utiliza un do-while para mostrar el menú y repetir hasta que el usuario decida salir (opcion == 0).
sc.nextInt() lee el número de la opción elegida.
sc.nextLine() es muy importante: limpia el salto de línea pendiente en el buffer después de leer un número, para evitar errores al leer textos después.

2.Funcionalidades:
- Solicitar soporte (Encolar): Permite ingresar el nombre del cliente junto con una breve descripción de su problema.
  Si la cola no está llena, el cliente es agregado al final.
  Si la cola ya está llena, se informa al usuario que debe intentar más tarde.
- Atender al siguiente cliente (Desencolar):
  El sistema elimina y atiende al primer cliente en la cola (el que llegó primero).
- Ver quién es el siguiente:
  Muestra al cliente que está en la primera posición de la cola sin eliminarlo.
- Mostrar toda la cola:
  Imprime en consola todos los clientes en espera, en el orden en que llegaron.
- Ver estado de la cola: 
  Muestra cuántos clientes hay actualmente en la cola y cuál es el límite máximo.
- Salir:
  Finaliza el programa mostrando un mensaje de despedida.

EJEMPLO 2 EMPAREJAMIENTO DE JUGADORES:

1.Estructura del proyecto:

* Clase Emparejador:Esta clase representa el sistema de emparejamiento de jugadores gestionando dos estructuras:
    - colaJugadores (Queue<String>): es una cola FIFO donde se almacenan los nombres de los jugadores que están esperando ser emparejados.
    - partidas (List<String>): una lista donde se guardan las partidas ya formadas, como "Jugador1 vs Jugador2".
  Uiliza los metodos:
    - public void unirseCola(String jugador) el cual
      - Agrega el nombre del jugador a la cola con offer(jugador).
      - Luego verifica si hay al menos 2 jugadores en la cola.
      Si hay 2 o más:
      - Toma los dos primeros con poll().
      - Forma una partida con el formato "Jugador1 vs Jugador2".
      - Agrega esa partida a la lista partidas.
    - public void verCola()
    Muestra los jugadores que aún están esperando en la cola y si la cola está vacía, muestra un mensaje indicando que no hay jugadores.
    - public void verPartidas()
    Imprime todas las partidas que ya han sido formadas.
    - public boolean isEmpty()
    Devuelve true si no hay jugadores en la cola.

* Clase Main:Esta clase  contiene el método main y el menú interactivo para el usuario.
  Utiliza un Scanner para leer la entrada del usuario y un objeto Emparejador para acceder a la lógica principal.
  S utiliza un bucle do-while que permite al usuario seguir usando el sistema hasta que decida salir.
  
2. Funcionalidades:
- Unirse a la cola:El usuario ingresa su nombre como jugador,este nombre se agrega al final de la cola de espera Si hay al menos dos jugadores disponibles, el sistema empareja automáticamente a los dos primeros y crea una partida entre ellos.
- Ver jugadores en la cola: Muestra en pantalla los nombres de los jugadores que aún no han sido emparejados, en el orden en que se unieron.
- Ver partidas formadas:Lista todas las partidas ya formadas, en el orden en que fueron creadas.
Cada partida muestra los dos jugadores que fueron emparejados.
- Salir:Finaliza la ejecución del programa.
