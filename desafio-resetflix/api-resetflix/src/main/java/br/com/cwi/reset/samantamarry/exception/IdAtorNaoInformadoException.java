package br.com.cwi.reset.samantamarry.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class IdAtorNaoInformadoException extends CampoNaoInformadoException {
    public IdAtorNaoInformadoException() {
        super("idAtor");
    }
}
