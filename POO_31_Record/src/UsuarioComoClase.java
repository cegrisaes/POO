import java.util.Objects;

public class UsuarioComoClase {
    private final String nombre;
    private final String apellido;
    private final int numeroDeUsuario;

    public UsuarioComoClase(String nombre, String apellido, int numeroDeUsuario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeUsuario = numeroDeUsuario;
    }

    public String nombre() {
        return nombre;
    }

    public String apellido() {
        return apellido;
    }

    public int numeroDeUsuario() {
        return numeroDeUsuario;
    }

    @Override
    public String toString() {
        return "UsuarioComoClase[nombre=" + nombre +
                ", apellido=" + apellido +
                ", numeroDeUsuario=" + numeroDeUsuario + "]";
    }

    @Override
    public boolean equals(Object obj) {
        // Si ambos objetos tienen la misma referencia, son el mismo objeto
        if (this == obj) {
            return true;
        }

        // Si obj no es un UsuarioComoClase, no pueden ser iguales
        if (!(obj instanceof UsuarioComoClase usuario)) {
            return false;
        }

        // Comparamos los valores de todos los atributos
        return numeroDeUsuario == usuario.numeroDeUsuario()
                && nombre.equals(usuario.nombre())
                && apellido.equals(usuario.apellido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, numeroDeUsuario);
    }
}
