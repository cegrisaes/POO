import java.util.Arrays;

public class Programa6 {
    public static void main(String[] args) {
        int[] numeros = {1, 5, 20, 18, 3, 45, 37, 12, 2, 0};

        Arrays.sort(numeros);

        for(int numero : numeros){
            System.out.println(numero);
        }
    }
}
