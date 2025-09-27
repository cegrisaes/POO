public class Main {
    public static void main(String[] args) {
        String nombre1 = "Maria";
        String pais1 = "México";
        int edad1 = 20;
        presentarse(nombre1, pais1, edad1);

        String nombre2 = "Carlos";
        String pais2 = "Perú";
        int edad2 = 37;
        presentarse(nombre2, pais2, edad2);

        String nombre3 = "Laura";
        String pais3 = "Colombia";
        int edad3 = 28;
        presentarse(nombre3, pais3, edad3);

        String nombre4 = "Fido";
        String raza1 = "Labrador";
        int edad4 = 2;
        ladrar(nombre4, raza1, edad4);

        String nombre5 = "Firulais";
        String raza2 = "Pastor Alemán";
        int edad5 = 3;
        ladrar(nombre5, raza2, edad5);

    }

    public static void presentarse(String nombre, String pais, int edad){
        System.out.println("Hola, me llamo " + nombre);
        System.out.println("Mi edad es " + edad);
        System.out.println("Vengo de " + pais);
    }

    public static void ladrar(String nombre, String raza, int edad){
        System.out.println(nombre + ", un " + raza + " de " + edad + " años, está ladrando.");
        System.out.println("GUAU GUAU");
    }
}

