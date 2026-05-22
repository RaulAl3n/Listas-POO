package Lista3.Ex3;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 4);
        Moto moto = new Moto("Honda", "CB500", 500);
        Carro lixo = new Carro("Hyundai", "Veloster", 3);

        System.out.println("Informações do Carro:");
        carro.exibirInformacoes();

        System.out.println("\nInformações da Moto:");
        moto.exibirInformacoes();

        System.out.println("\nInformações do carro mais lixo que tem:");
        lixo.exibirInformacoes();
    }
}
