package Lista3.Ex21;

public class ProdutoDigital extends Produto {
    private String formato;

    public ProdutoDigital(String nome, double valor, String formato) {
        super(nome, valor);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }
}
