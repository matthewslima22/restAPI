package com.desafio3.apirest.repository;

import com.desafio3.apirest.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

    Produto findByID(long id);


}
