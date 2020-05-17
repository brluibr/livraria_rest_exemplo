package br.com.brluibr.livrariarest.service;

import br.com.brluibr.livrariarest.dto.MessagemRespostaDTO;
import br.com.brluibr.livrariarest.model.Livro;
import br.com.brluibr.livrariarest.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public MessagemRespostaDTO cadastrar(Livro livro){
        Livro livroCadastrado = livroRepository.save(livro);
        return MessagemRespostaDTO.builder()
                .mensagem("livro cadastrado com sucesso, id = " + livroCadastrado.getId())
                .build();
    }

}
