public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.raza = "Labrador";
        perro.nombre = "Fido";
        perro.peso = 13.5;
        perro.estaVivo = true;
        perro.ladrar();
        perro.comer();
        perro.dormir();

        Leon leon = new Leon();
        leon.tieneMelena = true;
        leon.nombre = "Simba";
        leon.peso = 100;
        leon.estaVivo = true;
        leon.cazar();
        leon.comer();
        leon.dormir();
    }
}
