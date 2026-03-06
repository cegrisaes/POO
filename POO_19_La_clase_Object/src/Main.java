public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Fido", "Pastor alemán");
        Object perro2 = new Perro("Rocky", "Labrador");

        System.out.println(perro);
        System.out.println("Información sobre mi perro: " + perro2);
    }
}
