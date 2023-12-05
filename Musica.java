public class Musica {
    //Atributos
    private String titulo;
    private String artista;
    private Double duracao;

    //Metodos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }

    public Musica(String titulo, String artista, Double duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }
    
}
