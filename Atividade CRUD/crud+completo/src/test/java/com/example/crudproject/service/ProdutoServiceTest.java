package com.example.crudproject.service;

import com.example.crudproject.model.Produto;
import com.example.crudproject.repository.ProdutoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class ProdutoServiceTest {

    @Mock
    private ProdutoRepository produtoRepository;

    @InjectMocks
    private ProdutoService produtoService;

    @Test
    void saveShouldRejectNegativePrice() {
        Produto produto = new Produto();
        produto.setNome("Caneta");
        produto.setPreco(-10.0);

        assertThrows(IllegalArgumentException.class, () -> produtoService.save(produto));

        verify(produtoRepository, never()).save(produto);
    }
}
