import java.util.List;

public class PlaylistFavoritas extends Playlist {

    private List<Musica> musicasFavoritas;

    public PlaylistFavoritas(List<Musica> musicas, List<Musica> musicasFavoritas) {
        super(musicas);
        this.musicasFavoritas = musicasFavoritas;
    }

    // método para obter as músicas favoritas
    public List<Musica> getMusicasFavoritas() {
        return musicasFavoritas;
    }

}
