public class Avion implements Volador{
    @Override
    public void volar(){
        System.out.println("El avión está volando...");
    }

    @Override
    public void aterrizar(){
        System.out.println("El avión está aterrizando...");
    }

    @Override
    public String toString(){
        return "Esto es un AVIÓN.";
    }
}
