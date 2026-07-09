public class Perro extends Animal{
    @Override
    public void comer(){
        System.out.println("El perro está comiendo...");
    }

    @Override
    public void dormir(){
        System.out.println("El perro está durmiendo...");
    }

    @Override
    public String toString(){
        return "Soy un PERRO.";
    }
}
