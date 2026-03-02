public class Perro extends Animal {
    public String raza;

    public Perro(){}

    public Perro(String nombre, double peso, String raza){
        this.raza = raza;
    }

    public void ladrar(){
        System.out.println("ladrando...");
    }

    @Override
    public void dormir(){
        super.dormir();
        System.out.println("El perro puede dormir hasta 12 horas.");
    }
}
