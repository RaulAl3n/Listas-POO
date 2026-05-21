package Ex2;

public class Main {
    public static void main(String[] args) {
        Carteirinha cart = new Carteirinha(145090, "11/01/2025");
        Aluno al = new Aluno("Raul", 20, cart);

        al.exibirDados();
    }
}
