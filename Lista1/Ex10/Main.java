package Ex10;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O Senhor dos Anéis: A Sociedade do Anel", "Fantasia/Aventura", 2.5, 4.8);

        filme1.exibirFichaTecnica();

        System.out.println("\nAtualizando avaliação...");
        filme1.alterarAvaliacao(4.9);
        filme1.exibirFichaTecnica();
    }
}
