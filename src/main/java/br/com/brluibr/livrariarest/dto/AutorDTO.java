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
public class AutorDTO {

    private Long id;

    @NotBlank
    @Size(max = 200)
    private String nome;

    @NotNull
    @Size(max = 130)
    private int idade;
}
