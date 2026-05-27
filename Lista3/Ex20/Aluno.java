package Lista3.Ex20;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
}
