package Ex5;

public class Livro {
    private String titulo;
    private String autor;
    private ISBN isbn;

    public Livro(String titulo, String autor, ISBN isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public ISBN getIsbn() {
        return isbn;
    }

    public void exibirDados(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        isbn.exibirDados();
    }
}
