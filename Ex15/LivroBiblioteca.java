package Ex15;

public class LivroBiblioteca {
    public String titulo;
    public String autor;
    public String codigo;
    public boolean disponivel = true;

    public LivroBiblioteca(String titulo, String autor, String codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getCodigo() {
        return codigo;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("\nLivro emprestado com sucesso!");
        } else {
            System.out.println("\nLivro indisponível para empréstimo.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("\nLivro devolvido com sucesso!");
    }

    public void exibirInformacoes() {
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Código: " + codigo);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }
}
