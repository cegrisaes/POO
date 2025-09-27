public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
      this.nombre = validarNombre(nombre);
      this.edad = validarEdad(edad);
    }

    public Persona(String nombre){
        this.nombre = validarNombre(nombre);
        this.edad = validarEdad(18);
    }

    public Persona(int edad){
        this.nombre = validarNombre("Desconocido");
        this.edad = validarEdad(edad);
    }

    public Persona(){
        this.nombre = validarNombre("Desconocido");
        this.edad = validarEdad(18);
    }

    public String getNombre(){
        return nombre;
    }

    private String validarNombre(String nombre){
        if(nombre == null){
            return "Desconocido";
        }
        if(nombre.trim().isEmpty()){
            System.out.println("El parámetro nombre no es válido");
            return "Desconocido";
        }else{
            return nombre;
        }
    }

    public void setNombre(String nombre){
        this.nombre = validarNombre(nombre);
    }

    public int getEdad(){
        return edad;
    }

    private int validarEdad(int edad){
        if(edad < 0 || edad > 120){
            System.out.println("El parámetro edad no es válido");
            return 18;
        }else{
            return edad;
        }
    }

    public void setEdad(int edad){
        this.edad = validarEdad(edad);
    }

    public void saludar(){
        System.out.println("¡Hola! Me llamo " + nombre + " y tengo " + edad + " años. Gusto en conocerte." );
    }
}