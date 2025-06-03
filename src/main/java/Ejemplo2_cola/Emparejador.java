package Ejemplo2_cola;

import java.util.*;

public class Emparejador {

        private Queue<String> colaJugadores = new LinkedList<>();
        private List<String> partidas = new ArrayList<>();

        public void unirseCola(String jugador) {
            colaJugadores.offer(jugador);
            System.out.println( jugador + " se unió a la cola.");

            // Intentar emparejar si hay al menos 2 jugadores
            if (colaJugadores.size() >= 2) {
                String jugador1 = colaJugadores.poll();
                String jugador2 = colaJugadores.poll();
                String partida = jugador1 + " vs " + jugador2;
                partidas.add(partida);
                System.out.println("Partida creada: " + partida);
            }
        }

        public void verCola() {
            if (colaJugadores.isEmpty()) {
                System.out.println("No hay jugadores en la cola.");
            } else {
                System.out.println("Jugadores en espera: " + colaJugadores);
            }
        }

        public void verPartidas() {
            if (partidas.isEmpty()) {
                System.out.println("No hay partidas formadas.");
            } else {
                System.out.println("Partidas formadas:");
                for (String p : partidas) {
                    System.out.println(" - " + p);
                }
            }
        }

        public boolean isEmpty() {
            return colaJugadores.isEmpty();

    }
}
