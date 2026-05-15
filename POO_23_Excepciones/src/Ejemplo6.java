public class Ejemplo6 {
    public static void main(String[] args) {
        String nombre = null;

        if(nombre != null){
            int numeroDeCaracteres = nombre.length();
            System.out.println(nombre + " tiene " + numeroDeCaracteres + " caracteres.");
        }
    }
}
