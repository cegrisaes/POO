public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Leon leon = new Leon();
        Gato gato = new Gato();

        Animal[] animales = {perro, leon, gato};

        for(Animal animal:animales){
            animal.hacerRuido();
        }
    }
}
