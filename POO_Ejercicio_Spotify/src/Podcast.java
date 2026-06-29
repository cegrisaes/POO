public class Podcast extends ContenidoDeAudio implements Navegable{
    private String moderador;

    public Podcast(String titulo, String moderador){
        super(titulo);
        this.moderador = moderador;
    }

    @Override
    public void reproducir(){
        System.out.println("Se está reproduciendo el podcast " + getTitulo() + " de " + moderador + ".");
    }

    @Override
    public void pausar(){
        System.out.println("Se ha pausado el podcast " + getTitulo() + " de " + moderador + ".");
    }

    @Override
    public void adelantar15Segundos() {
        System.out.println("Se adelantó el podcast 15 segundos.");
    }

    @Override
    public void retroceder15Segundos() {
        System.out.println("Se retrocedió el podcast 15 segundos.");
    }

    @Override
    public void irACapitulo(int numeroCapitulo) {
        System.out.println("Nos fuimos al capítulo " + numeroCapitulo + " del podcast.");
    }
}
