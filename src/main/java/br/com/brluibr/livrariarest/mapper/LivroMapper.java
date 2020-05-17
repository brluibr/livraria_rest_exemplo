package br.com.brluibr.livrariarest.mapper;

import br.com.brluibr.livrariarest.dto.LivroDTO;
import br.com.brluibr.livrariarest.model.Livro;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LivroMapper {

    LivroMapper INSTANCE = Mappers.getMapper(LivroMapper.class);

    Livro toModel (LivroDTO livroDTO);

    LivroDTO toDTO(Livro livro);
}
