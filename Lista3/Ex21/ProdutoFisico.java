package Lista3.Ex21;

public class ProdutoFisico extends Produto {
    private double peso;

    public ProdutoFisico(String nome, double valor, double peso) {
        super(nome, valor);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
}
