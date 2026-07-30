import java.util.LinkedList;
import java.util.Queue;

public class QueueEnJava {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        System.out.println(cola.isEmpty());
        System.out.println(cola);

        cola.offer("Julio");
        System.out.println(cola.isEmpty());
        System.out.println(cola);

        cola.offer("José");
        cola.offer("Claudia");
        System.out.println(cola);

        System.out.println(cola.peek());
        System.out.println(cola);

        cola.poll();
        System.out.println(cola);

        System.out.println(cola.poll());
        System.out.println(cola);

        cola.poll();
        System.out.println(cola);

        System.out.println(cola.peek());
        System.out.println(cola.poll());
    }
}
