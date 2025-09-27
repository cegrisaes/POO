public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Carlos";
        persona1.edad = 40;
        persona1.saludar();

        Persona persona2 = new Persona();
        persona2.nombre = "Laura";
        persona2.edad = 18;
        persona2.saludar();
        persona2.edad = 23;

        persona1.saludar();
        persona2.saludar();

        Perro perro1 = new Perro();
        perro1.nombre = "Fido";
        perro1.raza = "Labrador";

        Perro perro2 = new Perro();
        perro2.nombre = "Firulais";
        perro2.raza = "Bulldog";

        perro1.ladrar();
        perro2.ladrar();
    }
}
