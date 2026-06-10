package Lista3.Ex19;

public class Musica extends Midia {
    private String artista;

    public Musica(String titulo, int ano, String artista) {
        super(titulo, ano);
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }
    
}
