package Lista3.Ex15;

public class Estagiario extends Funcionario {
    private String curso;

    public Estagiario(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }
}
