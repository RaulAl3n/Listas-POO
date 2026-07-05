package JogoDaVelha.demo.exception;

public class PartidaNaoEncontradaException extends RuntimeException {
    public PartidaNaoEncontradaException(String mensagem) {
        super(mensagem);
    }

}