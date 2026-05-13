package Ex13;

public class ClasseJogador {
    public String nome;
    public int pontuacao;
    public int nivel;

    public ClasseJogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }
    public int getPontuacao() {
        return pontuacao;
    }
    public int getNivel() {
        return nivel;
    }

    public void adcionarPontos(int valor) {
        this.pontuacao += valor;
    }
    public void subirNivel() {
        this.nivel++;
    }   
}
