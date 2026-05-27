package Lista3.Ex20;

public class Coordenador extends Pessoa {
    private String matéria;

    public Coordenador(String nome, String matéria) {
        super(nome);
        this.matéria = matéria;
    }

    public String getMatéria() {
        return matéria;
    }
}
