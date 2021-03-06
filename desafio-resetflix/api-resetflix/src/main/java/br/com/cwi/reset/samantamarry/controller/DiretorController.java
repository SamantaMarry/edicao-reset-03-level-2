package br.com.cwi.reset.samantamarry.controller;

import br.com.cwi.reset.samantamarry.model.Ator;
import br.com.cwi.reset.samantamarry.model.Diretor;
import br.com.cwi.reset.samantamarry.request.DiretorRequest;
import br.com.cwi.reset.samantamarry.service.DiretorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/diretores")
public class DiretorController {

    @Autowired
    private DiretorService diretorService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarDiretor(@RequestBody @Valid DiretorRequest diretorRequest) throws Exception {
        diretorService.cadastrarDiretor(diretorRequest);
    }

    @GetMapping
    public List<Diretor> listarDiretores(@RequestParam String filtroNome) throws Exception {
        return diretorService.listarDiretores(filtroNome);
    }

    @GetMapping(path = "/{id}")
    public Diretor consultarDiretor(@PathVariable @Valid Integer id) throws Exception {
        return diretorService.consultarDiretor(id);
    }
}
