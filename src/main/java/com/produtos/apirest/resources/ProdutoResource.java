package com.produtos.apirest.resources;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api")
public class ProdutoResource {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping(value = "/produtos")
    public List<Produto> listaProdutos(){
        return produtoRepository.findAll();
    }

    @GetMapping(value = "/produto/{id}")
    public Produto produtoUnico(@PathVariable(value = "id") long id){
        return produtoRepository.findById(id);
    }

    @PostMapping(value = "/produto")
    public Produto salvaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deletaProduto(@PathVariable(value = "id") long id){
        produtoRepository.deleteById(id);
    }

    @PutMapping(value = "/produto")
    public Produto atualizaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

}
