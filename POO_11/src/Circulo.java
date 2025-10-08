public class Circulo {
    private double radio;
    public static final double PI = 3.1416;

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void imprimirArea(){
       double area = PI * radio * radio;
       System.out.println(area);
    }
}
