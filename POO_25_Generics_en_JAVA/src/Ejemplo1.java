import java.util.ArrayList;
import java.util.List;

public class Ejemplo1 {
    public static void main(String[] args) {
        List<String> listaDeStrings = new ArrayList<>();
        listaDeStrings.add("Hola");
        // imprimirLista(listaDeStrings);

        List<Animal> listaDeLeones = new ArrayList<>();
        listaDeLeones.add(new Leon());
        imprimirLista(listaDeLeones);
    }

    private static void imprimirLista(List<? super Animal> lista){
        System.out.println(lista);
    }
}

