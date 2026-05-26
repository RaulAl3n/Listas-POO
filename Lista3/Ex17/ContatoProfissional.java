package Lista3.Ex17;

public class ContatoProfissional extends Contato {
    private String empresa;

    public ContatoProfissional(String empresa, String nome, String telefone) {
        super(nome, telefone);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }
}
