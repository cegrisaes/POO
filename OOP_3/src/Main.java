public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Manuel",45);
        persona1.saludar();

        Persona persona2 = new Persona( "Laura", 22);
        persona2.saludar();

        Persona persona3 = new Persona("Luis");
        Persona persona4 = new Persona(37);

        persona3.saludar();
        persona4.saludar();

        Persona persona5 = new Persona();
        persona5.saludar();
    }
}