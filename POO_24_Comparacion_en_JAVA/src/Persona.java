import java.util.Objects;

public class Persona {
    public String nombre;
    public int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj instanceof Persona){
           Persona otraPersona = (Persona) obj;
           return this.edad == otraPersona.edad && this.nombre.equals(otraPersona.nombre);
       }

       return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(nombre, edad);
    }
}
