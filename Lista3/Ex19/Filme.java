package Lista3.Ex19;

public class Filme extends Midia {
    private String diretor;

    public Filme(String titulo, int ano, String diretor) {
        super(titulo, ano);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }
    
}
