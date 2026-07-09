public class Impresora <T extends Animal & Cazador & Volador, V>{
    private T elemento;
    private V otroELemento;

    public Impresora(T elemento, V otroELemento){
        this.elemento = elemento;
        this.otroELemento = otroELemento;
    }

    public void imprimir(){
        System.out.println(elemento);
        System.out.println(otroELemento);
    }

    public T retornarElemento(){
        return elemento;
    }
}
