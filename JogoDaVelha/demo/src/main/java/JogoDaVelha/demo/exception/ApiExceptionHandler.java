package JogoDaVelha.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(PartidaNaoEncontradaException.class)
    public ResponseEntity<String> tratarPartidaNaoEncontrada(
            PartidaNaoEncontradaException ex) {

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(ex.getMessage());
    }

    @ExceptionHandler(PartidaEncerradaException.class)
    public ResponseEntity<String> tratarPartidaEncerrada(
            PartidaEncerradaException ex) {

        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(ex.getMessage());
    }

    @ExceptionHandler(JogadaInvalidaException.class)
    public ResponseEntity<String> tratarJogadaInvalida(
            JogadaInvalidaException ex) {

        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(ex.getMessage());
    }

}