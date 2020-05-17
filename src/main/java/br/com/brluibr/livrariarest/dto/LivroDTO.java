package br.com.brluibr.livrariarest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LivroDTO {

    private Long id;

    @NotBlank
    @Size(max = 80)
    private String nome;

    @NotNull
    private Integer paginas;

    @NotNull
    private Integer capitulos;

    @NotBlank
    @Size(max = 100)
    private String isbn;

    @NotBlank
    @Size(max = 100)
    private String editora;
}