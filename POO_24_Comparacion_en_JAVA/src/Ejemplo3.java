public class Ejemplo3 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Carlos", 45);
        Persona persona2 = new Persona("Carlos", 30);

        if(persona1.equals(persona2)){
            System.out.println("Son iguales.");
        }else{
            System.out.println("No son iguales.");
        }
    }
}