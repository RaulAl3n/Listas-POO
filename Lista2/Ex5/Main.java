package Ex5;

public class Main {
    public static void main(String[] args) {
        ISBN isbn = new ISBN(3432425, "Mauricio de Souza");
        Livro livro = new Livro("Turma da Monica","Mauricio de Souza",isbn);

        livro.exibirDados();
    }
}
