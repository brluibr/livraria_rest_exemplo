package br.com.brluibr.livrariarest.repository;

import br.com.brluibr.livrariarest.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
