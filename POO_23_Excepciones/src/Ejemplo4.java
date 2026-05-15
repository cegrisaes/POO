public class Ejemplo4 {
    public static void main(String[] args) {
        String nombre = "Pepe";

        try{
            int numeroDeCaracteres = nombre.length();
            System.out.println(nombre + " tiene " + numeroDeCaracteres + " caracteres.");
        }catch (NullPointerException npe){
            System.out.println("No se puede leer el tamaño de nombre, porque nombre tiene el valor null.");
        }finally{
            System.out.println("Finally siempre se ejecuta.");
        }
    }
}
