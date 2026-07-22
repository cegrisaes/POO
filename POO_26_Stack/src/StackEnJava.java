import java.util.Stack;

public class StackEnJava {
    public static void main(String[] args) {
        Stack<String> pilaDeLibros = new Stack<>();
        System.out.println(pilaDeLibros.isEmpty());
        System.out.println(pilaDeLibros);
        pilaDeLibros.push("Pedro Páramo");
        System.out.println(pilaDeLibros.isEmpty());
        System.out.println(pilaDeLibros);
        pilaDeLibros.push("Rayuela");
        pilaDeLibros.push("El Aleph");
        pilaDeLibros.push("El principito");
        pilaDeLibros.push("La metamorfosis");
        System.out.println(pilaDeLibros);
        System.out.println(pilaDeLibros.peek());
        System.out.println(pilaDeLibros);
        pilaDeLibros.pop();
        System.out.println(pilaDeLibros);
        String libro = pilaDeLibros.pop();
        System.out.println(pilaDeLibros);
        System.out.println(libro);
        pilaDeLibros.push("La ciudad y los perros");
        pilaDeLibros.push("Crimen y castigo");
        pilaDeLibros.pop();
        pilaDeLibros.pop();
        pilaDeLibros.pop();
        pilaDeLibros.pop();
        pilaDeLibros.pop();
        System.out.println(pilaDeLibros);
    }
}
