package Ex6;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Honda", "City");

        carro1.acelerar(50);
        carro1.exibirVelocidade();

        carro1.frear(20);
        carro1.exibirVelocidade();

        carro1.exibirVelocidade();
    }
}
