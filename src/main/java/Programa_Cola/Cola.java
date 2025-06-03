package Programa_Cola;

public class Cola {

        private int[] queue;
        private int front, rear, max;

        public Cola(int tamaño) {
            max = tamaño;
            queue = new int[max];
            front = 0;
            rear = 0;
        }

        public boolean isFull() {
            return rear == max;
        }

        public boolean isEmpty() {
            return front == rear;
        }

        public void enqueue(int valor) {
            if (isFull()) {
                System.out.println("La cola está llena. No se puede encolar.");
            } else {
                queue[rear++] = valor;
                System.out.println("Encolado: " + valor);
            }
        }

        public void dequeue() {
            if (isEmpty()) {
                System.out.println("La cola está vacía. No se puede desencolar.");
            } else {
                int eliminado = queue[front++];
                System.out.println("🗑Desencolado: " + eliminado);
            }
        }

        public void mostrarCola() {
            if (isEmpty()) {
                System.out.println("La cola está vacía.");
            } else {
                System.out.println("Elementos en la cola:");
                for (int i = front; i < rear; i++) {
                    System.out.println("[" + queue[i] + "]");
                }
            }
        }

}
