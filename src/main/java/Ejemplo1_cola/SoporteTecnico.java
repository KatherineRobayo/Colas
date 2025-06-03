package Ejemplo1_cola;

import java.util.LinkedList;
import java.util.Queue;

public class SoporteTecnico {

        private Queue<String> cola = new LinkedList<>();
        private final int MAX_SIZE = 5;

        public void solicitarSoporte(String cliente) {
            if (cola.size() < MAX_SIZE) {
                cola.offer(cliente);
                System.out.println( cliente + " ha sido añadido a la cola de soporte.");
            } else {
                System.out.println("La cola está llena. Intente más tarde.");
            }
        }

        public void atenderCliente() {
            if (cola.isEmpty()) {
                System.out.println("No hay clientes en espera.");
            } else {
                String atendido = cola.poll();
                System.out.println("Atendiendo a: " + atendido);
            }
        }

        public void verSiguiente() {
            if (cola.isEmpty()) {
                System.out.println("No hay nadie en espera.");
            } else {
                System.out.println("Próximo cliente: " + cola.peek());
            }
        }

        public void mostrarCola() {
            if (cola.isEmpty()) {
                System.out.println("No hay clientes en la cola.");
            } else {
                System.out.println("Clientes en espera:");
                for (String cliente : cola) {
                    System.out.println("- " + cliente);
                }
            }
        }

        public void estadoCola() {
            System.out.println("Clientes en cola: " + cola.size() + "/" + MAX_SIZE);
        }
    }

