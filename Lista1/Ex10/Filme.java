package Ex10;

public class Filme {
    public String titulo;
    public String genero;
    public double duracao;
    public double avaliacao;

    public Filme(String titulo, String genero, double duracao, double avaliacao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.avaliacao = avaliacao;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getGenero() {
        return genero;
    }
    public double getDuracao() {
        return duracao;
    }
    public double getAvaliacao() {
        return avaliacao;
    }

    public void exibirFichaTecnica() {
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Duração: " + duracao + " horas");
        System.out.println("Avaliação: " + avaliacao + " estrelas");
    }

    public void alterarAvaliacao(double novaAvaliacao) {
        this.avaliacao = novaAvaliacao;
        System.out.println("Avaliação atualizada para: " + this.avaliacao + " estrelas");
    }
}
