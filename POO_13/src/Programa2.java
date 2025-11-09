public class Programa2 {
    public static void main(String[] args) {
        Punto[] puntos = new Punto[3];
        puntos[0] = new Punto(2.6, 6);
        puntos[1] = new Punto(1.45, 90.37);
        puntos[2] = new Punto(10.5, 44.4);

        for(Punto punto : puntos){
            System.out.println("x: " + punto.x + ", y: " + punto.y);
        }
    }
}
