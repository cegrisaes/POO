import java.util.ArrayList;
import java.util.List;

public class Tests {
    public static void main(String[] args) {
        List<String> jugadores = new ArrayList<>();
        jugadores.add("Messi");
        jugadores.add("Haaland");
        jugadores.add("Mbappé");

        List<Integer> goles = new ArrayList<>();
        goles.add(30);
        goles.add(35);
        goles.add(29);


        // entocnes podriamos hacer algo como esto
        System.out.println(jugadores.get(0) + " tiene " + goles.get(0) + " goles.");
        // esto es el delete que debe ser agregado despues de (*)
        goles.remove(2);
        // o tambien usar un for loop.
        for(int i = 0; i < jugadores.size(); i++){
            System.out.println(jugadores.get(i) + " tiene " + goles.get(i) + " goles.");
        }
        // el problema esta que estamos dependiendo de las popisciones.
        // es decir tenemos que asegurarnos de que ambas listas siempre esten sincronozadas.
        // en el caso que no lo esten, por ejemplo si eliminamos antes de llegar al bucle (*), los goles de mbappe, es decir ,
        // el tercer elemento de goles, pues hay un error. ya que ya no existe el elemento en la posicion 2 de goles.
        // enmtocnes tenemos indexoutofbounds.

        // y ademas etsamos usando dos listas para representar una sola relacion.
        // seguro que debve haber una estructura de datos que lo haga mejor y mas sencillo.

        // existe mao, mientras una lista alamancena elementos, un map, al macena pares de clave y valor. 
    }
}
