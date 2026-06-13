import java.util.Objects;

public class Perro {

    String nombre;
    int edad;
    String raza;
    boolean estaVacunado;

    public Perro(String nombre, int edad, String raza, boolean estaVacunado) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.estaVacunado = estaVacunado;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Perro) {
            Perro otroPerro = (Perro) obj;

            return edad == otroPerro.edad
                    && estaVacunado == otroPerro.estaVacunado
                    && nombre.equals(otroPerro.nombre)
                    && raza.equals(otroPerro.raza);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, raza, estaVacunado);
    }
}
