package br.com.brluibr.livrariarest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class LivroNaoEncontradoException extends RuntimeException {

    public LivroNaoEncontradoException (Long id) {
        super(String.format("Livro não encontrado, id = " + id));
    }

}
