package com.example.crudproject.controller;

import com.example.crudproject.model.Produto;
import com.example.crudproject.service.ProdutoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> getAllProducts() {
        return produtoService.findAll();
    }

    @PostMapping
    public Produto createProduct(@RequestBody Produto produto) {
        return produtoService.save(produto);
    }

    @GetMapping("/{id}")
    public Produto getProductById(@PathVariable Long id) {
        return produtoService.findById(id);
    }

    @PutMapping("/{id}")
    public Produto updateProduct(@PathVariable Long id, @RequestBody Produto produto) {
        Produto existingProduct = produtoService.findById(id);
        if (existingProduct == null) {
            return null;
        } else {
            existingProduct.setNome(produto.getNome());
            existingProduct.setPreco(produto.getPreco());
            return produtoService.save(existingProduct);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        produtoService.deleteById(id);
    }
}
