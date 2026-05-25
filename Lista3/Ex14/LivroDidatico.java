package Lista3.Ex14;

public class LivroDidatico extends Livro {
    private String disciplina;

    public LivroDidatico(String titulo, String autor, String disciplina) {
        super(titulo, autor);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public String info() {
        return super.info() + ", Disciplina: " + disciplina;
    }
}
