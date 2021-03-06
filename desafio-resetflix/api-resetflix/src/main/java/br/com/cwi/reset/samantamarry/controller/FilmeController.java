package br.com.cwi.reset.samantamarry.controller;

import br.com.cwi.reset.samantamarry.model.Filme;
import br.com.cwi.reset.samantamarry.request.FilmeRequest;
import br.com.cwi.reset.samantamarry.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarFilme(@RequestBody @Valid FilmeRequest filmeRequest) throws Exception {
        filmeService.criarFilme(filmeRequest);
    }

    @GetMapping
    public List<Filme> consultarFilmes(
            @RequestParam @Valid String nomeFilme,
            @RequestParam @Valid String nomeDiretor,
            @RequestParam @Valid String nomePersonagem,
            @RequestParam @Valid String nomeAtor) throws Exception {
        return filmeService.consultarFilmes(nomeFilme, nomeDiretor, nomePersonagem, nomeAtor);
    }
}
