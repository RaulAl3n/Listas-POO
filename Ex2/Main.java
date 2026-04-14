package Ex2;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 2500.00f);
        Produto produto2 = new Produto("Smartphone", 1500.00f);

        produto1.mostrarProduto();
        produto2.mostrarProduto();
    }
}
