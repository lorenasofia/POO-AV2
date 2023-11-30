public class Musica {
    // atributos privados encapsulados
    private String titulo;
    private String artista;
    private double duracao;

    public Musica(String titulo, String artista, double duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    // métodos de acesso públicos para encapsular os atributos
    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public double getDuracao() {
        return duracao;
    }
}
