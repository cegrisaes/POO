public class Main {
    public static void main(String[] args) {
        Animal animal = new Perro();

        switch (animal){
            case Perro p -> System.out.println("Guau");
            case Gato g -> System.out.println("Miauu");
            case Leon l -> System.out.println("Grr");
        }
    }
} 
