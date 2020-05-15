package br.com.brluibr.livrariarest.model;

import javax.persistence.*;

@Entity
@Data
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false)
    private Integer paginas;

    @Column(nullable = false)
    private Integer capitulos;

    @Column(nullable = false)
    private String isbn;

    @Column(name = "nome_autor", nullable = false)
    private String nomeAutor;

    @ManyToOne(fetch = FetchType.LAZY
            , cascade = {CascadeType.PERSIST
            , CascadeType.MERGE
            , CascadeType.REMOVE})
    @JoinColumn(name = "autor_id")
    private Autor autor;

}
