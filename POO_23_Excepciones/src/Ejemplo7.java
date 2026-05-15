import java.util.Scanner;

public class Ejemplo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número: ");
            String numeroComoString = scanner.nextLine();
            int numero = Integer.parseInt(numeroComoString);
            System.out.println("El número es " + numero);
        } catch (NumberFormatException e) {
            System.out.println("La variable numeroComoString debe representar un número entero.");
        } finally {
            scanner.close();
        }
    }
}
