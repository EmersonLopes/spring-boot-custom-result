package com.example.custom_result.service;

import com.example.custom_result.domain.IEmbalagemCount;
import com.example.custom_result.domain.VwEmbalagem;
import com.example.custom_result.repository.EmbalagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmbalagemService {

    @Autowired
    private EmbalagemRepository embalagemRepository;

    public List<VwEmbalagem> findAll(){
        return embalagemRepository.findAll();
    }

    public List<VwEmbalagem> findByCodProduto(int codProduto){
        return embalagemRepository.findByCodProduto(codProduto);
    }

    public List<IEmbalagemCount> countTotalEmbalagemInterface(){
        return embalagemRepository.countTotalEmbalagemInterface();
    }
}
