package JogoDaVelha.demo.service;

import JogoDaVelha.demo.exception.JogadaInvalidaException;
import JogoDaVelha.demo.exception.PartidaEncerradaException;
import JogoDaVelha.demo.exception.PartidaNaoEncontradaException;
import JogoDaVelha.demo.model.Jogador;
import JogoDaVelha.demo.model.Partida;
import JogoDaVelha.demo.model.Simbolo;
import JogoDaVelha.demo.model.StatusPartida;
import JogoDaVelha.demo.repository.PartidaRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidaService {

    private final PartidaRepository repository;

    public PartidaService(PartidaRepository repository) {
        this.repository = repository;
    }

    public Partida criar(String nomeX, String nomeO) {
        Jogador jogadorX = new Jogador();
        jogadorX.setNome(nomeX);
        jogadorX.setSimbolo(Simbolo.X);

        Jogador jogadorO = new Jogador();
        jogadorO.setNome(nomeO);
        jogadorO.setSimbolo(Simbolo.O);

        Partida partida = new Partida();

        partida.setJogadorX(jogadorX);
        partida.setJogadorO(jogadorO);

        partida.setTabuleiro("---------");

        partida.setTurnoAtual(Simbolo.X);

        partida.setStatus(StatusPartida.EM_ANDAMENTO);

        return repository.save(partida);
    }

    public List<Partida> listar() {
        return repository.findAll();
    }

    public Partida buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Partida jogar(Long id, Simbolo simbolo, int linha, int coluna) {
        Partida partida = repository.findById(id)
                .orElseThrow(() -> new PartidaNaoEncontradaException("Partida não encontrada."));

        if (partida.getStatus() != StatusPartida.EM_ANDAMENTO)
            throw new PartidaEncerradaException("A partida já foi encerrada.");

        if (partida.getTurnoAtual() != simbolo)
            throw new JogadaInvalidaException("Não é a vez desse jogador.");

        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2)
            throw new JogadaInvalidaException("Linha ou coluna inválida.");

        if (!partida.posicaoLivre(linha, coluna))
            throw new JogadaInvalidaException("Posição já ocupada.");

        partida.marcarPosicao(linha, coluna, simbolo);

        if (partida.verificarVitoria(simbolo)) {
            partida.setStatus(StatusPartida.VITORIA);

            if (simbolo == Simbolo.X)
                partida.setVencedor(partida.getJogadorX());
            else
                partida.setVencedor(partida.getJogadorO());

        } else if (partida.tabuleiroCheio()) {
            partida.setStatus(StatusPartida.EMPATE);

        } else {
            partida.alternarTurno();
        }

        return repository.save(partida);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
