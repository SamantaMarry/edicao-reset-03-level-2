package br.com.cwi.reset.samantamarry.apiresetflix.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ListaVaziaException extends RuntimeException{
    public ListaVaziaException(String message) {
        super(message);
    }
}