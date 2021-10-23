package br.com.cwi.reset.samantamarry.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DataCriacaoNaoInformadaException extends CampoNaoInformadoException {
    public DataCriacaoNaoInformadaException() {
        super("dataCriacao");
    }
}
