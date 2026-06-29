public class Audiobook extends ContenidoDeAudio implements Navegable{
    private String autor;

    public Audiobook(String titulo, String autor){
        super(titulo);
        this.autor = autor;
    }

    @Override
    public void reproducir(){
        System.out.println("Se está reproduciendo el audiobook " + getTitulo() + " de " + autor + ".");
    }

    @Override
    public void pausar(){
        System.out.println("Se ha pausado el audiobook " + getTitulo() + " de " + autor + ".");
    }

    @Override
    public void adelantar15Segundos() {
        System.out.println("Se adelantó el audiobook 15 segundos.");
    }

    @Override
    public void retroceder15Segundos() {
        System.out.println("Se retrocedió el audiobook 15 segundos.");
    }

    @Override
    public void irACapitulo(int numeroCapitulo) {
        System.out.println("Nos fuimos al capítulo " + numeroCapitulo + " del audiobook.");
    }
}
