public class TestDeMiQueue {
    public static void main(String[] args) {
        MiQueue<String> colaDePersonas = new MiQueue<>();

        System.out.println(colaDePersonas.isEmpty());
        System.out.println(colaDePersonas);

        colaDePersonas.offer("Luisa");
        colaDePersonas.offer("Mónica");
        colaDePersonas.offer("Miguel");
        System.out.println(colaDePersonas.isEmpty());
        System.out.println(colaDePersonas);

        System.out.println(colaDePersonas.peek());
        System.out.println(colaDePersonas);

        System.out.println(colaDePersonas.poll());
        System.out.println(colaDePersonas);

        colaDePersonas.poll();
        colaDePersonas.poll();
        System.out.println(colaDePersonas);

        System.out.println(colaDePersonas.peek());
        System.out.println(colaDePersonas.poll());
    }
}
