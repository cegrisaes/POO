import java.util.List;

public class Carro {
    private String marca;
    private Motor motor;
    private List<Rueda> ruedas;

    public Carro(String marca, Motor motor, List<Rueda> ruedas){
        this.marca = marca;
        this.motor = motor;
        this.ruedas = ruedas;
    }

    public void encender(){
        System.out.println("El carro se está encendiendo...");
        motor.encender();
    }

    public void apagar(){
        System.out.println("El carro se está apagando...");
        motor.apagar();
    }

    public void obtenerInformacion(){
        System.out.println("Este carro es un " + marca + " con un motor " + motor.getTipo() + ".");
        System.out.println("Es un modelo con " + ruedas.size() + " ruedas.");
    }
}
