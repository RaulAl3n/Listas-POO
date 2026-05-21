public class Main {
    public static void main(String[] args) {
        CPF cpf = new CPF(231243143, "REGULAR");
        Pessoa pessoa = new Pessoa("Raul", 20, cpf);

        pessoa.exibirDados();
    }
}
