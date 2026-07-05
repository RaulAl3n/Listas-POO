package JogoDaVelha.demo.exception;

public class JogadaInvalidaException extends RuntimeException { 
    public JogadaInvalidaException(String mensagem) {
        super(mensagem);
    }

}