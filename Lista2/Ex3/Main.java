package Ex3;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("Combustão", 126, 31243423);
        Carro car = new Carro("Honda", "City", motor);

        car.exibirFichaTecnica();
    }
}
