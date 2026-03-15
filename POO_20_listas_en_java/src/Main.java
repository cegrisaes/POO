import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        System.out.println("La lista tiene " + nombres.size() + " nombre(s).");
        nombres.add("Laura");
        System.out.println("La lista tiene " + nombres.size() + " nombre(s).");
        nombres.add("Carlos");
        nombres.add("Jorge");
        nombres.add("Sandra");
        System.out.println("La lista tiene " + nombres.size() + " nombre(s).");

        imprimirNombresVersionA(nombres);
        imprimirNombresVersionB(nombres);

        nombres.remove(1);
        imprimirNombresVersionA(nombres);

        nombres.set(0, "Claudia");
        imprimirNombresVersionA(nombres);
    }

    public static void imprimirNombresVersionA(List<String> nombres){
        System.out.println();
        for(String nombre:nombres){
            System.out.println(nombre);
        }
    }

    public static void imprimirNombresVersionB(List<String> nombres){
        System.out.println();
        for(int i = 0; i < nombres.size(); i++){
            System.out.println(nombres.get(i));
        }
    }
}
