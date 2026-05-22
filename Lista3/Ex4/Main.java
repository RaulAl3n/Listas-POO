package Lista3.Ex4;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Maria", 3000.00);
        Gerente gerente = new Gerente("Carlos", 5000.00, "Vendas");

        System.out.println("Informações do Funcionário:");
        funcionario.exibirInformacoes();

        System.out.println("\nInformações do Gerente:");
        gerente.exibirInformacoes();
    }
}
