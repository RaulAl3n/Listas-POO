package JogoDaVelha.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.CascadeType;

@Entity
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Jogador jogadorX;

    @OneToOne(cascade = CascadeType.ALL)
    private Jogador jogadorO;

    @OneToOne(cascade = CascadeType.ALL)
    private Jogador vencedor;

    private String tabuleiro;

    @Enumerated(EnumType.STRING)
    private Simbolo turnoAtual;

    @Enumerated(EnumType.STRING)
    private StatusPartida status;

    public Partida() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setJogadorX(Jogador jogadorX) {
        this.jogadorX = jogadorX;
    }

    public void setJogadorO(Jogador jogadorO) {
        this.jogadorO = jogadorO;
    }

    public void setTabuleiro(String tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public void setTurnoAtual(Simbolo turnoAtual) {
        this.turnoAtual = turnoAtual;
    }

    public void setStatus(StatusPartida status) {
        this.status = status;
    }

    public void setVencedor(Jogador vencedor) {
        this.vencedor = vencedor;
    }

    public long getId() {
        return id;
    }

    public Jogador getJogadorX() {
        return jogadorX;
    }

    public Jogador getJogadorO() {
        return jogadorO;
    }

    public String getTabuleiro() {
        return tabuleiro;
    }

    public Simbolo getTurnoAtual() {
        return turnoAtual;
    }

    public StatusPartida getStatus() {
        return status;
    }

    public Jogador getVencedor() {
        return vencedor;
    }

    public boolean posicaoLivre(int linha, int coluna) {
        int indice = linha * 3 + coluna;
        return tabuleiro.charAt(indice) == '-';
    }

    public void marcarPosicao(int linha, int coluna, Simbolo simbolo) {
        int indice = linha * 3 + coluna;

        char[] vetor = tabuleiro.toCharArray();

        vetor[indice] = simbolo.name().charAt(0);

        tabuleiro = new String(vetor);
    }

    public boolean verificarVitoria(Simbolo simbolo) {
        char s = simbolo.name().charAt(0);

        // linhas
        if (tabuleiro.charAt(0) == s && tabuleiro.charAt(1) == s && tabuleiro.charAt(2) == s)
            return true;

        if (tabuleiro.charAt(3) == s && tabuleiro.charAt(4) == s && tabuleiro.charAt(5) == s)
            return true;

        if (tabuleiro.charAt(6) == s && tabuleiro.charAt(7) == s && tabuleiro.charAt(8) == s)
            return true;

        // colunas
        if (tabuleiro.charAt(0) == s && tabuleiro.charAt(3) == s && tabuleiro.charAt(6) == s)
            return true;

        if (tabuleiro.charAt(1) == s && tabuleiro.charAt(4) == s && tabuleiro.charAt(7) == s)
            return true;

        if (tabuleiro.charAt(2) == s && tabuleiro.charAt(5) == s && tabuleiro.charAt(8) == s)
            return true;

        // diagonal principal
        if (tabuleiro.charAt(0) == s && tabuleiro.charAt(4) == s && tabuleiro.charAt(8) == s)
            return true;

        // diagonal secundária
        if (tabuleiro.charAt(2) == s && tabuleiro.charAt(4) == s && tabuleiro.charAt(6) == s)
            return true;

        return false;
    }

    public boolean tabuleiroCheio() {
        return !tabuleiro.contains("-");
    }

    public void alternarTurno() {
        if (turnoAtual == Simbolo.X) {
            turnoAtual = Simbolo.O;
        } else {
            turnoAtual = Simbolo.X;
        }
    }
}
