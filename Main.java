import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // criando instâncias de músicas
        Musica musica1 = new Musica("Música 1", "Artista 1", 3.5);
        Musica musica2 = new Musica("Música 2", "Artista 2", 4.2);
        Musica musica3 = new Musica("Música 3", "Artista 3", 2.8);

        // criando instâncias de playlists
        List<Musica> musicasPlaylist = new ArrayList<>();
        musicasPlaylist.add(musica1);
        musicasPlaylist.add(musica2);
        musicasPlaylist.add(musica3);

        Playlist playlist = new Playlist(musicasPlaylist);
        PlaylistFavoritas playlistFavoritas = new PlaylistFavoritas(musicasPlaylist, List.of(musica1, musica2));
        PlaylistTemas playlistTemas = new PlaylistTemas(musicasPlaylist, "MPB");

        // testando polimorfismo
        System.out.println("Tempo total da Playlist: " + playlist.calcularTempoTotal() + " minutos");
        System.out.println("Tempo total da Playlist Favoritas: " + playlistFavoritas.calcularTempoTotal() + " minutos");
        System.out.println("Tempo total da Playlist Temas: " + playlistTemas.calcularTempoTotal() + " minutos");
    }
}
