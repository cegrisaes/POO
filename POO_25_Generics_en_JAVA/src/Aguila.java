public class Aguila extends Animal implements Volador, Cazador{
    @Override
    public void comer(){
        System.out.println("El águila está comiendo...");
    }

    @Override
    public void dormir(){
        System.out.println("El águila está durmiendo...");
    }

    @Override
    public void volar(){
        System.out.println("El águila está volando...");
    }

    @Override
    public void aterrizar(){
        System.out.println("El águila está aterrizando...");
    }

    @Override
    public void acechar(){
        System.out.println("El águila está acechando...");
    }

    @Override
    public void cazar(){
        System.out.println("El águila está cazando...");
    }

    @Override
    public String toString(){
        return "Soy un ÁGUILA.";
    }
}
