import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("V8");
        List<Rueda> ruedas = new ArrayList<>();
        ruedas.add(new Rueda("verano"));
        ruedas.add(new Rueda("verano"));
        ruedas.add(new Rueda("verano"));
        ruedas.add(new Rueda("verano"));

        Carro carro = new Carro("Ferrari", motor, ruedas);

        carro.encender();
        carro.obtenerInformacion();
        carro.apagar();
    }
}
