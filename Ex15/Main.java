package Ex15;

public class Main {
    public static void main(String[] args) {
        LivroBiblioteca livro1 = new LivroBiblioteca("Senhor dos aneis", "J.R.R. Tolkien", "12345");
        LivroBiblioteca livro2 = new LivroBiblioteca("Harry Potter", "J.K. Rowling", "67890");
        LivroBiblioteca livro3 = new LivroBiblioteca("O Hobbit", "J.R.R. Tolkien", "54321");

        livro1.exibirInformacoes();
        livro1.emprestar();
        livro1.exibirInformacoes();
        livro1.devolver();

        livro2.exibirInformacoes();
        livro2.emprestar();
        livro2.exibirInformacoes();

        livro3.exibirInformacoes();
        livro3.emprestar();
        livro3.exibirInformacoes();

    }
}
