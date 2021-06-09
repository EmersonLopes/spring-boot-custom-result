package com.example.custom_result.controller;

import com.example.custom_result.domain.IEmbalagemCount;
import com.example.custom_result.domain.VwEmbalagem;
import com.example.custom_result.service.EmbalagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/embalagens")
public class EmbalagemController {

    @Autowired
    private EmbalagemService embalagemService;

    @GetMapping("/findAll")
    public List<VwEmbalagem> findAll(){
        return embalagemService.findAll();
    }

    @GetMapping("/findByCodProduto/{codProduto}")
    public List<VwEmbalagem> findByCodProduto(@PathVariable("codProduto") int codProduto){
        return embalagemService.findByCodProduto(codProduto);
    }

    @GetMapping("/countEmbalagem")
    public List<IEmbalagemCount> countTotalEmbalagemInterface(){
        return embalagemService.countTotalEmbalagemInterface();
    }
}
