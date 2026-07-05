package JogoDaVelha.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import JogoDaVelha.demo.model.Partida;
import JogoDaVelha.demo.model.Simbolo;
import JogoDaVelha.demo.model.StatusPartida;

@SpringBootTest
public class PartidaServiceTest {

    @Autowired
    private PartidaService service;

    @Test
    void criarPartida() {
        Partida partida = service.criar("Ana", "Bruno");

        assertNotNull(partida);
        assertEquals("Ana", partida.getJogadorX().getNome());
        assertEquals("Bruno", partida.getJogadorO().getNome());
        assertEquals(StatusPartida.EM_ANDAMENTO, partida.getStatus());
        assertEquals(Simbolo.X, partida.getTurnoAtual());
    }

    @Test
    void primeiraJogadaEhDoX() {
        Partida partida = service.criar("Ana", "Bruno");

        partida = service.jogar(partida.getId(), Simbolo.X, 0, 0);

        assertEquals(Simbolo.O, partida.getTurnoAtual());
    }

    @Test
    void alternaTurnos() {
        Partida partida = service.criar("Ana", "Bruno");

        partida = service.jogar(partida.getId(), Simbolo.X, 0, 0);

        assertEquals(Simbolo.O, partida.getTurnoAtual());

        partida = service.jogar(partida.getId(), Simbolo.O, 1, 1);

        assertEquals(Simbolo.X, partida.getTurnoAtual());
    }

    @Test
    void vitoriaLinha() {
        Partida partida = service.criar("Ana", "Bruno");

        partida = service.jogar(partida.getId(), Simbolo.X, 0, 0);
        partida = service.jogar(partida.getId(), Simbolo.O, 1, 0);

        partida = service.jogar(partida.getId(), Simbolo.X, 0, 1);
        partida = service.jogar(partida.getId(), Simbolo.O, 1, 1);

        partida = service.jogar(partida.getId(), Simbolo.X, 0, 2);

        assertEquals(StatusPartida.VITORIA, partida.getStatus());
        assertEquals("Ana", partida.getVencedor().getNome());
    }

    @Test
    void vitoriaColuna() {
        Partida partida = service.criar("Ana", "Bruno");

        partida = service.jogar(partida.getId(), Simbolo.X, 0, 0);
        partida = service.jogar(partida.getId(), Simbolo.O, 0, 1);

        partida = service.jogar(partida.getId(), Simbolo.X, 1, 0);
        partida = service.jogar(partida.getId(), Simbolo.O, 1, 1);

        partida = service.jogar(partida.getId(), Simbolo.X, 2, 0);

        assertEquals(StatusPartida.VITORIA, partida.getStatus());
    }

    @Test
    void vitoriaDiagonalPrincipal() {
        Partida partida = service.criar("Ana", "Bruno");

        partida = service.jogar(partida.getId(), Simbolo.X, 0, 0);
        partida = service.jogar(partida.getId(), Simbolo.O, 0, 1);

        partida = service.jogar(partida.getId(), Simbolo.X, 1, 1);
        partida = service.jogar(partida.getId(), Simbolo.O, 0, 2);

        partida = service.jogar(partida.getId(), Simbolo.X, 2, 2);

        assertEquals(StatusPartida.VITORIA, partida.getStatus());
    }

    @Test
    void empate() {
        Partida partida = service.criar("Ana", "Bruno");

        partida = service.jogar(partida.getId(), Simbolo.X, 0, 0);
        partida = service.jogar(partida.getId(), Simbolo.O, 0, 1);

        partida = service.jogar(partida.getId(), Simbolo.X, 0, 2);
        partida = service.jogar(partida.getId(), Simbolo.O, 1, 1);

        partida = service.jogar(partida.getId(), Simbolo.X, 1, 0);
        partida = service.jogar(partida.getId(), Simbolo.O, 1, 2);

        partida = service.jogar(partida.getId(), Simbolo.X, 2, 1);
        partida = service.jogar(partida.getId(), Simbolo.O, 2, 0);

        partida = service.jogar(partida.getId(), Simbolo.X, 2, 2);

        assertEquals(StatusPartida.EMPATE, partida.getStatus());
    }

    @Test
    void listarPartidas() {
        service.criar("A", "B");
        service.criar("C", "D");

        assertTrue(service.listar().size() >= 2);
    }

    @Test
    void excluirPartida() {
        Partida partida = service.criar("Ana", "Bruno");

        Long id = partida.getId();

        service.excluir(id);

        assertNull(service.buscarPorId(id));
    }
}