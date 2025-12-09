package br.com.hugomachadodev.projeto_sala_de_aula.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class ForbidenServiceException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ForbidenServiceException(String message) {
        super(message);
    }
}
