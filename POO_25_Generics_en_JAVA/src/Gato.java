public class Gato extends Animal{
    @Override
    public void comer(){
        System.out.println("El gato está comiendo...");
    }

    @Override
    public void dormir(){
        System.out.println("El gato está durmiendo...");
    }

    @Override
    public String toString(){
        return "Soy un GATO.";
    }
}
