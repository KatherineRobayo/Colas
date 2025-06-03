package Ejemplo1_cola;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){

            Scanner sc = new Scanner(System.in);
            SoporteTecnico soporte = new SoporteTecnico();

            int opcion;
            do {
                System.out.println("\n MENÚ");
                System.out.println("1. Solicitar soporte");
                System.out.println("2. Atender al siguiente cliente");
                System.out.println("3. Ver quién es el siguiente");
                System.out.println("4. Mostrar toda la cola");
                System.out.println("5. Ver estado de la cola");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();
                sc.nextLine(); // Limpiar buffer

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese su nombre y problema: ");
                        String cliente = sc.nextLine();
                        soporte.solicitarSoporte(cliente);
                        break;
                    case 2:
                        soporte.atenderCliente();
                        break;
                    case 3:
                        soporte.verSiguiente();
                        break;
                    case 4:
                        soporte.mostrarCola();
                        break;
                    case 5:
                        soporte.estadoCola();
                        break;
                    case 0:
                        System.out.println("Cerrando sistema de soporte...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }

            } while (opcion != 0);

            sc.close();
    }
}
