package Ex7;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", "Analista", 3000.00);

        funcionario1.exibirFuncionario();

        funcionario1.aumentarSalario(10);

        funcionario1.exibirFuncionario();
    }
}
