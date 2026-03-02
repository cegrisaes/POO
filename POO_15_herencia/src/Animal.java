public class Animal extends SerVivo{
    public String nombre;
    public double peso;

    public Animal(){}

    public Animal(String nombre, double peso){
        this.nombre = nombre;
        this.peso = peso;
    }

    public void comer(){
        System.out.println("comiendo...");
    }

    public void dormir(){
        System.out.println(this.nombre + " está durmiendo...");
    }
}
