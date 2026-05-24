package Lista3.Ex8;

public class Aluno extends Pessoa{
    private String curso;
    private int matricula;

    public Aluno(String nome, int idade, String curso, int matricula) {
        super(nome, idade);
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }
    public int getMatricula() {
        return matricula;
    }
}
