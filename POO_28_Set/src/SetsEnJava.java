import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetsEnJava {
    public static void main(String[] args) {
        Set<String> setDeNombres = new HashSet<>();

        setDeNombres.add("Gokú");
        setDeNombres.add("Vegeta");
        setDeNombres.add("Freezer");
        setDeNombres.add("Krilin");
        setDeNombres.add("Krilin");
        setDeNombres.add("Krilin");
        System.out.println(setDeNombres);

        setDeNombres.size();
        setDeNombres.isEmpty();
        setDeNombres.contains("Gokú");
        setDeNombres.contains("Gohan");

        for(String nombre: setDeNombres){
            System.out.println(nombre);
        }

        List<String> listaDeNombres = new ArrayList<>(setDeNombres);
        String primerNombre = listaDeNombres.get(0);
        String segundoNombre = listaDeNombres.get(1);
        String tercerNombre = listaDeNombres.get(2);
        String cuartoNombre = listaDeNombres.get(3);

        List<String> listaDeJugadores = new ArrayList<>();
        listaDeJugadores.add("Haaland");
        listaDeJugadores.add("Haaland");
        listaDeJugadores.add("Messi");
        listaDeJugadores.add("Neymar");
        listaDeJugadores.add("Neymar");

        System.out.println(listaDeJugadores);

        Set<String> setDeJugadores = new HashSet<>(listaDeJugadores);
        System.out.println(setDeJugadores);
    }
}
