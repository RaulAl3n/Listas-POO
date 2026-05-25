package Lista3.Ex10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto p1 = new Produto("Camiseta", 29.99);
        Produto p2 = new Produto("Calça", 49.99);
        Produto p3 = new Produto("Tênis", 89.99);
        Produto p4 = new Produto("Boné", 19.99);
        Produto p5 = new Produto("Jaqueta", 99.99);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);

        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + " - Preço: R$" + produto.getPreco());
        }

        double maior = 0;

        for(Produto produto : produtos) {
            if(produto.getPreco() > maior) {
                maior = produto.getPreco();
            }
        }
        System.out.println("Maior preço: R$" + maior);
    }
}
