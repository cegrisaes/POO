public record Usuario(String nombre, String apellido, int numeroDeUsuario, int edad) implements Identificable{

    public static final String NOMBRE_POR_DEFECTO = "Luis";

    public Usuario {
        System.out.println("El usuario ha sido creado.");
    }

    public static void unMetodoEstatico(){
        System.out.println("Este es un método estático.");
    }

    public String nombreAMayusculas(){
        return nombre().toUpperCase();
    }

    @Override
    public int obtenerNumeroDeUsuario() {
        return numeroDeUsuario;
    }
}
