public class Persona {
    public String nombre;
    public int edad;
    private static int numeroDePersonas = 0;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        numeroDePersonas++;
    }

    public void saludar(){
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años. Hay " + numeroDePersonas + " personas en total.");
    }

    public static int getNumeroDePersonas(){
        return numeroDePersonas;
    }
}
