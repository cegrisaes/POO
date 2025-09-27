public class Persona {
    private String nombre;
    private int edad;

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

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void saludar(){
        System.out.println("¡Hola! Me llamo " + nombre + " y tengo " + edad + " años. Gusto en conocerte." );
    }
}