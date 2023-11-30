import java.util.List;

public class Playlist {
    // atributo comum para todas as playlists
    protected List<Musica> musicas;

    public Playlist(List<Musica> musicas) {
        this.musicas = musicas;
    }

    // método para calcular o tempo total de reprodução
    public double calcularTempoTotal() {
        double tempoTotal = 0;
        for (Musica musica : musicas) {
            tempoTotal += musica.getDuracao();
        }
        return tempoTotal;
    }
}
