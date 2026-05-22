package Lista3.Ex4;

public class Gerente extends Funcionario {
    private String setor;

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    public String getsetor() {
        return setor;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("setor: " + setor);
    }
}
