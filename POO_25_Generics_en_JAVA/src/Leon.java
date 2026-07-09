public class Leon extends Animal implements Cazador{
    @Override
    public void comer(){
        System.out.println("El león está comiendo...");
    }

    @Override
    public void dormir(){
        System.out.println("El león está durmiendo...");
    }

    @Override
    public void acechar(){
        System.out.println("El león está acechando...");
    }

    @Override
    public void cazar(){
        System.out.println("El león está cazando...");
    }

    @Override
    public String toString(){
        return "Soy un LEÓN.";
    }
}
