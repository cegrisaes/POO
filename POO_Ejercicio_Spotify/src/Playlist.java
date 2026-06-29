import java.util.ArrayList;

public class Playlist {
    private String nombre;
    private String creador;
    private ArrayList<ContenidoDeAudio> contenidosDeAudio;

    public Playlist(String nombre, String creador) {
        this.nombre = nombre;
        this.creador = creador;
        this.contenidosDeAudio = new ArrayList<>();
    }

    public void agregarContenidoDeAudio(ContenidoDeAudio contenidoDeAudio) {
        contenidosDeAudio.add(contenidoDeAudio);
    }

    public void reproducirTodo() {
        for (ContenidoDeAudio contenidoDeAudio : contenidosDeAudio) {
            contenidoDeAudio.reproducir();
        }
    }
}
