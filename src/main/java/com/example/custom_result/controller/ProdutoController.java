package com.example.custom_result.controller;

import com.example.custom_result.domain.Produto;
import com.example.custom_result.domain.VwEmbalagem;
import com.example.custom_result.service.EmbalagemService;
import com.example.custom_result.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/findAll")
    public List<Produto> findAll(){
        return produtoService.findAll();
    }

}
