public class Motor {
    private String tipo;

    public Motor(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void encender() {
        System.out.println("Encendiendo el motor...");
    }

    public void apagar() {
        System.out.println("Apagando el motor...");
    }
}
