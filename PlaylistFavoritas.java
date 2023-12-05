import java.util.List;

public class PlaylistFavoritas extends Playlist{
    //Atributos
    private List<Musica> musicasFavoritas;
   
    //Metodos
    public PlaylistFavoritas(List<Musica> musicasFavoritas) {
        super(musicasFavoritas);
        this.musicasFavoritas = musicasFavoritas;
    }


    //polimorfismo
    public void ExixbirPlaylist() {
        System.out.println("Playlist Favoritas");
        for(Musica m : musicasFavoritas) {
            System.out.println("Artista: "+m.getArtista());
            System.out.println("Titulo: "+m.getTitulo());   
            System.out.println("Duracao: "+m.getDuracao()); 
            System.out.println("---------------");
        }
    }
    
    public void TempoTotal() {
        int tempo = 0;
        
        for(Musica m : musicasFavoritas) {  
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