package Ejemplo2_cola;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Emparejador emparejador = new Emparejador();

        int opcion;

        do {
            System.out.println("\nSISTEMA DE EMPAREJAMIENTO");
            System.out.println("1. Unirse a la cola");
            System.out.println("2. Ver jugadores en la cola");
            System.out.println("3. Ver partidas formadas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese su nombre de jugador: ");
                    String nombre = sc.nextLine();
                    emparejador.unirseCola(nombre);
                    break;
                case 2:
                    emparejador.verCola();
                    break;
                case 3:
                    emparejador.verPartidas();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
