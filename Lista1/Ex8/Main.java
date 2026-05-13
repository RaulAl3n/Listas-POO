package Ex8;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1178);

        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Quantidade de Páginas: " + livro1.getQuantidadePaginas());

        livro1.verificarDisponibilidade();

        livro1.emprestar();
        livro1.verificarDisponibilidade();

        livro1.devolver();
        livro1.verificarDisponibilidade();
    }
}
