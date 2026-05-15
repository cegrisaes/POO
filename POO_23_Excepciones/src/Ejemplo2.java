public class Ejemplo2 {
    public static void main(String[] args) {
        String numeroComoString = "45";

        try{
            int numero = Integer.parseInt(numeroComoString);
            System.out.println("El número es " + numero);
        }catch(NumberFormatException nfe){
            System.out.println("La variable numeroComoString debe representar un número entero.");
        }

    }
}
