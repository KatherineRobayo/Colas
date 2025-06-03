package Programa_Cola;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Ingrese el tamaño máximo de la cola: ");
                int tamaño = sc.nextInt();
                Cola cola = new Cola(tamaño);

                int opcion;
                do {
                    System.out.println("\n MENÚ ");
                    System.out.println("1. Encolar (enqueue)");
                    System.out.println("2. Desencolar (dequeue)");
                    System.out.println("3. Mostrar cola");
                    System.out.println("4. ¿Está llena?");
                    System.out.println("5. ¿Está vacía?");
                    System.out.println("0. Salir");
                    System.out.print("Seleccione una opción: ");
                    opcion = sc.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese un número para encolar: ");
                            int valor = sc.nextInt();
                            cola.enqueue(valor);
                            break;
                        case 2:
                            cola.dequeue();
                            break;
                        case 3:
                            cola.mostrarCola();
                            break;
                        case 4:
                            System.out.println(cola.isFull() ? "La cola está llena." : "ℹLa cola NO está llena.");
                            break;
                        case 5:
                            System.out.println(cola.isEmpty() ? "La cola está vacía." : "ℹLa cola NO está vacía.");
                            break;
                        case 0:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }

                } while (opcion != 0);

                sc.close();
            }
        }

