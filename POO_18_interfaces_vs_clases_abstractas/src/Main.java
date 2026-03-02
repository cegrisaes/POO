public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Leon leon = new Leon();
        Gato gato = new Gato();
        Aguila aguila = new Aguila();

        Animal[] animales = {perro, leon, gato, aguila};

        for(Animal animal:animales){
            animal.hacerRuido();
        }

        Avion avion = new Avion();
        Dron dron = new Dron();

        Volador[] voladores = {aguila, avion, dron};

        for(Volador volador:voladores){
            volador.volar();
            volador.aterrizar();
        }
    }
}
