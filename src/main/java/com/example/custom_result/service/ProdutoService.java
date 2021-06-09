package com.example.custom_result.service;

import com.example.custom_result.domain.Produto;
import com.example.custom_result.domain.VwEmbalagem;
import com.example.custom_result.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }
}
