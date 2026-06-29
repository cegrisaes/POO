public abstract class ContenidoDeAudio {
    private String titulo;

    public ContenidoDeAudio(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public abstract void reproducir();
    public abstract void pausar();
}
