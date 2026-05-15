public class Ejemplo1 {
    public static void main(String[] args) {
        String nombre = null;

        try{
            int numeroDeCaracteres = nombre.length();
            System.out.println(nombre + " tiene " + numeroDeCaracteres + " caracteres.");
        }catch (NullPointerException npe){
            System.out.println("No se puede leer el tamaño de nombre, porque nombre tiene el valor null.");
        }
        System.out.println("El programa continúa");
    }
}
