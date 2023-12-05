import java.util.List;

public class Playlist {
    //Atributos
    protected List<Musica> musicas;

    //Metodos
    public Playlist(List<Musica> musicas) {
        this.musicas = musicas;

    }

    //polimorfismo
    public void ExixbirPlaylist() {
        System.out.println("Playlist Geral");
        for(Musica m : musicas) {
            System.out.println("Artista: "+m.getArtista());
            System.out.println("Titulo: "+m.getTitulo());   
            System.out.println("Duracao: "+m.getDuracao()); 
            System.out.println("---------------");
        }
    }
    
    public void TempoTotal() {
        int tempo = 0;
        
        for(Musica m : musicas) {  
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