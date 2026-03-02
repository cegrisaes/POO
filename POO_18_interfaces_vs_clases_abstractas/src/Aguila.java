public class Aguila extends Animal implements Volador, Cazador{
    @Override
    public void hacerRuido(){
        System.out.println("Kriiiiii");
    }

    @Override
    public void volar() {
        System.out.println("El águila vuela.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El águila aterriza.");
    }

    @Override
    public void acechar() {
        System.out.println("El águila acecha.");
    }

    @Override
    public void cazar() {
        System.out.println("El águila caza.");
    }
}
