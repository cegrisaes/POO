public class Main {
    public static void main(String[] args) {
        System.out.println(Persona.getNumeroDePersonas());
        Persona persona1 = new Persona("Clara", 23);
        persona1.saludar();
        System.out.println(Persona.getNumeroDePersonas());
        Persona persona2 = new Persona("Ricardo", 32);
        persona2.saludar();
        System.out.println(Persona.getNumeroDePersonas());
    }
}
