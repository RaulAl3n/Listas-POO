package Ex8;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua A", 100, "Bairro B", "Cidade C");
        Casa casa = new Casa("Azul", 3, endereco);
        
        casa.exibirInformacoes();
    }
}
