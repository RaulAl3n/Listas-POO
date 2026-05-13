package Ex8;

public class Livro {
    public String titulo;
    public String autor;
    public int quantidadePaginas;
    public boolean emprestado;

    public Livro(String titulo, String autor, int quantidadePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadePaginas = quantidadePaginas;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }
    public boolean isEmprestado() {
        return emprestado;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("O livro não está emprestado.");
        }
    }

    public void verificarDisponibilidade() {
        if (emprestado) {
            System.out.println("O livro está emprestado.");
        } else {
            System.out.println("O livro está disponível.");
        }
    }

}
