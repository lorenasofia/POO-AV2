import java.util.List;

public class PlaylistTemas extends Playlist {
    
    private String tema;

    public PlaylistTemas(List<Musica> musicas, String tema) {
        super(musicas);
        this.tema = tema;
    }

    // método para obter o tema
    public String getTema() {
        return tema;
    }
}
