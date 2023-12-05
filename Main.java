import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        File path = new File("SongCSV.csv");

        List <Musica> lis = new ArrayList<>();
        List <Musica> lisTema = new ArrayList<>();
        List <Musica> lisFavorita = new ArrayList<>();
        
        int menu;
        boolean loopMenu = true;

        //Adicionando musicas ao array lis (Todo o arquivo csv)
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String lendo = br.readLine();
            while (lendo!=null) {
                String[] cortar = lendo.split(",");
                String artista = cortar[1];
                Double duracao = Double.parseDouble(cortar[2]);
                String titulo = cortar[3];            
                lis.add(new Musica(titulo, artista, duracao));
                
                lendo = br.readLine();
            }
        } 
        
        catch (IOException e) {
            System.out.println("erro"+e.getLocalizedMessage());
        }
        
        //Adicionando musicas ao array lisTema (todos os indices pares)
        for (int i = 0; i < lis.size(); i += 2) {
            lisTema.add(lis.get(i));
        }

        //Adicionando musicas ao array lisFavoritas (todos os indices impares)
        for (int i = 1; i < lis.size(); i += 2) {
            lisFavorita.add(lis.get(i));
        }
        
        //Passa os arrays aos respectivos objetos playlist 
        Playlist play = new Playlist(lis);
        PlaylistTemas tema = new PlaylistTemas(lisTema);
        PlaylistFavoritas fav = new PlaylistFavoritas(lisFavorita);
        

        //Loop Menu
        while (loopMenu == true) {
            System.out.println("Escolha a playlist:");
            System.out.println("1- Playlist Geral");
            System.out.println("2- Playlist Eletrônica");
            System.out.println("3- Playlist Favoritas");
            menu = sc.nextInt();

            switch (menu) {

            case 1:
            //Playlist Geral
            play.ExixbirPlaylist();
            play.TempoTotal();
            break;

            case 2:
            //Playlist Tema
            tema.setTemas("Eletrônica");
            tema.ExixbirPlaylist();
            tema.TempoTotal();
            break;

            case 3:
            //Playlist Favorita
            fav.ExixbirPlaylist();
            fav.TempoTotal();
            break;
    
            default:
            System.out.println("ERROR");
            break;
            }
        }
        sc.close();  
    }
}