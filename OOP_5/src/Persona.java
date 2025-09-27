public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
       setNombre(nombre);
       setEdad(edad);
    }

    public Persona(String nombre){
        setNombre(nombre);
        setEdad(18);
    }

    public Persona(int edad){
        setEdad(edad);
        setNombre("Desconocido");
    }

    public Persona(){
        setNombre("Desconocido");
        setEdad(18);
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        if(nombre.trim().isEmpty()){
            System.out.println("El parámetro nombre no es válido");
            this.nombre = "Desconocido";
        }else{
            this.nombre = nombre;
        }
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        if(edad < 0 || edad > 120){
            System.out.println("El parámetro edad no es válido");
            this.edad = 18;
        }else{
            this.edad = edad;
        }
    }

    public void saludar(){
        System.out.println("¡Hola! Me llamo " + nombre + " y tengo " + edad + " años. Gusto en conocerte." );
    }
}