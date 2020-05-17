package br.com.brluibr.livrariarest.controllers;

import br.com.brluibr.livrariarest.dto.MessagemRespostaDTO;
import br.com.brluibr.livrariarest.model.Livro;
import br.com.brluibr.livrariarest.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @PostMapping
    public MessagemRespostaDTO cadastrar(@RequestBody Livro livro){
        Livro livroCadastrado = livroRepository.save(livro);
        return MessagemRespostaDTO.builder()
                .mensagem("livro cadastrado com sucesso, id = " + livroCadastrado.getId())
                .build();
    }
}
