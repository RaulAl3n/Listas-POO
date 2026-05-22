package Ex8;

public class Casa {
    private String cor;
    private int quantidadeQuartos;
    private Endereco endereco;

    public Casa(String cor, int quantidadeQuartos, Endereco endereco) {
        this.cor = cor;
        this.quantidadeQuartos = quantidadeQuartos;
        this.endereco = endereco;
    }

    public String getCor() {
        return cor;
    }

    public int getQuantidadeQuartos() {
        return quantidadeQuartos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void exibirInformacoes() {
        System.out.println("Cor: " + cor);
        System.out.println("Quantidade de Quartos: " + quantidadeQuartos);
        System.out.println("Endereço:");
        endereco.exibirEndereco();
    }
}
