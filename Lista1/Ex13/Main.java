package Ex13;

public class Main {
    public static void main(String[] args) {
        ClasseJogador jogador1 = new ClasseJogador("Carlos", 0, 1);

        System.out.println("Nome do Jogador: " + jogador1.getNome());
        System.out.println("Pontuação: " + jogador1.getPontuacao());
        System.out.println("Nível: " + jogador1.getNivel());

        jogador1.adcionarPontos(500);
        int nivelSubido = jogador1.getPontuacao() / 100;

        for (int i = 0; i < nivelSubido; i++) {
            jogador1.subirNivel();
        }

        System.out.println("\nApós ganhar " + jogador1.getPontuacao() + " pontos e subir de nível:");
        System.out.println("Pontuação: " + jogador1.getPontuacao());
        System.out.println("Nível: " + jogador1.getNivel());
    }
}
