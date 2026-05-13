package Ex2;

public class Produto {
    private String nome;
    private float preco;
    
    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public String getNome() {
        return nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void mostrarProduto() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("Preço: " + this.preco);
    }
}
