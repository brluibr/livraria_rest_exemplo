package br.com.brluibr.livrariarest.service;

import br.com.brluibr.livrariarest.dto.LivroDTO;
import br.com.brluibr.livrariarest.dto.MessagemRespostaDTO;
import br.com.brluibr.livrariarest.mapper.LivroMapper;
import br.com.brluibr.livrariarest.model.Livro;
import br.com.brluibr.livrariarest.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    private final LivroMapper livroMapper = LivroMapper.INSTANCE;

    public MessagemRespostaDTO cadastrar(LivroDTO livroDTO){

        Livro livroParaCadastrar = livroMapper.toModel(livroDTO);

        Livro livroCadastrado = livroRepository.save(livroParaCadastrar);
        return MessagemRespostaDTO.builder()
                .mensagem("livro cadastrado com sucesso, id = " + livroCadastrado.getId())
                .build();
    }

}
