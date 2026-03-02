public class Avion implements Volador{
    @Override
    public void volar() {
        System.out.println("El avión vuela.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El avión aterriza.");
    }
}
