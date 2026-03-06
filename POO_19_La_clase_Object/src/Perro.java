public class Perro extends Animal {
    public String nombre;
    public String raza;

    public Perro(String nombre, String raza){
       this.nombre = nombre;
       this.raza = raza;
    }

    public void jugar(){
        System.out.println("El perro juego.");
    }

    @Override
    public String toString(){
        return "Perro {" + "nombre: " + nombre + ", raza: " + raza + "} ";
    }
}
