package br.com.prospertech.repository;

import br.com.prospertech.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByNome(String nome);

    List<Produto> findByPrecoLessThan(Double preco);

    List<Produto> findByPrecoGreaterThan(Double preco);
}