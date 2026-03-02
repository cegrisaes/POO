public class Dron implements Volador{
    @Override
    public void volar() {
        System.out.println("El dron vuela.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El dron aterriza.");
    }
}
