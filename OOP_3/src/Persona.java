public class Persona {
    public String nombre;
    public int edad;

    public Persona(String nombre, int edad){
       this.nombre = nombre;
       this.edad = edad;
    }

    public Persona(String nombre){
        this.nombre = nombre;
        edad = 18;
    }

    public Persona(int edad){
        this.edad = edad;
        nombre = "Desconocido";
    }

    public Persona(){
        nombre = "Desconocido";
        edad = 18;
    }

    public void saludar(){
        System.out.println("¡Hola! Me llamo " + nombre + " y tengo " + edad + " años. Gusto en conocerte." );
    }
}