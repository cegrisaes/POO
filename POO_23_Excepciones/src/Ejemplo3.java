public class Ejemplo3 {
    public static void main(String[] args) {
        String nombre = "Pepe";
        String numeroComoString = "abc";

        try{
            int numeroDeCaracteres = nombre.length();
            System.out.println(nombre + " tiene " + numeroDeCaracteres + " caracteres.");

            int numero = Integer.parseInt(numeroComoString);
            System.out.println("El número es " + numero);
        }catch(NumberFormatException nfe){
            System.out.println("La variable numeroComoString debe representar un número entero.");
        }catch (NullPointerException npe){
            System.out.println("No se puede leer el tamaño de nombre, porque nombre tiene el valor null.");
        }
    }
}
