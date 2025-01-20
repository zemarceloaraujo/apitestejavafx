package com.br.apitestezemarcelo.repository;

import com.br.apitestezemarcelo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    @Query(value = "select p from Produto p where p.codigo=:codigo")
    Optional<Produto> consultar(@Param("codigo") Integer codigo);
}
