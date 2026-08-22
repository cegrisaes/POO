import java.util.HashMap;
import java.util.Map;

public class Ejemplo {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();

        mapa.put("Yamal", 10);
        mapa.put("Messi", 20);
        mapa.put("Haaland", 30);
        mapa.put("Mbappe", 40);

        System.out.println(mapa);

        mapa.put("Messi", 50);

        System.out.println(mapa);

        System.out.println(mapa.containsKey("Messi"));
        System.out.println(mapa.containsKey("Kane"));

        System.out.println(mapa.containsValue(40));
        System.out.println(mapa.containsValue(100));

        System.out.println(mapa.get("Yamal"));
        System.out.println(mapa.get("Kane"));

        System.out.println(mapa.keySet());
        System.out.println(mapa.values());

        mapa.remove("Mbappe");

        System.out.println(mapa);

        mapa.size();
        mapa.clear();
    }
}
