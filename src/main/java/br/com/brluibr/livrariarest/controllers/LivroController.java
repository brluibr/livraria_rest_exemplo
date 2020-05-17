package br.com.brluibr.livrariarest.controllers;

import br.com.brluibr.livrariarest.dto.LivroDTO;
import br.com.brluibr.livrariarest.dto.MessagemRespostaDTO;
import br.com.brluibr.livrariarest.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping
    public MessagemRespostaDTO cadastrar(@RequestBody @Valid LivroDTO livroDTO){
        return livroService.cadastrar(livroDTO);
    }

    @GetMapping("/{id}")
    public LivroDTO buscarPorId(@PathVariable Long id){
        return livroService.buscarPorId(id);
    }
}
