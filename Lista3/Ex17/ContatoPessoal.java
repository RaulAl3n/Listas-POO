package Lista3.Ex17;

public class ContatoPessoal extends Contato {
    private String relacao;

    public ContatoPessoal(String relacao, String nome, String telefone) {
        super(nome, telefone);
        this.relacao = relacao;
    }

    public String getRelacao() {
        return relacao;
    }
}
