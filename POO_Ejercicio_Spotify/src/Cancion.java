public class Cancion extends ContenidoDeAudio{
    private String artista;

    public Cancion(String titulo, String artista){
        super(titulo);
        this.artista = artista;
    }

    @Override
    public void reproducir(){
        System.out.println("Se está reproduciendo la canción " + getTitulo() + " de " + artista + ".");
    }

    @Override
    public void pausar(){
        System.out.println("Se ha pausado la canción " + getTitulo() + " de " + artista + ".");
    }
}
