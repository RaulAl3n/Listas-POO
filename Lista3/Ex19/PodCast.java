package Lista3.Ex19;

public class PodCast extends Midia {
    private String apresentador;

    public PodCast(String titulo, int ano, String apresentador) {
        super(titulo, ano);
        this.apresentador = apresentador;
    }

    public String getApresentador() {
        return apresentador;
    }
}
