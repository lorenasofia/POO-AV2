import java.util.List;

public class PlaylistTemas extends Playlist{
    //Atributos
    private String temas;
    private List<Musica> musicasTematicas;
    
    //Metodos
    public PlaylistTemas(List<Musica> musicasTematicas) {
        super(musicasTematicas);
        this.musicasTematicas = musicasTematicas;
    }

    public String getTemas() {
        return temas;
    }

    public void setTemas(String temas) {
        this.temas = temas;
    }

    //polimorfismo
    public void ExixbirPlaylist() {
        System.out.println("Playlist " + temas);
        for(Musica m : musicasTematicas) {
            System.out.println("Artista: " + m.getArtista());
            System.out.println("Titulo: " + m.getTitulo());   
            System.out.println("Duracao: " + m.getDuracao()); 
            System.out.println("---------------");
        }
    }
    
    public void TempoTotal() {
        int tempo = 0;

        for(Musica m : musicasTematicas) {  
            tempo += m.getDuracao(); //segundos
        }

        int horas;
        int segundos;
        int minutos = tempo / 60;

        if (minutos < 60) {
            segundos = tempo % 60;
            System.out.println("Tempo total " + minutos + ":" + segundos);
        }
        else {
            horas = tempo / 3600;
            minutos = (tempo % 3600) / 60;
            segundos = tempo % 60;
            System.out.println("Tempo total " + horas + ":" + minutos + ":" + segundos);
            
        }
    }
   
}
