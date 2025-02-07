package io.github.springbootexpert.produtosapi.repository;

import io.github.springbootexpert.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
