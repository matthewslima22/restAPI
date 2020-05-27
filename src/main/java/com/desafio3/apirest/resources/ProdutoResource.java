package com.desafio3.apirest.resources;

import com.desafio3.apirest.models.Produto;
import com.desafio3.apirest.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api")
public class ProdutoResource {
    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    public List<Produto> listaProdutos(){
        return produtoRepository.findAll();
    }
    @GetMapping("/produtos/{id}")
    public Produto listaProdutoUnico(@PathVariable(value="id")long id){
        return produtoRepository.findById(id);
    }
    @PostMapping("/produto")
    public Produto salvaProduto(@RequestBody Produto produto){
    return produtoRepository.save(produto);
    }
    @PostMapping("/produto")
    public void deletaProduto(@RequestBody Produto produto){
        produtoRepository.delete(produto);
    }
    @PutMapping("/produto")
    public Produto atualizaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }
}
