package Ex6;

public class Main {
    public static void main(String[] args) {
        Cracha cra = new Cracha(23134, "21/02/26");
        Funcionario func = new Funcionario("Raul", "Junior", cra);

        func.exibirFuncionario();
    }
}
