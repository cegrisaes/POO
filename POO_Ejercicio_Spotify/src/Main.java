public class Main {
    public static void main(String[] args) {
        Cancion cancion = new Cancion("Baile inolvidable", "Bad Bunny");
        Podcast podcast = new Podcast("Clases Abstractas", "Cegrisaes");
        Audiobook audiobook = new Audiobook("El Aleph", "Jorge Luis Borges");

        Playlist playlist = new Playlist("POO", "Cegrisaes");
        playlist.agregarContenidoDeAudio(cancion);
        playlist.agregarContenidoDeAudio(podcast);
        playlist.agregarContenidoDeAudio(audiobook);

        playlist.reproducirTodo();
    }
}
