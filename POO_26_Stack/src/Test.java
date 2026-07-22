public class Test {
    public static void main(String[] args) {
        MiStack<String> pila = new MiStack<>();

        System.out.println(pila.isEmpty());

        pila.push("Luis");
        pila.push("Laura");

        System.out.println(pila.isEmpty());

        System.out.println(pila);

        System.out.println(pila.peek());
        System.out.println(pila);

        pila.pop();
        pila.pop();
        System.out.println(pila);

        // pila.pop();
    }
}
